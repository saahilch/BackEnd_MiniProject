package com.MiniProject.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MiniProject.Entities.Sale;
import com.MiniProject.Repository.SaleRepository;

import java.util.List;
import java.util.Optional;

@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;

    public Sale saveSale(Sale sale) {
        return saleRepository.save(sale);
    }

    public Sale updateSale(Long id, Sale saleDetails) {
        Sale existingSale = saleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Sale not found with id " + id));
        // Update fields
        existingSale.setDate(saleDetails.getDate());
        existingSale.setTerms(saleDetails.getTerms());
        existingSale.setPartyName(saleDetails.getPartyName());
        // Add remaining fields similarly
        return saleRepository.save(existingSale);
    }

    public void deleteSale(Long id) {
        saleRepository.deleteById(id);
    }

    public List<Sale> findAllSales() {
        return saleRepository.findAll();
    }

    public Optional<Sale> findSaleById(Long id) {
        return saleRepository.findById(id);
    }
}

