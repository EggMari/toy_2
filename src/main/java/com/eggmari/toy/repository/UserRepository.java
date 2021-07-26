package com.eggmari.toy.repository;

import com.eggmari.toy.dto.ToyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<ToyUser, Long> {

    int countUserByUserId(String Id);
    @Query("SELECT userId from ToyUser where userId = ?1 and userPwd = ?2")
    String findToyUserByUserIdAndUserPwd(String userId, String userPwd);
}
/*
*   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="user_idx")
    private int userIdx;
    @Column(name ="user_id",length = 20, nullable = false)
    private String userId;
    @Column(name ="user_pwd",length = 20, nullable = false)
    private String userPwd;
    @Column(name ="point",length = 20, nullable = false)
    private int point;*/