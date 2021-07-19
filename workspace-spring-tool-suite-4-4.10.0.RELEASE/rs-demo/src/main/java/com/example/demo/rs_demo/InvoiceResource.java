package com.example.demo.rs_demo;

import java.util.List;

import com.example.demo.model.Invoice;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("invoices")
public class InvoiceResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Invoice> getInvoices() {
		
		InvoiceService service = new InvoiceService();

		return  service.getInvoices();
	}
}
