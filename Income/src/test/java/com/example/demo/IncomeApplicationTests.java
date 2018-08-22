package com.example.demo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.DAO.IncomeRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IncomeApplicationTests {

	
	@Autowired
	IncomeRepository repo;
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void test01() throws ParseException {
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
		Income inc = new Income();
		inc.setAmount(100);
		inc.setDescription("CUSTOMER_PURCHASE");
		inc.setPayDate(df.parse("2018-08-20"));
		inc.setPayerName("Dor");
		
		repo.save(inc);
		
		
	}

}
