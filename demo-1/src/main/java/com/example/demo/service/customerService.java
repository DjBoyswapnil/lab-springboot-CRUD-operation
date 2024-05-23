package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.customer;

public interface customerService 
{

	customer createcustomer(customer cs);
	
	List<customer> getallcustomer();
	customer  getcustomerbyid(int id);
	customer updatecustomer(int id, customer cs3);
	String deletecustomer(int id);
}
