package com.eggmari.toy.repository;


import com.eggmari.toy.dto.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {
    @Query("SELECT menuName, menuSrc FROM Menu")
    List<Menu> findMenus();

}
