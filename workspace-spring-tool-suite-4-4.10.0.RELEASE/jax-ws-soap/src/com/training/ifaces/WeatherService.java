package com.training.ifaces;


import java.util.*;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;


@WebService
@SOAPBinding(style = Style.RPC)
public interface WeatherService {

	
	@WebMethod(operationName = "Get Weather")
	public String getWeather(@WebParam(name = "city") String city);
}
