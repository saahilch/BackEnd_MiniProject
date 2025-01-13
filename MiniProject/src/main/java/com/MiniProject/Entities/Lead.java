package com.MiniProject.Entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "leads") // Maps to the 'leads' table

public class Lead {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment ID
    private Long id;

    @Column(nullable = false) // Marks this field as NOT NULL
    private String name;

    @Column
    private String company;

    @Column(unique = true) // Ensures email is unique
    private String email;

    @Column(nullable = false)
    private String phone;

    @Column
    private String assignedTo;

    @Column
    private String tag;

    @Column
    private String status;

    @Column
    private LocalDateTime lastContact;

    @Column
    private LocalDateTime created;

    @Column
    private String additionalMobileNumber;

    @Column
    private String leadType;

    @Column
    private String source;

	public Lead(Long id, String name, String company, String email, String phone, String assignedTo, String tag,
			String status, LocalDateTime lastContact, LocalDateTime created, String additionalMobileNumber,
			String leadType, String source) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
		this.email = email;
		this.phone = phone;
		this.assignedTo = assignedTo;
		this.tag = tag;
		this.status = status;
		this.lastContact = lastContact;
		this.created = created;
		this.additionalMobileNumber = additionalMobileNumber;
		this.leadType = leadType;
		this.source = source;
	}

	public Lead() {
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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDateTime getLastContact() {
		return lastContact;
	}

	public void setLastContact(LocalDateTime lastContact) {
		this.lastContact = lastContact;
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}

	public String getAdditionalMobileNumber() {
		return additionalMobileNumber;
	}

	public void setAdditionalMobileNumber(String additionalMobileNumber) {
		this.additionalMobileNumber = additionalMobileNumber;
	}

	public String getLeadType() {
		return leadType;
	}

	public void setLeadType(String leadType) {
		this.leadType = leadType;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
    
}
