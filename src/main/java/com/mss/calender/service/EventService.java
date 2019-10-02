package com.mss.calender.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mss.calender.domain.Event;
import com.mss.calender.domain.Resource;
import com.mss.calender.exceptionHandling.EventNotFoundException;
import com.mss.calender.repository.EventRepository;

@Service
public class EventService {
	
	@Autowired
	EventRepository er;
	

	public Event getEvent(Long id) {
		// TODO Auto-generated method stub
		return er.findById(id).orElseThrow(EventNotFoundException::new);
	}


	public Optional<Event> getEventsByResource(Long resource_id) {
		// TODO Auto-generated method stub
		return er.findById(resource_id);
	}
	
	

}
