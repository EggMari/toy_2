package com.eggmari.toy.dto;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Getter
@Setter
@AllArgsConstructor
@Entity(name = "Oil_price")
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

    public OilPriceDto(String oil_kind, String sale_area, double oil_price, double oil_price_Increase)
    {
        this.oil_kind = oil_kind;
        this.sale_area = sale_area;
        this.oil_price = oil_price;
        this.oil_price_Increase = oil_price_Increase;
    }


}
