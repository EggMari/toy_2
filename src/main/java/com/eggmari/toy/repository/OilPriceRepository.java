package com.eggmari.toy.repository;


import com.eggmari.toy.dto.OilPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OilPriceRepository extends JpaRepository<OilPrice, Long> {
  //  List<OilPriceDto> findByOil_price(String oil_price);
}
