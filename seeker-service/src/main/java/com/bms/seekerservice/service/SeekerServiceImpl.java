package com.bms.seekerservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bms.seekerservice.dto.SeekerDto;
import com.bms.seekerservice.model.Seeker;
import com.bms.seekerservice.repository.SeekerRepository;

@Service
public class SeekerServiceImpl implements SeekerService {

	@Autowired
	SeekerRepository seekerRepo;

	@Override
	public Seeker save(Seeker skr) {
		// TODO Auto-generated method stub
		return seekerRepo.save(skr);
	}

	@Override
	public void deleteSeeker(Integer id) {
		// TODO Auto-generated method stub
		if (seekerRepo.findById(id).isPresent()) {
			seekerRepo.deleteById(id);
		}
	}

	@Override
	public List<Object> getAllSeeker() {
		// TODO Auto-generated method stub
		List<Object> seekerList = new ArrayList<>();

		seekerRepo.findAll().forEach(Seeker -> {
			seekerList.add(new SeekerDto(Seeker.getId(), Seeker.getFullName(), Seeker.getContactno(),
					Seeker.getEmailId(), Seeker.getMessage()));
		});

		return seekerList;
	}

	@Override
	public SeekerDto getSeekerById(Integer id) {
		// TODO Auto-generated method stub
		if (seekerRepo.findById(id).isPresent()) {
			Seeker fetchSeekerdetail = seekerRepo.findById(id).get();
			return new SeekerDto(fetchSeekerdetail.getId(), fetchSeekerdetail.getFullName(),
					fetchSeekerdetail.getContactno(), fetchSeekerdetail.getEmailId(), fetchSeekerdetail.getMessage());
		}

		return null;
	}

}
