package com.eggmari.toy.repository;


import com.eggmari.toy.dto.OilPrice;
import com.eggmari.toy.dto.TabakoArea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TabakoRepository extends JpaRepository<TabakoArea, Long> {
/*
* insert문 추가 예정
* */
}
