package com.bms.seekerservice.service;

import java.util.List;

import com.bms.seekerservice.dto.SeekerDto;
import com.bms.seekerservice.model.Seeker;

public interface SeekerService {

	Seeker save(Seeker skr);

	void deleteSeeker(Integer id);

	List<Object> getAllSeeker();

	SeekerDto getSeekerById(Integer id);

}
