package com.eggmari.toy.repository;


import com.eggmari.toy.dto.OilPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface OilPriceRepository extends JpaRepository<OilPrice, Long> {

    List<OilPrice> findBySaleArea(String saleArea);
}
