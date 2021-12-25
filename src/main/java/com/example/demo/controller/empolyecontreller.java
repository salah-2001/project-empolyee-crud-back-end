package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.moduls.employe;
import com.example.demo.service.empolyeservice;

@RestController
@RequestMapping("/project")
@CrossOrigin(origins = "http://localhost:4200")
public class empolyecontreller {
	
	@Autowired
	private empolyeservice service; 
	
	@GetMapping("/employe")
	public List<employe> FindAll(){
		return service.getempolye();
	}

	@GetMapping("/employe/{id}")
	public employe FindById(@PathVariable int id)
	{
		return service.getemployebyid(id);
	}
	
	@PostMapping("/employe")
	public void savestudent(@RequestBody employe employe)
	{
		service.poststudent(employe);
	}
	
	@PutMapping("/employe/{id}")
	public void updateempolye(@RequestBody employe employe ,@PathVariable int id)
	{
		 service.poststudent(employe);
	}
	
	@DeleteMapping("/employe/{id}")
	public void delete(@PathVariable int id)
	{
		service.employedelet(id);
	}
}
