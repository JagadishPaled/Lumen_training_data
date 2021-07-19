package com.training;
import java.util.*;

import com.training.model.CreditCard;
import com.training.services.CreditCardService;
public class StreamsApllication {

	public static void main(String[] args) {
		
		
		List<CreditCard> cards = new ArrayList<CreditCard>();
		
		cards.add(new CreditCard(10233, "Ramesh", 789, 80000));
		cards.add(new CreditCard(20233, "Suresh", 989, 700000));
		cards.add(new CreditCard(30233, "Magesh", 889, 50000));
		cards.add(new CreditCard(40233, "Naveen", 6789, 60000));
		cards.add(new CreditCard(50233, "Ashish", 7789, 900000));
		
		
		
		CreditCardService service = new CreditCardService(cards);
		
		service.usingFilterAndMap();
		
		service.findMaximumCreditLimit();
		
		
	}

}
