package com.example.demo.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Income;

@Component
public class IncomeServiceDAO {

	@Autowired
	IncomeRepository incomeRepo;
	
	
	public void storeIncome(Income income) {
		incomeRepo.save(income);
	}

	public List<Income> viewAllIncome() {
		List<Income> incomeList = (List<Income>) incomeRepo.findAll();
		return incomeList;
	}

	public List<Income> viewIncomeByCustomer(String customerName) {
		List<Income> incomeList = incomeRepo.findIncomeByPayerName(customerName);
		return incomeList;
	}

	public List<Income> viewIncomeByCompany(String companyName) {
		List<Income> incomeList = incomeRepo.findIncomeByPayerName(companyName);
		return incomeList;
	}

}
