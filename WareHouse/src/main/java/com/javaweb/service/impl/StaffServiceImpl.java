package com.javaweb.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaweb.entity.staffs;
import com.javaweb.reponsitory.StaffRepo;
import com.javaweb.service.StaffService;

@Service
public class StaffServiceImpl implements StaffService {
	@Autowired
	private StaffRepo staffRepo;
	
	@Override
	public List<staffs> findAll(){
		return staffRepo.findAll();
	}
	
	@Override
	public staffs findUserAccount(String username){
		return staffRepo.findUserAccount(username);
	}

}
