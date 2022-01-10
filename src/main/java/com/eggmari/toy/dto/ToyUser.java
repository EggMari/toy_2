package com.eggmari.toy.dto;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Getter
@Setter
@AllArgsConstructor
@Entity
public class ToyUser{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="user_idx")
    private int userIdx;
    @Column(name ="user_id",length = 20, nullable = false)
    private String userId;
    @Column(name ="user_pwd",length = 20, nullable = false)
    private String userPwd;
    @Column(name ="point",length = 20, nullable = false)
    private int point;

    @Column
    private LocalDate ins_date;

    public ToyUser(String userId, String userPwd, int point)
    {
        this.userId = userId;
        this.userPwd = userPwd;
        this.point = point;
    }


    @PrePersist
    public void createdAt() {
        this.ins_date = LocalDate.now();
    }

    @Override
    public String toString() {
        return "ToyUser{" +
                "userIdx=" + userIdx +
                ", userId='" + userId + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", point=" + point +
                ", ins_date=" + ins_date +
                '}';
    }
}
