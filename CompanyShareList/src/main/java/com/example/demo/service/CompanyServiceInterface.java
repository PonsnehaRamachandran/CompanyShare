package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Company;


public interface CompanyServiceInterface{
	
	List<Company> getAll();
	public void deleteCompany(long companyId);
	
	
	

}
