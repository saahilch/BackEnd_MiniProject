package com.MiniProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MiniProject.Entities.LeadPreview;






@Repository
public interface LeadPreviewRepository extends JpaRepository<LeadPreview, Long> {
}
