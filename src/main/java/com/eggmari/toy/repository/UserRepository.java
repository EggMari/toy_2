package com.eggmari.toy.repository;

import com.eggmari.toy.dto.ToyUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<ToyUser, Long> {

    int countUserByUserId(String Id);

}
