package com.eggmari.toy.dto;

import lombok.*;
import org.hibernate.annotations.GenerationTime;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Getter
@Setter
@AllArgsConstructor
@Entity
public class OilPrice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="oil_idx")
    private int oilIdx;
    @Column(name ="oil_kind",length = 20, nullable = false)
    private String oilKind;
    @Column(name ="oil_price",length = 20, nullable = false)
    private double oilPrice;
    @Column(name ="oil_price_Increase",length = 20, nullable = false)
    private double oilPriceIncrease;
    @Column(name ="sale_area", length = 20, nullable = false)
    private String saleArea;

    @Column
    private LocalDate save_date;

    public OilPrice(int oilIdx, String oilKind, String saleArea, double oilPrice, double oilPriceIncrease)
    {
        this.oilIdx = oilIdx;
        this.oilKind = oilKind;
        this.saleArea = saleArea;
        this.oilPrice = oilPrice;
        this.oilPriceIncrease = oilPriceIncrease;
    }
    @PrePersist
    public void createdAt() {
        this.save_date = LocalDate.now();
    }




}
