package com.capstone.capstonebackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.capstonebackend.model.Manager;
import com.capstone.capstonebackend.repository.ManagerRepository;

@RestController
@RequestMapping("/manager")
@CrossOrigin(origins = "http://localhost:4200")
public class ManagerController {
	
	@Autowired
	private ManagerRepository managerrepo;
	
	
	@GetMapping("/getmanagers")
	public List<Manager> getAllmanagers(){
		return managerrepo.findAll();
	}
	@PostMapping("/managers")
	public Manager createManager(@RequestBody Manager manager) {
		return managerrepo.save(manager);
	}
	


}
