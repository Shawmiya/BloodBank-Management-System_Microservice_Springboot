package com.bms.donarservice.service;

import java.util.List;

import com.bms.donarservice.dto.BloodbankDto;
import com.bms.donarservice.model.Bloodbank;

public interface BloodbankService {
	Bloodbank save(Bloodbank bbk);

	void deleteBloodbank(Integer id);

	List<Object> getAllBloodbank();

	BloodbankDto getBloodbankById(Integer id);

	BloodbankDto updateBloodbank(Integer id, BloodbankDto bloodbankDto);
}
