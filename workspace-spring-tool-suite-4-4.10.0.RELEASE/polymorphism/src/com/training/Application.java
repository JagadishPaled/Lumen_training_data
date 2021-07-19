package com.training;

import com.training.model.MarutiCar;
import com.training.model.ToyotaCar;
import com.training.services.PrintQuote;

public class Application {

	public static void main(String[] args) {
		
		
		PrintQuote quotePrinter = new PrintQuote();
		
		quotePrinter.printQuote(new MarutiCar());
		
		
		quotePrinter.printQuote(new ToyotaCar());
		
	}
}
