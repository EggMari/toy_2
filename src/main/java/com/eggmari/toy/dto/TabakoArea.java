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
public class TabakoArea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="tabako_idx")
    private int tabakoIdx;
    @Column(name ="longitude",length = 20, nullable = false)
    private double longitude;
    @Column(name ="latitude",length = 20, nullable = false)
    private double latitude;
    @Column(name ="area_name",length = 20, nullable = false)
    private String areaName;
    @Column(name ="area_content",length = 20, nullable = false)
    private String areaContent;
    @Column(name ="report_cnt",length = 20, nullable = false)
    private int reportCnt;
    @Column(name ="good_cnt",length = 20, nullable = false)
    private int goodCnt;
    @Column(name ="user_idx",length = 20, nullable = false)
    private int userIdx;


    @Column
    private LocalDate save_date;

    @PrePersist
    public void createdAt() {
        this.save_date = LocalDate.now();
    }




}
