package com.training.model;

import com.training.ifaces.Automobile;

public class MarutiCar implements Automobile {

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 500000.00;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "celereio";
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "grey";
	}

}
