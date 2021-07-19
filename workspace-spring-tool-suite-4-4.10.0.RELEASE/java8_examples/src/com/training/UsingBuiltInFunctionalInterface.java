package com.training;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class UsingBuiltInFunctionalInterface {

	public void usingPredicate() {
		
		Predicate<Double> checkHousingLoanEligibility = 
				(salaryPerMonth) -> {
					
					boolean result = false;
				
					if(salaryPerMonth>30000.00) {
					   result =true;
				  }
				
				return result;
	};

	 System.out.println("Ramesh with Salary 20000 Is Eligibile :"+ 
	                     checkHousingLoanEligibility.test(20000.00));

	 System.out.println("Suresh with Salary 80000 Is Eligibile :"+ 
	                  checkHousingLoanEligibility.test(80000.00));

	}

	public void usingConsumer() {
		
		List<String> names = new ArrayList<>();
		
		names.add("Anand");
		names.add("Zahir");
		names.add("Naveen");
		names.add("Ramesh");
		
		// consume takes argument but doesn't return 
//		Consumer<String> print = (name) -> System.out.println(name);
//		
//		names.forEach(print);
//		
		
		//Passing Method Reference
		
		names.forEach(System.out::println);
		
		names.forEach(MyClass::show);
		
		
	}
	
	public void usingFunction() {
		
		Function<Double,Double> currencyConverter =	 (inr) ->  inr/70;
		
		System.out.println("INR to USD" +currencyConverter.apply(100.00));
		
				 
				 
	}
	public static void main(String[] args) {
		
		UsingBuiltInFunctionalInterface obj = new UsingBuiltInFunctionalInterface();
		
		 obj.usingPredicate();
		 
		 obj.usingConsumer();
		 
		 obj.usingFunction();
	}
}