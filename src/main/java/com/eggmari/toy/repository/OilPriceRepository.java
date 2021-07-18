package com.eggmari.toy.repository;


import com.eggmari.toy.dto.OilPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface OilPriceRepository extends JpaRepository<OilPrice, Long> {

    List<OilPrice> findBySaleAreaOrderByOilIdxAsc(String saleArea);

    @Query("SELECT saleArea FROM OilPrice GROUP BY saleArea")
    List<String> findSaleAreaList();

    List<OilPrice> findTop7BySaleAreaOrderByOilIdxAsc(String saleArea);

    List<OilPrice> findTop14BySaleAreaOrderByOilIdxAsc(String saleArea);

    List<OilPrice> findTop28BySaleAreaOrderByOilIdxAsc(String saleArea);

}
