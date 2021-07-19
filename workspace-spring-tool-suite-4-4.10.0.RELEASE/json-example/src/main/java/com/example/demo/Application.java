package com.example.demo;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ramsMark = {89,80,67};
		
		Student ram = new Student(101, "Ramesh", ramsMark);
		
		JsonParsingService service = new JsonParsingService();
		
		        System.out.println(" JSON "+service.javaToJson(ram));
		        
		        
		        String suresh ="{'rollNumber': 101,'studentName': 'Ramesh', 'marks': [89,80,67]}";
		        
		        System.out.println(service.jsonToJava(suresh));
		        
		        
		        
	}

}
