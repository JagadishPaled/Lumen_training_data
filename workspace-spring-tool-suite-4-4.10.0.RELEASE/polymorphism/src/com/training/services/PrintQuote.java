package com.training.services;

import com.training.ifaces.Automobile;

public class PrintQuote {

	
	public void printQuote(Automobile poly) {
		
		System.out.println("Model:="+poly.getModel());
		System.out.println("Color:="+poly.getColor());
		System.out.println("Price :="+ poly.getPrice());
	}
}
