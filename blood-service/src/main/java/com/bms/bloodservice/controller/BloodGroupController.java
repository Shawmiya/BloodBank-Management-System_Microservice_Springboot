package com.bms.bloodservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.bms.bloodservice.dto.BloodDto;
import com.bms.bloodservice.model.BloodGroup;
import com.bms.bloodservice.service.BloodGroupService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class BloodGroupController {

	@Autowired
	BloodGroupService bloodGroupservice;

	@PostMapping("/bloodGroup")
	public BloodGroup save(@RequestBody BloodGroup grp) {
		return bloodGroupservice.save(grp);
	}

	@GetMapping("/bloodGroup")
	public ResponseEntity<Object> getAllBloodGroup() {
		return new ResponseEntity<Object>(bloodGroupservice.getAllBloodGroup(), HttpStatus.OK);
	}

	@GetMapping("/bloodGroup/{id}")
	public ResponseEntity<Object> getBloodGroupById(@PathVariable(value = "id") Integer id) {
		return new ResponseEntity<Object>(bloodGroupservice.getBloodGroupById(id), HttpStatus.OK);
	}

	@DeleteMapping("/bloodGroup/{id}")
	public ResponseEntity<String> deleteEmployeeDetails(@PathVariable(value = "id") Integer id) {
		bloodGroupservice.deleteBloodGroup(id);
		return new ResponseEntity<>("Blood Group Deleted Successfully", HttpStatus.OK);

	}

}
