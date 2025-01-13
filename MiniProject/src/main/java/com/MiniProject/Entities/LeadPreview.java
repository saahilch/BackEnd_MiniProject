package com.MiniProject.Entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LeadPreview {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private String email;
	private String phoneNo;
	private String leadOwner;
	private String company;
	private String jobTitle;
	private Double annualRevenue;
	private String leadSource; // ONLINE or PHYSICAL
	private LocalDateTime lastActivity;
	private String upcomingActivity;
	private LocalDateTime reminder;
	private String taskPriority; // HIGH, MEDIUM, LOW
	private String assignedTo;
	private String notes;

	public LeadPreview(Long id, String name, String email, String phoneNo, String leadOwner, String company,
			String jobTitle, Double annualRevenue, String leadSource, LocalDateTime lastActivity,
			String upcomingActivity, LocalDateTime reminder, String taskPriority, String assignedTo, String notes) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.leadOwner = leadOwner;
		this.company = company;
		this.jobTitle = jobTitle;
		this.annualRevenue = annualRevenue;
		this.leadSource = leadSource;
		this.lastActivity = lastActivity;
		this.upcomingActivity = upcomingActivity;
		this.reminder = reminder;
		this.taskPriority = taskPriority;
		this.assignedTo = assignedTo;
		this.notes = notes;
	}

	public LeadPreview() {
		super();
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getLeadOwner() {
		return leadOwner;
	}

	public void setLeadOwner(String leadOwner) {
		this.leadOwner = leadOwner;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public Double getAnnualRevenue() {
		return annualRevenue;
	}

	public void setAnnualRevenue(Double annualRevenue) {
		this.annualRevenue = annualRevenue;
	}

	public String getLeadSource() {
		return leadSource;
	}

	public void setLeadSource(String leadSource) {
		this.leadSource = leadSource;
	}

	public LocalDateTime getLastActivity() {
		return lastActivity;
	}

	public void setLastActivity(LocalDateTime lastActivity) {
		this.lastActivity = lastActivity;
	}

	public String getUpcomingActivity() {
		return upcomingActivity;
	}

	public void setUpcomingActivity(String upcomingActivity) {
		this.upcomingActivity = upcomingActivity;
	}

	public LocalDateTime getReminder() {
		return reminder;
	}

	public void setReminder(LocalDateTime reminder) {
		this.reminder = reminder;
	}

	public String getTaskPriority() {
		return taskPriority;
	}

	public void setTaskPriority(String taskPriority) {
		this.taskPriority = taskPriority;
	}

	public String getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}
