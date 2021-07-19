package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Invoice {
	Product product;
	Customer customer;
	
	@Autowired
	public Invoice(@Qualifier("fridge") Product product, @Qualifier("ram")Customer customer) {
		super();
		this.customer=customer;
		this.product = product;
		
	}
}
