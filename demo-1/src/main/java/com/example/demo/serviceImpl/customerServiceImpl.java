package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.customer;
import com.example.demo.repostiory.customerRepository;
import com.example.demo.service.customerService;

@Service
public class customerServiceImpl implements customerService
{
	@Autowired
	customerRepository customerRepository;
	@Override
	public customer createcustomer(customer cs)
	{
		return customerRepository.save(cs);
	}
	@Override
	public List<customer> getallcustomer() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}
	@Override
	public customer getcustomerbyid(int id) {
		// TODO Auto-generated method stub
		customer cs1=customerRepository.findById(id).get();
		return cs1;
	}
	@Override
	public customer updatecustomer(int id, customer cs3) {
		// TODO Auto-generated method stub
		customer cs4=customerRepository.findById(id).get();
		cs4.setName(cs3.getName());
		cs4.setContact(cs3.getContact());
		cs4.setEmail(cs3.getEmail());
		customer cs5=customerRepository.save(cs4);
		return cs5;
	}
	@Override
	public String deletecustomer(int id)
	{
		// TODO Auto-generated method stub
		customerRepository.deleteById(id);
		return "customer deleted";
	}
	
}
