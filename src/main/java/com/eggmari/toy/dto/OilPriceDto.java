package com.eggmari.toy.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OilPriceDto {
    private String oil_idx;
    private String oil_kind;
    private double oil_price;
    private double oil_price_Increase;
    private String sale_area;


}
