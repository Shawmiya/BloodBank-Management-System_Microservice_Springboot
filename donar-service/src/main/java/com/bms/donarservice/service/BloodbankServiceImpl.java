package com.bms.donarservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bms.donarservice.dto.BloodbankDto;

import com.bms.donarservice.model.Bloodbank;

import com.bms.donarservice.repository.BloodbankRepository;

@Service
public class BloodbankServiceImpl implements BloodbankService {

	@Autowired
	BloodbankRepository bloodbankRepo;

	@Override
	public Bloodbank save(Bloodbank bbk) {
		// TODO Auto-generated method stub
		return bloodbankRepo.save(bbk);
	}

	@Override
	public void deleteBloodbank(Integer id) {
		// TODO Auto-generated method stub
		if (bloodbankRepo.findById(id).isPresent()) {
			bloodbankRepo.deleteById(id);
		}

	}

	@Override
	public List<Object> getAllBloodbank() {
		// TODO Auto-generated method stub
		List<Object> bloodbankList = new ArrayList<>();

		bloodbankRepo.findAll().forEach(bloodbank -> {
			bloodbankList.add(new BloodbankDto(bloodbank.getId(), bloodbank.getFullName(), bloodbank.getEmailId(),
					bloodbank.getContactNo(), bloodbank.getAge(), bloodbank.getGender(), bloodbank.getAddress(),
					bloodbank.getBloodgroup()));
		});

		return bloodbankList;
	}

	@Override
	public BloodbankDto getBloodbankById(Integer id) {
		// TODO Auto-generated method stub
		if (bloodbankRepo.findById(id).isPresent()) {
			Bloodbank fetchDonordetail = bloodbankRepo.findById(id).get();
			return new BloodbankDto(fetchDonordetail.getId(), fetchDonordetail.getFullName(),
					fetchDonordetail.getEmailId(), fetchDonordetail.getContactNo(), fetchDonordetail.getAge(),
					fetchDonordetail.getGender(), fetchDonordetail.getAddress(), fetchDonordetail.getBloodgroup());
		}

		return null;
	}

	@Override
	public BloodbankDto updateBloodbank(Integer id, BloodbankDto bloodbankDto) {
		// TODO Auto-generated method stub
		if (bloodbankRepo.findById(id).isPresent()) {
			Bloodbank editbloodbank = bloodbankRepo.findById(id).get();

			editbloodbank.setFullName(bloodbankDto.getFullName());
			editbloodbank.setEmailId(bloodbankDto.getEmailId());
			editbloodbank.setContactNo(bloodbankDto.getContactNo());
			editbloodbank.setAge(bloodbankDto.getAge());
			editbloodbank.setGender(bloodbankDto.getGender());
			editbloodbank.setAddress(bloodbankDto.getAddress());
			editbloodbank.setBloodgroup(bloodbankDto.getBloodgroup());

			Bloodbank updatebloodbank = bloodbankRepo.save(editbloodbank);

			return new BloodbankDto(updatebloodbank.getId(), updatebloodbank.getFullName(),
					updatebloodbank.getEmailId(), updatebloodbank.getContactNo(), updatebloodbank.getAge(),
					updatebloodbank.getGender(), updatebloodbank.getAddress(), updatebloodbank.getBloodgroup());
		}
		return null;
	}

}
