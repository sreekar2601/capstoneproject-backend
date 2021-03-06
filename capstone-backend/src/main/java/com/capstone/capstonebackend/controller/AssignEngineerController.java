package com.capstone.capstonebackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.capstonebackend.exception.ResourceNotFoundException;
import com.capstone.capstonebackend.model.AssignEngineer;
import com.capstone.capstonebackend.repository.AssignEngineerRepository;

@RestController
@RequestMapping("/assign")
@CrossOrigin(origins = "http://localhost:4200")
public class AssignEngineerController {
	
	@Autowired
	private AssignEngineerRepository assignrepo;
	
	@GetMapping("/engineer")
	public List<AssignEngineer> getassignengineer(){
		return assignrepo.findAll();
	}
	
	@GetMapping("/getby/{name}")
	public ResponseEntity<AssignEngineer> getbyname(@PathVariable String name ){
		AssignEngineer engineer=assignrepo.findById(name).orElseThrow(()->new ResourceNotFoundException("Assign engineer does not exist with name"+name));
		return ResponseEntity.ok(engineer);
		
	}
	
	@PutMapping("/update/{name}")
	public ResponseEntity<AssignEngineer> update(@PathVariable String name,@RequestBody AssignEngineer assigndata){
		AssignEngineer eng=assignrepo.findById(name).orElseThrow(()->new ResourceNotFoundException("Assign engineer does not exist with name"+name));
		eng.setEngineer(assigndata.getEngineer());
		AssignEngineer engi=assignrepo.save(eng);
		return ResponseEntity.ok(engi);
	}

}
