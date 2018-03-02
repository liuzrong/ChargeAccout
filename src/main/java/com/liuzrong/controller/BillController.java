package com.liuzrong.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.liuzrong.model.Bill;
import com.liuzrong.service.BillService;

@RestController
@RequestMapping("/bill")
public class BillController {
	
	
	@Autowired
	private BillService billService;
	
	@RequestMapping(value="/add",method={RequestMethod.POST})
	public String addBill(@RequestBody  @Valid Bill bill){
		int res = billService.saveBill(bill);
		if(res ==1 ){
			return "{\"code\":1,\"msg\":\"success\"}";
		}
		
		return "{\"code\":0,\"msg\":\"error\"}";
	}
	
	

}
