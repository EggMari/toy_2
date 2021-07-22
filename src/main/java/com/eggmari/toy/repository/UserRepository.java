package com.eggmari.toy.repository;

import com.eggmari.toy.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    int countUserByUserId(String Id);

}
