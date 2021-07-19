package com.training.services;

import com.training.ifaces.WeatherService;

import java.util.*;

import javax.jws.WebService;



@WebService
public class WeatherServiceImpl implements WeatherService {

	@Override
	public String getWeather(String city) {

		Map<String,String> defaValue = new HashMap<String, String>();
		
		defaValue.put("sunrise", "6.00am");
		defaValue.put("sunset", "6.20pm");
		defaValue.put("max-temp", "36C");
		defaValue.put("min-temp", "22C");
		
		
		if(city.equals("chennai")) {
		
			defaValue.put("sunrise", "5.30am");
			defaValue.put("sunset", "6.10pm");
			defaValue.put("max-temp", "39C");
			defaValue.put("min-temp", "27C");
			
		}
		
		return defaValue.toString();
	}

}
