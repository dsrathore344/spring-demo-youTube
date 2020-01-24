package com.mylearning;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Airtel {
	
	private Services myServices;

	@Autowired
	@Qualifier("callerTune")
	public void setMyServices(Services myServices) {
		this.myServices = myServices;
	}
	
	public void whichService() {
		myServices.service();
	}
}
