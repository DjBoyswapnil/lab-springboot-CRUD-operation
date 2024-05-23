package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.customer;
import com.example.demo.service.customerService;

@RestController
@RequestMapping("/api")
public class customerControllar 
{
	@Autowired
	customerService customerService;
	
	@PostMapping("/createcustomer")
	customer createcustomer(@RequestBody customer cs)
	{
		
		
		return customerService.createcustomer(cs);
		
	}
	@GetMapping("/getallcustomers")
	List<customer> getallcustomer()
	{
		return customerService.getallcustomer();
	}
	@GetMapping("/customerbyid/{cid}")
	customer getcustomerbyid(@PathVariable("cid") int id)
	{
		return customerService.getcustomerbyid(id);
	}
	@PutMapping("/updatecustomer/{cid}")
	customer updatecustomer(@PathVariable("cid") int id,@RequestBody customer cs1)
	{
		return customerService.updatecustomer(id, cs1);
	}
	@DeleteMapping("/deletecustomer/{cid}")
	String deletecustomer(@PathVariable("cid")int id)
	{
		return customerService.deletecustomer(id);
	}
}

