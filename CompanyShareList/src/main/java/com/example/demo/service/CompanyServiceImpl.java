package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Company;
import com.example.demo.repository.CompanyRepository;
@Service
public class CompanyServiceImpl implements CompanyServiceInterface {

	@Autowired
	private CompanyRepository companyRepository;



	@Override
	public List<Company> getAll() {
		// TODO Auto-generated method stub
		return companyRepository.findAll();
	}



	  @Override
	    public void deleteCompany(long companyId) {
	        companyRepository.deleteById(companyId);
	        
	    }


}
