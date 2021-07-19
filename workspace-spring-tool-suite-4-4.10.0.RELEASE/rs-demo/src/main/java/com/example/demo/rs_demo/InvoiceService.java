package com.example.demo.rs_demo;
import java.util.*;

import com.example.demo.model.Invoice;
public class InvoiceService {

	List<Invoice> invList;
	
	
	public InvoiceService() {
		super();
		this.invList = new ArrayList<>();
		
		this.invList.add(new Invoice(102,"suresh",475757));
		this.invList.add(new Invoice(103,"sumesh",675757));
		
	}


	public List<Invoice> getInvoices(){
		
		
		return this.invList;
		
	}
}
