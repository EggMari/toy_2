package com.eggmari.toy.repository;


import com.eggmari.toy.dto.OilPriceDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OilPriceRepository extends JpaRepository<OilPriceDto, Long> {
  //  List<OilPriceDto> findByOil_price(String oil_price);
}
