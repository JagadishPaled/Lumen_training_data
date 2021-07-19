package com.training.services;

import com.training.Invoice;
import com.training.ifaces.CrudRepository;
import java.util.*;
public class InvoiceService implements CrudRepository<Invoice> {
	
	private List<Invoice> invoiceList;
	
	
	public InvoiceService() {
		super();
     this.invoiceList =new ArrayList<>();
	}

	@Override
	public boolean save(Invoice entity) {
		return this.invoiceList.add(entity);
	}

	@Override
	public List<Invoice> findAll() {
	
		return this.invoiceList;
	}

}
