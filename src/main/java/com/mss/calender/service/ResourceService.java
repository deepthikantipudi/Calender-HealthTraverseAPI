package com.mss.calender.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mss.calender.domain.Resource;
import com.mss.calender.repository.ResourceRepository;

@Service
public class ResourceService {
	@Autowired
	ResourceRepository rr;

	public Optional<Resource> getResource(Long id) {
		return rr.findById(id);
	}


}
