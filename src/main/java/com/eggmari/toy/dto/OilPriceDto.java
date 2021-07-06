package com.eggmari.toy.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Entity
public class OilPriceDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int oil_idx;
    @Column(length = 20, nullable = false)
    private String oil_kind;
    @Column(length = 20, nullable = false)
    private double oil_price;
    @Column(length = 20, nullable = false)
    private double oil_price_Increase;
    @Column(length = 20, nullable = false)
    private String sale_area;


}
