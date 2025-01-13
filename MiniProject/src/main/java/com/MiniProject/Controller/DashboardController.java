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

import com.MiniProject.Entities.Dashboard;
import com.MiniProject.Services.DashboardService;

/**
 * The DashboardController class handles all the HTTP requests for the 
 * Dashboard API endpoints. This includes operations like adding, updating, 
 * retrieving, and deleting dashboard data.
 */
@RestController
@RequestMapping("/api/dashboards")
public class DashboardController {

    // Injecting the DashboardService to handle business logic
    @Autowired
    private DashboardService dashboardService;

    /**
     * Create a new dashboard entry.
     * 
     * @param dashboard The dashboard data sent in the request body.
     * @return The created dashboard with a 201 (CREATED) status.
     */
    @PostMapping("/add")
    public ResponseEntity<Dashboard> createDashboard(@RequestBody Dashboard dashboard) {
        // Call the service to save the dashboard data to the database
        return ResponseEntity.status(HttpStatus.CREATED).body(dashboardService.createDashboard(dashboard));
    }

    /**
     * Retrieve all dashboard entries from the database.
     * 
     * @return A list of all dashboard entries.
     */
    @GetMapping
    public ResponseEntity<List<Dashboard>> getAllDashboards() {
        // Fetch all dashboards from the database and return them
        return ResponseEntity.ok(dashboardService.getAllDashboards());
    }

    /**
     * Retrieve a single dashboard entry by its ID.
     * 
     * @param id The ID of the dashboard entry to retrieve.
     * @return The dashboard entry with the specified ID.
     */
    @GetMapping("/{id}")
    public ResponseEntity<Dashboard> getDashboardById(@PathVariable Long id) {
        // Fetch a dashboard by its ID and return it
        return ResponseEntity.ok(dashboardService.getDashboardById(id));
    }

    /**
     * Update an existing dashboard entry.
     * 
     * @param id The ID of the dashboard entry to update.
     * @param newDetails The updated dashboard data sent in the request body.
     * @return The updated dashboard entry.
     */
    @PutMapping("/{id}")
    public ResponseEntity<Dashboard> updateDashboard(@PathVariable Long id, @RequestBody Dashboard newDetails) {
        // Update the dashboard data and return the updated entry
        return ResponseEntity.ok(dashboardService.updateDashboard(id, newDetails));
    }

    /**
     * Delete a dashboard entry by its ID.
     * 
     * @param id The ID of the dashboard entry to delete.
     * @return A response with no content (204) status if the deletion is successful.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDashboard(@PathVariable Long id) {
        // Delete the dashboard entry with the given ID
        dashboardService.deleteDashboard(id);
        return ResponseEntity.noContent().build();
    }
}
