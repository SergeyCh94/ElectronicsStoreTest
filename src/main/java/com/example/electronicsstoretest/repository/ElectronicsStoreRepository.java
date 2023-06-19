package com.example.electronicsstoretest.repository;

import com.example.electronicsstoretest.model.ElectronicsStore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElectronicsStoreRepository extends JpaRepository<ElectronicsStore, Long> {
    ElectronicsStore findByName(String name);
}
