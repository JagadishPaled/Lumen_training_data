package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.example.demo.entity.*;
import com.example.demo.services.AuthorService;

//import io.swagger.v3.oas.annotations.Operation;
//import io.swagger.v3.oas.annotations.Parameter;
//import io.swagger.v3.oas.annotations.Parameters;

@RestController
public class AuthorController {
	
	@Value("${server.port}")
	private String portNumber;
	@Autowired
	private AuthorService service;
	@GetMapping(path = "/authors")
	public List<Author> getAll(){
		
		return this.service.getAll();
	}
	
//	@GetMapping(path = "/authors/{id}")
//	public Author getById(@PathVariable("id") long id){
//		
//		return this.service.getById(id);
//	}
	
    @PostMapping(path = "/authors")
	public ResponseEntity<Author> add(@RequestBody Author entity) {
		
		return ResponseEntity.status(HttpStatus.CREATED).body(this.service.add(entity));
	}
    
    @PutMapping(path = "/authors")
	public Author update(@RequestBody Author entity) {
		
		return this.service.add(entity);
	}
    
    @DeleteMapping(path = "/authors")
	public Author remove(@RequestBody Author entity) {
		
		return this.service.remove(entity);
	}
    @GetMapping(path="/authors/src/first/{firstname}")
    public List<Author> getByFirstName(@PathVariable("firstname") String firstname){
    	return this.service.getByFirstName(firstname);
    }
    
    @GetMapping(path="/authors/src/last/{addrs}")
    public List<Author> getByAddress(@PathVariable("addrs") String addrs){
		return this.service.getByAddress(addrs);
	}
    @GetMapping(path="/authors/src/{phoneNumber}/{firstName}")
    public ResponseEntity<String> updateAmount(@PathVariable("phoneNumber") long id, @PathVariable("firstName") String amount){
    	int rowsUpdated=this.service.updateAmount(amount, id);
    	return ResponseEntity.ok().body(rowsUpdated+"Row(s) Updated");
    }
    
    
}