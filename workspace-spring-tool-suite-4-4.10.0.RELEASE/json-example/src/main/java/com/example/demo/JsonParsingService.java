package com.example.demo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonParsingService {

	
	public String javaToJson(Student stud) {
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		return gson.toJson(stud);
		
	}
	
	public Student jsonToJava(String data) {
		
		
		  Gson gson = new Gson();
		  
		  return gson.fromJson(data, Student.class);
	}
}
