package com.bms.bloodservice.controller;

import java.util.List;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bms.bloodservice.dto.BloodDto;
import com.bms.bloodservice.model.Blood;
import com.bms.bloodservice.service.BloodService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

@RequestMapping("/api")
public class BloodController {

	@Autowired
	BloodService bloodService;

	@PostMapping("/blood")
	public Blood save(@RequestBody Blood dnt) {
		return bloodService.save(dnt);
	}

	@GetMapping("/blood")
	public ResponseEntity<Object> getAllblood() {
		return new ResponseEntity<Object>(bloodService.getAllBlood(), HttpStatus.OK);
	}

	@GetMapping("/blood/{id}")
	public ResponseEntity<Object> getbloodById(@PathVariable(value = "id") Integer id) {
		return new ResponseEntity<Object>(bloodService.getBloodById(id), HttpStatus.OK);
	}

	@DeleteMapping("/blood/{id}")
	public ResponseEntity<String> deleteEmployeeDetails(@PathVariable(value = "id") Integer id) {
		bloodService.deleteBlood(id);
		return new ResponseEntity<>("Donate detail Deleted Successfully", HttpStatus.OK);
	}

	@PutMapping("/blood/{id}")
	public ResponseEntity<Object> updateBlood(@PathVariable(value = "id") Integer id,
			@RequestBody BloodDto bloodbankDto) {
		return new ResponseEntity<Object>(bloodService.updateBlood(id, bloodbankDto), HttpStatus.OK);
	}
}
