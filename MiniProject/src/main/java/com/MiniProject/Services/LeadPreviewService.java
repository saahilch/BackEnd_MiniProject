package com.MiniProject.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MiniProject.Entities.LeadPreview;
import com.MiniProject.Repository.LeadPreviewRepository;

/**
 * Service class for handling business logic related to LeadPreview operations.
 */
@Service
public class LeadPreviewService {

    // Dependency injection of LeadPreviewRepository to interact with the database
    @Autowired
    private LeadPreviewRepository leadPreviewRepository;

    /**
     * Create a new LeadPreview entry.
     *
     * @param leadPreview The LeadPreview object to save.
     * @return The saved LeadPreview object.
     */
    public LeadPreview createLeadPreview(LeadPreview leadPreview) {
        return leadPreviewRepository.save(leadPreview);
    }

    /**
     * Retrieve all LeadPreview entries from the database.
     *
     * @return A list of all LeadPreview objects.
     */
    public List<LeadPreview> getAllLeadPreviews() {
        return leadPreviewRepository.findAll();
    }

    /**
     * Retrieve a specific LeadPreview entry by its ID.
     *
     * @param id The ID of the LeadPreview to retrieve.
     * @return The LeadPreview object if found.
     * @throws RuntimeException if the LeadPreview is not found.
     */
    public LeadPreview getLeadPreviewById(Long id) {
        return leadPreviewRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("LeadPreview not found with ID: " + id));
    }

    /**
     * Update an existing LeadPreview entry with new details.
     *
     * @param id                The ID of the LeadPreview to update.
     * @param leadPreviewDetails The new details to update.
     * @return The updated LeadPreview object.
     */
    public LeadPreview updateLeadPreview(Long id, LeadPreview leadPreviewDetails) {
        // Retrieve the existing LeadPreview by ID
        LeadPreview leadPreview = leadPreviewRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("LeadPreview not found with ID: " + id));

        // Update the fields with new values
        leadPreview.setName(leadPreviewDetails.getName());
        leadPreview.setEmail(leadPreviewDetails.getEmail());
        leadPreview.setPhoneNo(leadPreviewDetails.getPhoneNo());
        leadPreview.setLeadOwner(leadPreviewDetails.getLeadOwner());
        leadPreview.setCompany(leadPreviewDetails.getCompany());
        leadPreview.setJobTitle(leadPreviewDetails.getJobTitle());
        leadPreview.setAnnualRevenue(leadPreviewDetails.getAnnualRevenue());
        leadPreview.setLeadSource(leadPreviewDetails.getLeadSource());
        leadPreview.setLastActivity(leadPreviewDetails.getLastActivity());
        leadPreview.setUpcomingActivity(leadPreviewDetails.getUpcomingActivity());
        leadPreview.setReminder(leadPreviewDetails.getReminder());
        leadPreview.setTaskPriority(leadPreviewDetails.getTaskPriority());
        leadPreview.setAssignedTo(leadPreviewDetails.getAssignedTo());
        leadPreview.setNotes(leadPreviewDetails.getNotes());

        // Save the updated LeadPreview to the database
        return leadPreviewRepository.save(leadPreview);
    }

    /**
     * Delete a LeadPreview entry by its ID.
     *
     * @param id The ID of the LeadPreview to delete.
     */
    public void deleteLeadPreview(Long id) {
        // Retrieve the LeadPreview entry by ID
        LeadPreview leadPreview = leadPreviewRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("LeadPreview not found with ID: " + id));
        
        // Delete the entry from the database
        leadPreviewRepository.delete(leadPreview);
    }
}
