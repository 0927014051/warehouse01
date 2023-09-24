package com.javaweb.service;

import java.util.List;
import java.util.Optional;

import com.javaweb.entity.staffs;

public interface StaffService {
	List<staffs> findAll();
	staffs findUserAccount(String username);
}
