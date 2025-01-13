package com.MiniProject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.MiniProject.Entities.Sale;
import com.MiniProject.Services.SaleService;

import java.util.List;

/**
 * Controller class for handling CRUD operations for Sale entities. Provides
 * RESTful APIs to interact with Sale data.
 */
@RestController
@RequestMapping("/api/sales") // Base URL for all Sale-related endpoints
public class SaleController {

	// Injecting the SaleService to handle business logic
	@Autowired
	private SaleService saleService;

	/**
	 * API to add a new Sale.
	 *
	 * @param sale The Sale object sent in the request body.
	 * @return The saved Sale object.
	 */
	@PostMapping("/add")
	public Sale saveSale(@RequestBody Sale sale) {
		return saleService.saveSale(sale);
	}

	/**
	 * API to update an existing Sale by ID.
	 *
	 * @param id          The ID of the Sale to update.
	 * @param saleDetails The updated details sent in the request body.
	 * @return The updated Sale object.
	 */
	@PutMapping("/{id}")
	public Sale updateSale(@PathVariable Long id, @RequestBody Sale saleDetails) {
		return saleService.updateSale(id, saleDetails);
	}

	/**
	 * API to delete a Sale by ID.
	 *
	 * @param id The ID of the Sale to delete.
	 * @return HTTP 200 OK if the deletion is successful.
	 */
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteSale(@PathVariable Long id) {
		saleService.deleteSale(id);
		return ResponseEntity.ok().build();
	}

	/**
	 * API to get all Sale records.
	 *
	 * @return A list of all Sale objects in the database.
	 */
	@GetMapping
	public List<Sale> findAllSales() {
		return saleService.findAllSales();
	}

	/**
	 * API to get a specific Sale by ID.
	 *
	 * @param id The ID of the Sale to retrieve.
	 * @return The Sale object if found, or HTTP 404 if not found.
	 */
	@GetMapping("/{id}")
	public ResponseEntity<Sale> findSaleById(@PathVariable Long id) {
		return saleService.findSaleById(id).map(ResponseEntity::ok) // If found, return HTTP 200 OK with the Sale object
				.orElse(ResponseEntity.notFound().build()); // If not found, return HTTP 404 Not Found
	}
}
