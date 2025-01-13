package com.MiniProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MiniProject.Entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}
