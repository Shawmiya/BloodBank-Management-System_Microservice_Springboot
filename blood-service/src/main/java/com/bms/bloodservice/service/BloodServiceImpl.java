package com.bms.bloodservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.bms.bloodservice.dto.BloodDto;
import com.bms.bloodservice.model.Blood;
import com.bms.bloodservice.repository.BloodRepository;

@Service
public class BloodServiceImpl implements BloodService {
	@Autowired
	BloodRepository bloodRepo;

	@Override
	public Blood save(Blood bld) {
		// TODO Auto-generated method stub
		return bloodRepo.save(bld);
	}

	@Override
	public void deleteBlood(Integer id) {
		// TODO Auto-generated method stub
		if (bloodRepo.findById(id).isPresent()) {
			bloodRepo.deleteById(id);
		}

	}

	@Override
	public List<Object> getAllBlood() {
		// TODO Auto-generated method stub
		List<Object> bloodList = new ArrayList<>();

		bloodRepo.findAll().forEach(blooddetail -> {
			bloodList.add(new BloodDto(blooddetail.getId(), blooddetail.getBloodGroup(), blooddetail.getDonarDate(),
					blooddetail.getExpiryDate(), blooddetail.getDescription()));
		});

		return bloodList;
	}

	@Override
	public BloodDto getBloodById(Integer id) {
		// TODO Auto-generated method stub
		if (bloodRepo.findById(id).isPresent()) {
			Blood fetchDonordetail = bloodRepo.findById(id).get();
			return new BloodDto(fetchDonordetail.getId(), fetchDonordetail.getBloodGroup(),
					fetchDonordetail.getDonarDate(), fetchDonordetail.getExpiryDate(),
					fetchDonordetail.getDescription());
		}

		return null;
	}

	@Override
	public BloodDto updateBlood(Integer id, BloodDto bloodDto) {
		// TODO Auto-generated method stub
		if (bloodRepo.findById(id).isPresent()) {
			Blood editBlood = bloodRepo.findById(id).get();

			editBlood.setBloodGroup(bloodDto.getBloodGroup());
			editBlood.setDonarDate(bloodDto.getDonorDate());
			editBlood.setExpiryDate(bloodDto.getExpiryDate());
			editBlood.setDescription(bloodDto.getDescription());

			Blood updateBlood = bloodRepo.save(editBlood);

			return new BloodDto(updateBlood.getId(), updateBlood.getBloodGroup(), updateBlood.getDonarDate(),
					updateBlood.getExpiryDate(), updateBlood.getDescription());
		}
		return null;
	}

}
