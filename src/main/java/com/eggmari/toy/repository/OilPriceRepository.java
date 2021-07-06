package com.eggmari.toy.repository;


import com.eggmari.toy.dto.OilPriceDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OilPriceRepository extends JpaRepository<OilPriceDto, Long> {

}
