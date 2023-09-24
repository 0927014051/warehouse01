package com.javaweb.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaweb.entity.box;

@Repository
public interface BoxRepo extends JpaRepository<box, Long>{

}
