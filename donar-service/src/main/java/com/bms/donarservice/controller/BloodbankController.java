package com.bms.donarservice.controller;

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

import com.bms.donarservice.dto.BloodbankDto;
import com.bms.donarservice.model.Bloodbank;
import com.bms.donarservice.service.BloodbankService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class BloodbankController {
	@Autowired
	BloodbankService bloodbankservice;

	@PostMapping("/bloodbankdonor")
	public Bloodbank save(@RequestBody Bloodbank bbk) {
		return bloodbankservice.save(bbk);
	}

	@GetMapping("/bloodbankdonor")
	public ResponseEntity<Object> getAllBloodbank() {
		return new ResponseEntity<Object>(bloodbankservice.getAllBloodbank(), HttpStatus.OK);
	}

	@GetMapping("/bloodbankdonor/{id}")
	public ResponseEntity<Object> getBloodbankById(@PathVariable(value = "id") Integer id) {
		return new ResponseEntity<Object>(bloodbankservice.getBloodbankById(id), HttpStatus.OK);
	}

	@DeleteMapping("/bloodbankdonor/{id}")
	public ResponseEntity<String> deleteEmployeeDetails(@PathVariable(value = "id") Integer id) {
		bloodbankservice.deleteBloodbank(id);
		return new ResponseEntity<>("Donor detail Deleted Successfully", HttpStatus.OK);
	}

	@PutMapping("/bloodbankdonor/{id}")
	public ResponseEntity<Object> updateBloodbank(@PathVariable(value = "id") Integer id,
			@RequestBody BloodbankDto bloodbankDto) {
		return new ResponseEntity<Object>(bloodbankservice.updateBloodbank(id, bloodbankDto), HttpStatus.OK);
	}
}
