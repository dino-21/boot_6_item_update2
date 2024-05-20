package com.shop.repository;

import com.shop.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository <Item, Long> {
    // 아이템의 이름으로 검색하는 메소드
    List<Item> findByItemNm(String itemNm);

    //가격이 특정 값보다 큰 아이템을 조회하는 메소드
    List<Item> findByPriceGreaterThan(int price);
}
