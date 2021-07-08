package com.eggmari.toy.dto;

import lombok.*;
import org.hibernate.annotations.GenerationTime;

import javax.persistence.*;
import java.sql.Timestamp;
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
    private int oil_idx;
    @Column(length = 20, nullable = false)
    private String oil_kind;
    @Column(length = 20, nullable = false)
    private double oil_price;
    @Column(length = 20, nullable = false)
    private double oil_price_Increase;
    @Column(length = 20, nullable = false)
    private String sale_area;

    @Column
    private LocalDateTime save_date;

    public OilPrice(int oil_idx, String oil_kind, String sale_area, double oil_price, double oil_price_Increase)
    {
        this.oil_idx = oil_idx;
        this.oil_kind = oil_kind;
        this.sale_area = sale_area;
        this.oil_price = oil_price;
        this.oil_price_Increase = oil_price_Increase;
    }
    @PrePersist
    public void createdAt() {
        this.save_date = LocalDateTime.now();
    }


}
