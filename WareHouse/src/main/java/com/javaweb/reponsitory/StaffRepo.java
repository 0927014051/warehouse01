package com.javaweb.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.javaweb.entity.staffs;

@Repository
public interface StaffRepo extends JpaRepository<staffs, Long>{
	@Query(value = "SELECT * FROM staffs where email = ?1", nativeQuery = true)
	staffs findUserAccount(String email);

}
