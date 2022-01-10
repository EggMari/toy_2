package com.eggmari.toy.service;

import com.eggmari.toy.dto.ToyUser;
import com.eggmari.toy.repository.UserRepository;
import com.eggmari.toy.util.Crypto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;


    public int InsertUser(String id, String pwd) throws GeneralSecurityException, UnsupportedEncodingException {
        Crypto crypto = new Crypto();
        pwd = crypto.encrypt(pwd);

        ToyUser user = new ToyUser(id, pwd, 0);//initial point 0

        userRepository.save(user);


        return 0;
    }

    public String logInToy(String id, String pwd) throws UnsupportedEncodingException, GeneralSecurityException {
        Crypto crypto = new Crypto();
        pwd = crypto.encrypt(pwd);
        String  user = userRepository.findToyUserByUserIdAndUserPwd(id, pwd);

        return user;
    }
}
