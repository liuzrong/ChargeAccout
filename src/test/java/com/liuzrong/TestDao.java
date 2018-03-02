package com.liuzrong;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.liuzrong.dao.BillRepository;
import com.liuzrong.model.Bill;
import com.liuzrong.service.BillService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=App.class)
public class TestDao {
	
	@Autowired
	BillRepository billRepository;
	
	@Autowired
	BillService billService;

	@Test
	public void test1(){
		Bill a = new Bill();
		a.setCredate("credate");
		a.setId(23l);
		a.setRemark("remark");
		a.setTypeid(300000000000l);
		a.setUserid(1l);
		a.setVal(10d);
		
		int account = billService.saveBill(a);
		System.out.println("typeId:"+account);
		
		
		
	}

}
