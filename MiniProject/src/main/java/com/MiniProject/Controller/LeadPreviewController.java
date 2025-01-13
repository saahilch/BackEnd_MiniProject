package com.MiniProject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.MiniProject.Entities.LeadPreview;
import com.MiniProject.Repository.LeadPreviewRepository;

/**
 * Controller class to manage LeadPreview entities.
 * This class handles all HTTP requests for CRUD operations on LeadPreview.
 */
@RestController
@RequestMapping("/api/lead-previews") // Base URL for all LeadPreview-related endpoints
public class LeadPreviewController {

    // Injecting the LeadPreviewRepository for database operations
    @Autowired
    private LeadPreviewRepository leadPreviewRepository;

    /**
     * Create a new LeadPreview.
     *
     * @param leadPreview The LeadPreview object sent in the request body.
     * @return The created LeadPreview object with HTTP 201 (Created) status.
     */
    @PostMapping("/add")
    public ResponseEntity<LeadPreview> createLeadPreview(@RequestBody LeadPreview leadPreview) {
        LeadPreview savedLeadPreview = leadPreviewRepository.save(leadPreview);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedLeadPreview);
    }

    /**
     * Get all LeadPreview records.
     *
     * @return A list of all LeadPreview objects in the database.
     */
    @GetMapping
    public List<LeadPreview> getAllLeadPreviews() {
        return leadPreviewRepository.findAll();
    }

    /**
     * Get a specific LeadPreview by ID.
     *
     * @param id The ID of the LeadPreview to retrieve.
     * @return The LeadPreview object if found, otherwise throws a 404 (Not Found) exception.
     */
    @GetMapping("/{id}")
    public ResponseEntity<LeadPreview> getLeadPreviewById(@PathVariable Long id) {
        LeadPreview leadPreview = leadPreviewRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "LeadPreview not found"));
        return ResponseEntity.ok(leadPreview);
    }

    /**
     * Update an existing LeadPreview.
     *
     * @param id                The ID of the LeadPreview to update.
     * @param leadPreviewDetails The updated details sent in the request body.
     * @return The updated LeadPreview object.
     */
    @PutMapping("/{id}")
    public ResponseEntity<LeadPreview> updateLeadPreview(@PathVariable Long id,
                                                         @RequestBody LeadPreview leadPreviewDetails) {
        // Fetch the existing LeadPreview by ID
        LeadPreview leadPreview = leadPreviewRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "LeadPreview not found"));

        // Update all fields of the existing LeadPreview
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

        // Save the updated LeadPreview
        LeadPreview updatedLeadPreview = leadPreviewRepository.save(leadPreview);
        return ResponseEntity.ok(updatedLeadPreview);
    }

    /**
     * Delete a LeadPreview by ID.
     *
     * @param id The ID of the LeadPreview to delete.
     * @return HTTP 204 (No Content) status if the deletion is successful.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLeadPreview(@PathVariable Long id) {
        // Fetch the LeadPreview by ID
        LeadPreview leadPreview = leadPreviewRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "LeadPreview not found"));

        // Delete the LeadPreview
        leadPreviewRepository.delete(leadPreview);
        return ResponseEntity.noContent().build();
    }
}
