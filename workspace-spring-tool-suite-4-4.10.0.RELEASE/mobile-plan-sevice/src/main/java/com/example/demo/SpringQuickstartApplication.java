package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;

import com.example.demo.model.Customer;
import com.example.demo.model.CustomerService;
import com.example.demo.model.Invoice;
import com.example.demo.model.Product;
import org.module.first.Student;

@ComponentScan(basePackages = {"com.example.demo","org.module.first"})
@SpringBootApplication
public class SpringQuickstartApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
//		ConfigurableApplicationContext ctx = SpringApplication.run(SpringQuickstartApplication.class, args);
//		
//		Product product1 = ctx.getBean("tv",Product.class);
//		System.out.println(product1);
//		
//		Invoice inv= ctx.getBean(Invoice.class);
//		System.out.println(inv);
//		
//		CustomerService service= ctx.getBean(CustomerService.class);
//		
//		service.getCustlist().forEach(System.out::println);
//		
//		ctx.close();
		ConfigurableApplicationContext ctx	=SpringApplication.run(SpringQuickstartApplication.class, args);
		
//		 Product product1 = ctx.getBean("tv",Product.class);
//		 
//		 System.out.println(product1);
//		 
//	      Product product2 = ctx.getBean("fridge",Product.class);
//		 
//		 System.out.println(product2);
//		 
		
//		  Invoice inv = ctx.getBean(Invoice.class);
//		  
//		  System.out.println(inv);
//		  
		  
//		InvoiceWithSetterDI inv = ctx.getBean(InvoiceWithSetterDI.class);
	//	
//		System.out.println(inv);
//		  
		
//		CustomerService service = ctx.getBean(CustomerService.class);
	//	
//		service.getCustList().forEach(System.out::println);
	//	
		
		System.out.println(ctx.getBean(Student.class).toString());
		  ctx.close();
		  
		  
		// Create a Instance of CustomerService new CustomerService
		  
		 // create three customer cust1 =new Customer()
		// Create a Array List of type customer List<Customer>=new ArrayList<>();
		  // add elements to array List list.add(cust)
	}
	@Bean
	@Primary
	public Product tv() {
		return new Product(101,"tv",24000);
	}
	
	@Bean
    public Customer ram() {
 
    return new Customer(103,"Rani", 944395);
    }
	
	@Bean
	public Product fridge() {
		return new Product(1011,"fridge",24000);
	}
	@Bean
    public Customer ramesh() {
 
    return new Customer(1032,"sani", 744395);
    }
	
	@Bean
    public Customer raju() {
 
    return new Customer(1031,"bani", 344395);
    }

}

//package com.example.demo;
//
//import org.module.first.Student;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Primary;
//
//import com.example.demo.model.Customer;
//import com.example.demo.model.CustomerService;
//import com.example.demo.model.Invoice;
//import com.example.demo.model.InvoiceWithSetterDI;
//import com.example.demo.model.Product;
//
//@SpringBootApplication
//@ComponentScan(basePackages = {"com.example.demo","org.module.first"})
//public class SpringQuickstartApplication {
//
//	public static void main(String[] args) {
//	ConfigurableApplicationContext ctx	=SpringApplication.run(SpringQuickstartApplication.class, args);
//	
////	 Product product1 = ctx.getBean("tv",Product.class);
////	 
////	 System.out.println(product1);
////	 
////      Product product2 = ctx.getBean("fridge",Product.class);
////	 
////	 System.out.println(product2);
////	 
//	
////	  Invoice inv = ctx.getBean(Invoice.class);
////	  
////	  System.out.println(inv);
////	  
//	  
////	InvoiceWithSetterDI inv = ctx.getBean(InvoiceWithSetterDI.class);
////	
////	System.out.println(inv);
////	  
//	
////	CustomerService service = ctx.getBean(CustomerService.class);
////	
////	service.getCustList().forEach(System.out::println);
////	
//	
//	System.out.println(ctx.getBean(Student.class).toString());
//	  ctx.close();
//	  
//	  
//	// Create a Instance of CustomerService new CustomerService
//	  
//	 // create three customer cust1 =new Customer()
//	// Create a Array List of type customer List<Customer>=new ArrayList<>();
//	  // add elements to array List list.add(cust)
//	  
//	}
//
//	@Bean
//	public Product tv() {
//		
//		return new Product(101,"tv",34000);
//	}
//	
//	@Bean
//	@Primary
//	public Product fridge() {
//		
//		return new Product(102,"fridge",24000);
//	}
//	
//	@Bean
//	public Customer ram() {
//		
//		return new Customer(202,"fani",988233);
//	}
//	@Bean
//	public Customer suresh() {
//		
//		return new Customer(2022,"Suresh",888233);
//	}
//	@Bean
//	public Customer magesh() {
//		
//		return new Customer(3202,"magesh",688233);
//	}
//}


