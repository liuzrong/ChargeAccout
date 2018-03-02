package com.liuzrong.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.liuzrong.model.Bill;

public interface BillRepository extends JpaRepository<Bill, Long> {
	public List<Bill> findAll();
	
	
	

}
