
package com.mss.calender.controller;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.mss.calender.domain.Event;
import com.mss.calender.domain.Resource;
import com.mss.calender.repository.EventRepository;
import com.mss.calender.repository.ResourceRepository;
import com.mss.calender.service.EventService;
import com.mss.calender.service.ResourceService;

@RestController
public class MainController {

    @Autowired
    EventRepository er;
    
    @Autowired
    EventService es;

    @Autowired
    ResourceRepository rr;
    
    @Autowired
    ResourceService rs;

  

    @GetMapping("/api/resources")
    public Iterable<Resource> resources() {
        return rr.findAll();
    }

    @GetMapping("/api/events")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
   public Iterable<Event> events(@RequestParam(value="from", required =false) @DateTimeFormat(iso = ISO.DATE_TIME) LocalDateTime from, @RequestParam(value="to", required =false) @DateTimeFormat(iso = ISO.DATE_TIME) LocalDateTime to) {
        return er.findBetween(from, to);
    }
    @GetMapping("/api/event")
    public Iterable<Event> getEvent(){
    	return er.findAll();
    }
    @RequestMapping("/api/event/{id}")
    public Event getEventById(@PathVariable Long id) {
    return es.getEvent(id);
    }
    @RequestMapping("/api/resource/{id}")
    public Optional<Resource> getResourceById(@PathVariable Long id) {
    return rs.getResource(id);
    }
    
    @RequestMapping("/api/events/{resource_id}")
    public Optional<Event> getEventsByResourceById(@PathVariable Long resource_id) {
    return es.getEventsByResource(resource_id);
     

    
    }
  

  


}