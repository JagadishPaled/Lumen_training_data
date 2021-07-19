package com.training;

import org.apache.log4j.Logger;

import java.util.*;
public class Application {

	public static void main(String[] args) {

		Logger log = Logger.getRootLogger();

		log.info("log4j configured correctly");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		
		 int number = sc.nextInt();
			    
	    if(number<100) {
	    	
	    	log.error("invalid number");
	    	sc.close();
	    	throw new RuntimeException("exception");
	    } else {
	    	log.debug("your entered correct number");
	    }
	    		 
		 sc.close();
	}

}
