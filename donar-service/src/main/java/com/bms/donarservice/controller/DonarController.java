package com.bms.donarservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bms.donarservice.model.donar;
import com.bms.donarservice.service.DonarService;

@RestController
public class DonarController {

	@Autowired
	DonarService donarservice;

	@RequestMapping(value = "/donarget", method = RequestMethod.GET)
	public List<donar> getAllstudents() {

		return donar.getAlldonars();

	}

	@RequestMapping(value = "/donar", method = RequestMethod.POST)
	public donar save(@RequestBody donar dnr) {

		return donarservice.save(dnr);

	}

	@RequestMapping(value = "donarfetch/{Donarid}")
	public donar fetch(@PathVariable int Donarid) {

		return donarservice.fetchAllAllocations(Donarid);

	}
}
