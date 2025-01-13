package com.MiniProject.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MiniProject.Entities.Lead;

@Repository
public interface LeadRepository extends JpaRepository<Lead, Long> {
	List<Lead> findByAssignedTo(String assignedTo);

	List<Lead> findByTag(String tag);

	List<Lead> findByStatus(String status);
}
