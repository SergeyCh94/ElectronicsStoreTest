package com.example.electronicsstoretest.repository;

import com.example.electronicsstoretest.model.ElectronicsStore;
import com.example.electronicsstoretest.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByStore(ElectronicsStore store);
}