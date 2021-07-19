package com.training.services;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import com.training.model.CreditCard;


import static java.util.stream.Collectors.*;

public class CreditCardService {

	
	private List<CreditCard> cards;

	public CreditCardService(List<CreditCard> cards) {
		super();
		this.cards = cards;
	}

	public List<CreditCard> getCards() {
		return cards;
	}
	
	
	// Using Filter and Map
	
	public void usingFilterAndMap() {
		
		// Using Filter Alone - Only One Intermediate Operator and one Terminal Operator
		
		List<CreditCard> creditLimitMoreThan5Lakh =
				
				this.cards.stream()
				.filter((card)->card.getCreditLimit()>500000)
				.collect(toList());
		System.out.println("Credit Limit MORE than 5 Lakh");
		
		creditLimitMoreThan5Lakh.forEach(System.out::println);
	
		// Using Filter and Map- Two Intermediate Operator and one Terminal Operator
		
		List<String> namesOfMoreThan5Lakh=
				
				this.cards.stream()
				   .filter(card -> card.getCreditLimit()<500000)
				    .map(card -> card.getCardHolderName()).collect(toList());
		
		System.out.println("Credit Limit LESS than 5 Lakh");
		
		namesOfMoreThan5Lakh.forEach(System.out::println);
	}
	
	// Collect to map
	
	public void collecingToUtilMap() {
		
		
		Map<String,Long> teleCallingList = 
				
				 this.cards.stream()
				   .filter(card -> card.getCreditLimit()<500000)
				   .collect(toMap(CreditCard::getCardHolderName, CreditCard::getPhoneNumber));
		
		// Use the entrySet Method and print the complete map
		
		
	}
	
	// finding minimum credit limit
	
	public void findMaximumCreditLimit() {
		
		// optional , comparator.comparing =>  look at code with these statement
		Optional<CreditCard> maxCard = this.cards.stream()
		      .max(Comparator.comparing(CreditCard::getCreditLimit));

		// isPresent and get   => look at code with these statement
		if(maxCard.isPresent()) {
			
			System.out.println("Maximum Credit Limit :="+maxCard.get().getCreditLimit());
		}
	
		
	}
	
	
	
	
	
	
}
