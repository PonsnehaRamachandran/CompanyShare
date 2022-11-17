

package com.example.demo.web;

import com.example.demo.entity.Company;
import com.example.demo.service.CompanyServiceImpl;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequiredArgsConstructor
public class CompanyController {

	@Autowired
	private CompanyServiceImpl companyservice;

	
	@GetMapping("/")
	public String homePage(Model model) {
		model.addAttribute("stock",companyservice.getAll());
		return "companystock";
	}
	 @GetMapping("/delete-company")
	    public String deleteCompany(
	            @RequestParam long id
	    ) {
	        System.out.println(id);
	        companyservice.deleteById(id);
	        return "redirect:/companystock";
	    }


}



