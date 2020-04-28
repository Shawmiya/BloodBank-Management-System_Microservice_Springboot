package com.bms.seekerservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.bms.seekerservice.model.Seeker;
import com.bms.seekerservice.service.SeekerService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class SeekerController {

	@Autowired
	SeekerService seekerservice;

	@PostMapping("/seekers")
	public Seeker save(@RequestBody Seeker skr) {
		return seekerservice.save(skr);
	}

	@GetMapping("/seekers")
	public ResponseEntity<Object> getAllSeeker() {
		return new ResponseEntity<Object>(seekerservice.getAllSeeker(), HttpStatus.OK);
	}

	@GetMapping("/seekers/{id}")
	public ResponseEntity<Object> getSeekerById(@PathVariable(value = "id") Integer id) {
		return new ResponseEntity<Object>(seekerservice.getSeekerById(id), HttpStatus.OK);
	}

	@DeleteMapping("/seekers/{id}")
	public ResponseEntity<String> deleteEmployeeDetails(@PathVariable(value = "id") Integer id) {
		seekerservice.deleteSeeker(id);
		return new ResponseEntity<>("Seeker detail Deleted Successfully", HttpStatus.OK);
	}
}
