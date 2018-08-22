package com.example.demo.DAO;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Income;

public interface IncomeRepository extends CrudRepository <Income, Long> {
	
	public List<Income> findIncomeByPayerName(String payerName);
	
	
	

	
}
