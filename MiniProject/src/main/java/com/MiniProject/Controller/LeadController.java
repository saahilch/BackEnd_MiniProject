package com.MiniProject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.MiniProject.Entities.Lead;
import com.MiniProject.Services.LeadService;

/**
 * The LeadController class handles all HTTP requests related to Lead entities.
 * It allows adding new leads, retrieving leads, searching for leads, and
 * getting specific lead details.
 */
@RestController
@RequestMapping("/api/leads") // Base URL for all lead-related APIs
public class LeadController {

	// Injecting the LeadService to handle business logic for leads
	@Autowired
	private LeadService leadService;

	/**
	 * Adds a new lead.
	 * 
	 * @param lead The Lead object received in the request body.
	 * @return The saved Lead object.
	 */
	@PostMapping("/add")
	public Lead addLead(@RequestBody Lead lead) {
		// Calls the service to save the lead to the database
		return leadService.addLead(lead);
	}

	/**
	 * Retrieves all leads.
	 * 
	 * @return A list of all Lead objects from the database.
	 */
	@GetMapping
	public List<Lead> getAllLeads() {
		// Calls the service to fetch all leads from the database
		return leadService.getAllLeads();
	}

	/**
	 * Searches for leads based on optional parameters.
	 * 
	 * @param assignedTo (Optional) Filter by the person assigned to the lead.
	 * @param tag        (Optional) Filter by tag.
	 * @param status     (Optional) Filter by the status of the lead.
	 * @return A list of leads matching the search criteria.
	 */
	@GetMapping("/search")
	public List<Lead> searchLeads(@RequestParam(required = false) String assignedTo,
			@RequestParam(required = false) String tag, @RequestParam(required = false) String status) {
		// Calls the service to fetch leads based on search criteria
		return leadService.searchLeads(assignedTo, tag, status);
	}

	/**
	 * Retrieves a specific lead by its ID.
	 * 
	 * @param id The unique ID of the lead to retrieve.
	 * @return The Lead object with the specified ID.
	 */
	@GetMapping("/{id}")
	public Lead getLeadById(@PathVariable Long id) {
		// Calls the service to fetch a lead by its ID
		return leadService.getLeadById(id);
	}
}
