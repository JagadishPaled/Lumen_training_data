package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.MobilePlan;

@SpringBootApplication
public class MobilePlanServiceApplication {

	/*
	 *  In Spring by default Beans are Eagerly Created.
	 *  We can make them create lazily by adding annotation @Lazy
	 *  
	 *  Bean are singleton by default.
	 *  if they are not singleton then they are prototype 
	 *  scope from singleton to prototype is done by using the annotation @Scope("prototype")
	 */
	
	public static void main(String[] args) {
	 ConfigurableApplicationContext ctx=	SpringApplication.run(MobilePlanServiceApplication.class, args);
	
	  MobilePlan plan1 = ctx.getBean("mobilePlan",MobilePlan.class);
	  
	   System.out.println(plan1);

	  
	   MobilePlan plan2 = ctx.getBean("mobilePlan",MobilePlan.class);
		  
	   System.out.println(plan2);
	   
	   
	    System.out.println("is Singleton :="+ctx.isSingleton("mobilePlan"));
	    
	    System.out.println("is Prototype :="+ctx.isPrototype("mobilePlan"));
		  
	   
	}

	
	@Bean
	public MobilePlan prePaid() {
		
		return new MobilePlan(200, "plan399", 400, 28);
	}
	
	
	@Bean
	public MobilePlan postPaid() {
		
		return new MobilePlan(300, "monthly", 900, 30);
	}
}
