package com.liuzrong.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liuzrong.dao.BillRepository;
import com.liuzrong.model.Bill;

@Service
public class BillService {
	
	
	@Autowired
	private BillRepository billRepository;
	
	
	public int saveBill(Bill bill){
		if(billRepository.save(bill)!=null){
		    return 1;	
		}else{
			return 0;
		}
		
	}
	
	

}
