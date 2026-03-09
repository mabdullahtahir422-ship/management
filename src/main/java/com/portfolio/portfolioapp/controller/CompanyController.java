/*package com.portfolio.portfolioapp.controller;

import com.portfolio.portfolioapp.entity.Company;
import com.portfolio.portfolioapp.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyRepository companyRepository;

    @PostMapping("/save")
    public Company saveCompany(@RequestBody Company company) {
        return companyRepository.save(company);
    }

    @GetMapping("/all")
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }
}*/
package com.portfolio.portfolioapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.portfolio.portfolioapp.entity.Company;
import com.portfolio.portfolioapp.service.CompanyService;

@Controller
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping("/companies")
    public String viewCompanyList(Model model) {
        model.addAttribute("companies", companyService.listAll());
        return "company-list";
    }

    @GetMapping("/companies/new")
    public String showNewCompanyForm(Model model) {
        model.addAttribute("company", new Company());
        return "company-form";
    }

    @PostMapping("/companies/save")
    public String saveCompany(@ModelAttribute("company") Company company) {
        companyService.save(company);
        return "redirect:/companies";
    }
}
