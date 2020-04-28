package com.bms.donarservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bms.donarservice.model.Blood;
import com.bms.donarservice.model.Telephone;
import com.bms.donarservice.model.donar;
import com.bms.donarservice.repository.DonarRepository;

@Service
public class DonarServiceImpl implements DonarService {

	@Autowired
	DonarRepository donarrepo;

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@Autowired
	RestTemplate restTemplate;

	public donar save(donar dnr) {
		for (Telephone tp : dnr.getTelephone()) {

			tp.setDonar(dnr);
		}

		return donarrepo.save(dnr);
	}

	@Override
	public Optional<donar> findById(int id) {

		return donarrepo.findById(id);
	}

	@Override
	public donar fetchAllAllocations(int donarid) {
		Optional<donar> donars = donarrepo.findById(donarid);

		if (donars.isPresent()) {

			donar objdonar = donars.get();

			HttpHeaders httpHeaders = new HttpHeaders();

			HttpEntity<String> httpEntity = new HttpEntity<String>("", httpHeaders);

			ResponseEntity<Blood[]> responseEntity = restTemplate.exchange(
					"http://localhost:8081/blood/findbyid/" + donarid, HttpMethod.GET, httpEntity, Blood[].class);

			objdonar.setBloods(responseEntity.getBody());

			return objdonar;

		}

		return null;
	}

}
