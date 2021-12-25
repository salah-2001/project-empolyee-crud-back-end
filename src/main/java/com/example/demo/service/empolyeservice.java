package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.moduls.employe;
import com.example.demo.repository.employerepository;

@Service
public class empolyeservice {
	
	@Autowired
	private employerepository repository;
	
	public List<employe> getempolye(){
		
		return repository.findAll();
	}
	
	public employe getemployebyid(int id)
	{
		return repository.findById(id).get();
	}
	
	public void poststudent(employe employe) {
		 repository.save(employe);
	}

	public void employedelet(int id)
	{
		repository.deleteById(id);
	}
}
