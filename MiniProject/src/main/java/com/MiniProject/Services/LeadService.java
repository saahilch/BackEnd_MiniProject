package com.MiniProject.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MiniProject.Entities.Lead;
import com.MiniProject.Repository.LeadRepository;

/**
 * Service class to manage the business logic related to Lead operations.
 */
@Service
public class LeadService {

    // Autowiring the LeadRepository to interact with the database
    @Autowired
    private LeadRepository leadRepository;

    /**
     * Add a new Lead to the database.
     *
     * @param lead The Lead object to be saved.
     * @return The saved Lead object.
     */
    public Lead addLead(Lead lead) {
        // Setting the creation date and time to the current moment
        lead.setCreated(java.time.LocalDateTime.now());
        
        // Saving the Lead object to the database
        return leadRepository.save(lead);
    }

    /**
     * Retrieve all Leads from the database.
     *
     * @return A list of all Lead objects.
     */
    public List<Lead> getAllLeads() {
        // Returning all the Lead entries from the database
        return leadRepository.findAll();
    }

    /**
     * Search Leads based on various parameters such as assignedTo, tag, or status.
     *
     * @param assignedTo The person the lead is assigned to.
     * @param tag The tag associated with the lead.
     * @param status The current status of the lead.
     * @return A list of leads that match the provided search criteria.
     */
    public List<Lead> searchLeads(String assignedTo, String tag, String status) {
        // If assignedTo is not null, filter the leads by assigned person
        if (assignedTo != null) {
            return leadRepository.findByAssignedTo(assignedTo);
        } 
        // If tag is not null, filter the leads by tag
        else if (tag != null) {
            return leadRepository.findByTag(tag);
        } 
        // If status is not null, filter the leads by status
        else if (status != null) {
            return leadRepository.findByStatus(status);
        }
        // If no filters are provided, return all leads
        return leadRepository.findAll();
    }

    /**
     * Retrieve a specific Lead by its ID.
     *
     * @param id The ID of the Lead to retrieve.
     * @return The Lead object if found, or null if not found.
     */
    public Lead getLeadById(Long id) {
        // Searching for the Lead with the given ID, and return null if not found
        return leadRepository.findById(id).orElse(null);
    }
}
