package com.bms.donarservice.service;

import java.util.Optional;

import com.bms.donarservice.model.donar;

public interface DonarService {

	donar save(donar dnr);

	Optional<donar> findById(int id);

	donar fetchAllAllocations(int donarid);
}
