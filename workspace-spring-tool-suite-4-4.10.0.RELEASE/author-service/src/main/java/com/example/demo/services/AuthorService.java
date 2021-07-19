package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

import com.example.demo.entity.Author;
import com.example.demo.repos.AuthorRepository;

@Service
public class AuthorService {

	
	@Autowired
	private AuthorRepository repo;
	
	
	public List<Author> getAll(){
		
		return this.repo.findAll();
	}
	
	public Author add(Author entity) {
		
		return this.repo.save(entity);
	}
	
//	public Author update(Author entity) {
//		return this.repo.save(entity);
//	}
  public Author remove(Author entity) {
		
	  Optional<Author> found =this.repo.findById(entity.getPhoneNumber());

	 if( found.isPresent()){
	
		  this.repo.delete(entity);
	  } else {
		  throw new NoSuchElementException("Element Not found");
	  }
	 return entity;
  }
	
//	public Author getById(int id) {
//		
//		return this.repo.getById((long) id).
//				orElseThrow(() -> new NoSuchElementException("Element With that id available"));
//	}
  public List<Author> getByFirstName(String description){
		return this.repo.findByFirstName(description);
	}
	public List<Author> getByAddress(String address){
		return this.repo.findByAddress(address);
	}
	public int updateAmount(String amount,long txnId) {
		return this.repo.updateAmount(amount, txnId);
	}

}
