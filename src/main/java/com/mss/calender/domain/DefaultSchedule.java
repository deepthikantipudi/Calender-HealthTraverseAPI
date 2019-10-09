package com.mss.calender.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;



@Entity
public class DefaultSchedule {
	
	
	
	private boolean AllDay;
	private String Categorize;
	private String CustomStyle;
	private String Description;
	private LocalDateTime EndTime;
	private String EndTimeZone;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	private String Location;
	private String Owner;
	private String Priority;
	private int Recurrence;
	private String RecurrenceEndDate;
	private String RecurrenceRule;
	private String RecurrenceStartDate;
	private String RecurrenceType;
	private String RecurrenceTypeCount;
	private String Reminder;
	private LocalDateTime StartTime;
	private String StartTimeZone;
	private String Subject;
	
	
	public DefaultSchedule() {
		super();
		// TODO Auto-generated constructor stub
	}


	public DefaultSchedule(boolean allDay, String categorize, String customStyle, String description,
			LocalDateTime endTime, String endTimeZone, int id, String location, String owner, String priority,
			int recurrence, String recurrenceEndDate, String recurrenceRule, String recurrenceStartDate,
			String recurrenceType, String recurrenceTypeCount, String reminder, LocalDateTime startTime,
			String startTimeZone, String subject) {
		super();
		AllDay = allDay;
		Categorize = categorize;
		CustomStyle = customStyle;
		Description = description;
		EndTime = endTime;
		EndTimeZone = endTimeZone;
		Id = id;
		Location = location;
		Owner = owner;
		Priority = priority;
		Recurrence = recurrence;
		RecurrenceEndDate = recurrenceEndDate;
		RecurrenceRule = recurrenceRule;
		RecurrenceStartDate = recurrenceStartDate;
		RecurrenceType = recurrenceType;
		RecurrenceTypeCount = recurrenceTypeCount;
		Reminder = reminder;
		StartTime = startTime;
		StartTimeZone = startTimeZone;
		Subject = subject;
	}


	public boolean isAllDay() {
		return AllDay;
	}


	public void setAllDay(boolean allDay) {
		AllDay = allDay;
	}


	public String getCategorize() {
		return Categorize;
	}


	public void setCategorize(String categorize) {
		Categorize = categorize;
	}


	public String getCustomStyle() {
		return CustomStyle;
	}


	public void setCustomStyle(String customStyle) {
		CustomStyle = customStyle;
	}


	public String getDescription() {
		return Description;
	}


	public void setDescription(String description) {
		Description = description;
	}


	public LocalDateTime getEndTime() {
		return EndTime;
	}


	public void setEndTime(LocalDateTime endTime) {
		EndTime = endTime;
	}


	public String getEndTimeZone() {
		return EndTimeZone;
	}


	public void setEndTimeZone(String endTimeZone) {
		EndTimeZone = endTimeZone;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getLocation() {
		return Location;
	}


	public void setLocation(String location) {
		Location = location;
	}


	public String getOwner() {
		return Owner;
	}


	public void setOwner(String owner) {
		Owner = owner;
	}


	public String getPriority() {
		return Priority;
	}


	public void setPriority(String priority) {
		Priority = priority;
	}


	public int getRecurrence() {
		return Recurrence;
	}


	public void setRecurrence(int recurrence) {
		Recurrence = recurrence;
	}


	public String getRecurrenceEndDate() {
		return RecurrenceEndDate;
	}


	public void setRecurrenceEndDate(String recurrenceEndDate) {
		RecurrenceEndDate = recurrenceEndDate;
	}


	public String getRecurrenceRule() {
		return RecurrenceRule;
	}


	public void setRecurrenceRule(String recurrenceRule) {
		RecurrenceRule = recurrenceRule;
	}


	public String getRecurrenceStartDate() {
		return RecurrenceStartDate;
	}


	public void setRecurrenceStartDate(String recurrenceStartDate) {
		RecurrenceStartDate = recurrenceStartDate;
	}


	public String getRecurrenceType() {
		return RecurrenceType;
	}


	public void setRecurrenceType(String recurrenceType) {
		RecurrenceType = recurrenceType;
	}


	public String getRecurrenceTypeCount() {
		return RecurrenceTypeCount;
	}


	public void setRecurrenceTypeCount(String recurrenceTypeCount) {
		RecurrenceTypeCount = recurrenceTypeCount;
	}


	public String getReminder() {
		return Reminder;
	}


	public void setReminder(String reminder) {
		Reminder = reminder;
	}


	public LocalDateTime getStartTime() {
		return StartTime;
	}


	public void setStartTime(LocalDateTime startTime) {
		StartTime = startTime;
	}


	public String getStartTimeZone() {
		return StartTimeZone;
	}


	public void setStartTimeZone(String startTimeZone) {
		StartTimeZone = startTimeZone;
	}


	public String getSubject() {
		return Subject;
	}


	public void setSubject(String subject) {
		Subject = subject;
	}


	@Override
	public String toString() {
		return "DefaultSchedule [AllDay=" + AllDay + ", Categorize=" + Categorize + ", CustomStyle=" + CustomStyle
				+ ", Description=" + Description + ", EndTime=" + EndTime + ", EndTimeZone=" + EndTimeZone + ", Id="
				+ Id + ", Location=" + Location + ", Owner=" + Owner + ", Priority=" + Priority + ", Recurrence="
				+ Recurrence + ", RecurrenceEndDate=" + RecurrenceEndDate + ", RecurrenceRule=" + RecurrenceRule
				+ ", RecurrenceStartDate=" + RecurrenceStartDate + ", RecurrenceType=" + RecurrenceType
				+ ", RecurrenceTypeCount=" + RecurrenceTypeCount + ", Reminder=" + Reminder + ", StartTime=" + StartTime
				+ ", StartTimeZone=" + StartTimeZone + ", Subject=" + Subject + "]";
	}
	



	
	
	
	
	

}
