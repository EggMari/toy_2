package com.eggmari.toy.service;

import com.eggmari.toy.dto.ToyUser;
import com.eggmari.toy.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;

    public int InsertUser(String id, String pwd){
        ToyUser user = new ToyUser(id, pwd);

        userRepository.save(user);


        return 0;
    }
}
