package com.training;

public class Invoice {
   
	private  int invoiceNumber;
	private  double quantity;
	private  double ratePerUnit;
	
	public Invoice() {
		super();
	}
	public Invoice(int invoiceNumber, double quantity, double ratePerUnit) {
		super();
		this.invoiceNumber = invoiceNumber;
		this.quantity = quantity;
		this.ratePerUnit = ratePerUnit;
	}
	public int getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public double getRatePerUnit() {
		return ratePerUnit;
	}
	public void setRatePerUnit(double ratePerUnit) {
		if(ratePerUnit>0) {
		this.ratePerUnit = ratePerUnit;
		} else {
			throw new RuntimeException("Invalid Rate Per Unit");
		}
		
	}
	public double calculate() {
		
		double amount = this.ratePerUnit * this.quantity;
		
		return amount-discount();
	}
	private double discount() {
		
		double discount = 100.00;
		
		if(this.ratePerUnit >= 10000) {
			
			discount = 150.00;
		}
		
		return discount;
	}
	@Override
	public String toString() {
		return this.invoiceNumber +","+this.quantity+","+this.ratePerUnit;
	}
	
}
