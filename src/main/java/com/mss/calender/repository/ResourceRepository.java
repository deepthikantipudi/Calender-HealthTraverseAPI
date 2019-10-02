package com.mss.calender.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mss.calender.domain.Resource;

@Repository
public interface ResourceRepository extends CrudRepository<Resource, Long> {
}