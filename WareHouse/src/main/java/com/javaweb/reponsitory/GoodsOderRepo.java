package com.javaweb.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaweb.entity.goods_order;

@Repository
public interface GoodsOderRepo extends JpaRepository<goods_order, Long>{

}
