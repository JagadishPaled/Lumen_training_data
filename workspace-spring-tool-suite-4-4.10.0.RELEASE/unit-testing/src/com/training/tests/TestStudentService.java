package com.training.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.training.StudentService;

public class TestStudentService {

	StudentService service;
	
	@BeforeEach
	public void setUp() {
		
		 service = new StudentService();
			
	}
	
	@Test
	public void testForNotNull() {
		
		
		String actual = service.assignGrade(90);
		
		assertNotNull(actual);
		
	}
	
	@Test
	@DisplayName("Test To check the Grade is O when the mark is 60")
	public void testForGradeO() {
		
		
		String actual = service.assignGrade(60);
		
            assertEquals("O",actual);
           
	}
	
}
