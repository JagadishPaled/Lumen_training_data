package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.models.Car;
import com.example.demo.repository.CustomerRepository;

@Controller
public class CustomerController {

	@Autowired
	private Car cus;
	
	@Autowired
	private CustomerRepository repo;

	@RequestMapping(value = "/customers", method = RequestMethod.GET)
	public String initForm(Model model) {

		model.addAttribute("command", cus);
		return "addcustomer";
	}
	
	@RequestMapping(value = "/customers", method = RequestMethod.POST)
	public String submitForm(@ModelAttribute("command") Car cus,Model model) {
		
		int rowAdded =repo.addCustomer(cus);
		model.addAttribute("rowAdded",rowAdded);
		System.out.println(cus);
		return "addcustomer";
	}
	@ModelAttribute("groups")
	public String[] brands() {
		
		return new String[] {"Maruti","Benz","Audi","Tata","Bugati","Lamburgini"};
	}
	@ModelAttribute("group")
	public String[] status() {
		
		return new String[] {"Sold","Unsold"};
	}
	
	@RequestMapping(value = "/customers/all", method = RequestMethod.GET)
	public String findAllCustomers(Model model) {
		
		List<Car> list=repo.getAllCustomers();
		model.addAttribute("list", list);
		return "showcustomer";
	}
	@ModelAttribute("totalBrand")
	public String[] brand(){
		String[] brandList = repo.getTotalBrand();
		return brandList;
	}
	@RequestMapping(value="/customers/SearchBrand", method = RequestMethod.GET)
	public String initBrand(Model model) {
		model.addAttribute("command",cus);
		return "searchBrand";
	}
	@RequestMapping(value="/customers/brand",method=RequestMethod.POST)	
	public String findCarsByBrand(@ModelAttribute("command") @RequestParam("brand")String brand, Model model)
	{
		List<Car> list = repo.getBrand(brand);
		
		model.addAttribute("list",list);
		return "brandBased";
	}
}
