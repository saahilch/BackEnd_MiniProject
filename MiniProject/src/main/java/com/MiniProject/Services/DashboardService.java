package com.MiniProject.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MiniProject.Entities.Dashboard;
import com.MiniProject.Repository.DashboardRepository;

/**
 * Service class for managing dashboard operations.
 * Contains business logic to handle CRUD operations on Dashboard data.
 */
@Service
public class DashboardService {

    // Injecting the DashboardRepository to interact with the database
    @Autowired
    private DashboardRepository dashboardRepository;

    /**
     * Create a new dashboard entry.
     *
     * @param dashboard The dashboard object to save.
     * @return The saved Dashboard object.
     */
    public Dashboard createDashboard(Dashboard dashboard) {
        return dashboardRepository.save(dashboard);
    }

    /**
     * Retrieve all dashboard entries from the database.
     *
     * @return A list of all Dashboard objects.
     */
    public List<Dashboard> getAllDashboards() {
        return dashboardRepository.findAll();
    }

    /**
     * Retrieve a single dashboard entry by its ID.
     *
     * @param id The ID of the dashboard entry to retrieve.
     * @return The Dashboard object if found.
     * @throws RuntimeException if the dashboard entry is not found.
     */
    public Dashboard getDashboardById(Long id) {
        return dashboardRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Dashboard entry not found"));
    }

    /**
     * Update an existing dashboard entry with new details.
     *
     * @param id         The ID of the dashboard entry to update.
     * @param newDetails The new details to update the dashboard entry with.
     * @return The updated Dashboard object.
     */
    public Dashboard updateDashboard(Long id, Dashboard newDetails) {
        // Fetch the existing dashboard entry by ID
        Dashboard existingDashboard = getDashboardById(id);

        // Update fields with new values
        existingDashboard.setTotalSales(newDetails.getTotalSales());
        existingDashboard.setThisMonthSales(newDetails.getThisMonthSales());
        existingDashboard.setTotalCustomers(newDetails.getTotalCustomers());
        existingDashboard.setTotalSuppliers(newDetails.getTotalSuppliers());
        existingDashboard.setTotalProducts(newDetails.getTotalProducts());
        existingDashboard.setTotalProjects(newDetails.getTotalProjects());
        existingDashboard.setTotalLeads(newDetails.getTotalLeads());
        existingDashboard.setTotalTasks(newDetails.getTotalTasks());

        // Save the updated dashboard entry to the database
        return dashboardRepository.save(existingDashboard);
    }

    /**
     * Delete a dashboard entry by its ID.
     *
     * @param id The ID of the dashboard entry to delete.
     */
    public void deleteDashboard(Long id) {
        dashboardRepository.deleteById(id);
    }
}
