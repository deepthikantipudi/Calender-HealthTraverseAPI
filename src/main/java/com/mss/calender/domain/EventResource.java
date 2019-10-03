package com.mss.calender.domain;

import java.time.LocalDateTime;

public class EventResource {

	private Long id;
	
	private String name;
	
	private String text;
	
	private LocalDateTime start;
	
	private LocalDateTime end;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public LocalDateTime getEnd() {
		return end;
	}

	public void setEnd(LocalDateTime end) {
		this.end = end;
	}

	@Override
	public String toString() {
		return "EventResource [id=" + id + ", name=" + name + ", text=" + text + ", start=" + start + ", end=" + end
				+ "]";
	}

	public EventResource(Long id, String name, String text, LocalDateTime start, LocalDateTime end) {
		super();
		this.id = id;
		this.name = name;
		this.text = text;
		this.start = start;
		this.end = end;
	}

	public EventResource() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
