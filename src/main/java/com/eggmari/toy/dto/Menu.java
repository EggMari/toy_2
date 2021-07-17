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
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="menu_idx")
    private int menuIdx;
    @Column(name ="menu_name",length = 20, nullable = false)
    private String menuName;
    @Column(name ="menu_src",length = 20, nullable = false)
    private String menuSrc;

    @Column
    private LocalDate save_date;

    public Menu(int menuIdx, String menuName, String menuSrc)
    {
        this.menuIdx = menuIdx;
        this.menuName = menuName;
        this.menuSrc = menuSrc;
    }
    @PrePersist
    public void createdAt() {
        this.save_date = LocalDate.now();
    }




}
