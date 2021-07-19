package com.training;

public class Application {

	public static void main(String[] args) {

		Greeting javaGreet =new Greeting();
		
		System.out.println(javaGreet.getGreeting());
		
		System.out.println(javaGreet.getGreeting(args[0]));
	}

}

//    invoke the second method by passing name , take the name 
// of the user  using command line argument , that is argument to the main 
// method
