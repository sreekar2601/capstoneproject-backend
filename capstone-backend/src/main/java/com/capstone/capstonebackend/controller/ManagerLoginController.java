package com.capstone.capstonebackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.capstonebackend.model.CustomerComplaint;
import com.capstone.capstonebackend.model.ManagerLogin;
import com.capstone.capstonebackend.repository.CustomerComplaintRepository;
import com.capstone.capstonebackend.repository.ManagerLoginRepository;

@RestController
@RequestMapping("/managerlogin")
@CrossOrigin(origins = "http://localhost:4200")
public class ManagerLoginController {
	
	@Autowired
	private ManagerLoginRepository managerlogin;
	@Autowired
	private CustomerComplaintRepository complaint;
	
	
	@PostMapping("/login")
	public ResponseEntity<ManagerLogin> login(@RequestBody ManagerLogin managerdata){
		ManagerLogin manager=managerlogin.findByusername(managerdata.getUsername());
		if(manager.getPassword().equals(managerdata.getPassword()))
			return ResponseEntity.ok(manager);
		return (ResponseEntity<ManagerLogin>) ResponseEntity.internalServerError();
	
	}
	
	@GetMapping("/customercomplaints")
	public List<CustomerComplaint> getcomplaints(){
		return  complaint.findAll();
		
	}

}
