package com.bms.bloodservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.bms.bloodservice.dto.BloodgroupDto;
import com.bms.bloodservice.model.BloodGroup;
import com.bms.bloodservice.repository.BloodGroupRepository;

@Service
public class BloodGroupServiceImpl implements BloodGroupService {

	@Autowired
	BloodGroupRepository bloodGroupRepo;

	@Override
	public BloodGroup save(BloodGroup grp) {

		return bloodGroupRepo.save(grp);
	}

	@Override
	public void deleteBloodGroup(Integer id) {

		if (bloodGroupRepo.findById(id).isPresent()) {
			bloodGroupRepo.deleteById(id);
		}

	}

	@Override
	public List<Object> getAllBloodGroup() {
		// TODO Auto-generated method stub
		List<Object> bloodgroupList = new ArrayList<>();

		bloodGroupRepo.findAll().forEach(bloodgroup -> {
			bloodgroupList.add(new BloodgroupDto(bloodgroup.getId(), bloodgroup.getGroupName()));
		});

		return bloodgroupList;

	}

	@Override
	public BloodgroupDto getBloodGroupById(Integer id) {
		// TODO Auto-generated method stub
		if (bloodGroupRepo.findById(id).isPresent()) {
			BloodGroup fetchBloodgroup = bloodGroupRepo.findById(id).get();
			return new BloodgroupDto(fetchBloodgroup.getId(), fetchBloodgroup.getGroupName());
		}

		return null;
	}

}
