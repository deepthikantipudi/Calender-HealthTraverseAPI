package com.mss.calender.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.mss.calender.domain.DefaultSchedule;
import com.mss.calender.domain.Event;

public interface DefaultScheduleRepository extends CrudRepository<DefaultSchedule, Long> {
	
	

}
