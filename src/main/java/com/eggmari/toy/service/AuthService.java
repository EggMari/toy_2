package com.eggmari.toy.service;

import com.eggmari.toy.dto.User;
import com.eggmari.toy.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;

    public int InsertUser(String id, String pwd){
        User user = new User(id, pwd);


        return 0;
    }
}
