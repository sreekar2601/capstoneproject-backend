package com.capstone.capstonebackend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.capstonebackend.exception.ResourceNotFoundException;
import com.capstone.capstonebackend.model.CustomerComplaint;
import com.capstone.capstonebackend.repository.CustomerComplaintRepository;

@RestController
@RequestMapping("/customercomplaint")
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerComplaintController {
	
	@Autowired
	private CustomerComplaintRepository complaintrepo;
	
	@PostMapping("/create")
	public CustomerComplaint createcomplaint(@RequestBody CustomerComplaint customer) {
		return complaintrepo.save(customer);
	}
	
	@GetMapping("/create/{name}")
	public ResponseEntity<CustomerComplaint> getbyname(@PathVariable String name){
		CustomerComplaint customer=complaintrepo.findById(name).orElseThrow(()->new ResourceNotFoundException("Complaint does not exist:"+name));
		return ResponseEntity.ok(customer);
		
	}
	
		
	

}
