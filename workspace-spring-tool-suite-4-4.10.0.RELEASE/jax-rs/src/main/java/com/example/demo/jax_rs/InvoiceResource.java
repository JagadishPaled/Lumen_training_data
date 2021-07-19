package com.example.demo.jax_rs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("invoices")
public class InvoiceResource {

	
	@GET
	public String getInvoice() {
		
		return "Invoice 101 amount 2000";
	}
}
