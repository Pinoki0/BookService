package com.bookweb.BookService;

import com.bookweb.BookService.Model.User;
import com.bookweb.BookService.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor;
import org.springframework.stereotype.Component;

import java.util.Map;


@Component
public class GooglePrincipalExtractor implements PrincipalExtractor {
    @Autowired
    private UserRepository userRepository;

    @Override
    public Object extractPrincipal(Map<String, Object> map) {
        String principalId = (String) map.get("id");
        User user = userRepository.findUserByPrincipalId(principalId);
        if(user == null) {

            user = new User();
            user.setPrincipalId(principalId);
            user.setEmail((String) map.get("email"));
            user.setName((String) map.get("name"));
            user.setPicture((String) map.get("picture"));
            user.setLoginType(UserLoginType.GOOGLE);
            userRepository.save(user);
        }

        return user;
        }

}

