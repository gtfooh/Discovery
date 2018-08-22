package com.example.demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DAO.IncomeServiceDAO;

@RestController
@CrossOrigin("*")
public class IncomeWS {
	
	@Autowired
	IncomeServiceDAO dao;
	
	@RequestMapping (value = "/getall")
	public List<Income> getAllIncomes() {
		return dao.viewAllIncome();
	}
	
	@RequestMapping (value = "/get-by-customer/{cust_name}")
	public List<Income> getIncomeByCustomerId(@PathVariable("cust_name")String customerName){
		return dao.viewIncomeByCustomer(customerName);
	}
	
	@RequestMapping (value = "/get-by-company/{comp_name}")
	public List<Income> getIncomeByCompanyId(@PathVariable("comp_name")String companyName){
		return dao.viewIncomeByCompany(companyName);
	}
	
	@RequestMapping (value = "/add" , method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addIncome(@RequestBody Income income) {
		dao.storeIncome(income);
	}


}
