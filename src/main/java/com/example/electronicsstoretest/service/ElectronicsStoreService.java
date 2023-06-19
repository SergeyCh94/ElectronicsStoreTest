package com.example.electronicsstoretest.service;

import com.example.electronicsstoretest.model.ElectronicsStore;
import com.example.electronicsstoretest.repository.ElectronicsStoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElectronicsStoreService {

    private final ElectronicsStoreRepository storeRepository;

    @Autowired
    public ElectronicsStoreService(ElectronicsStoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    public ElectronicsStore saveStore(ElectronicsStore store) {
        return storeRepository.save(store);
    }

    public ElectronicsStore getStoreById(Long id) {
        return storeRepository.findById(id).orElse(null);
    }

    public List<ElectronicsStore> getAllStores() {
        return storeRepository.findAll();
    }

    public void deleteStore(Long id) {
        storeRepository.deleteById(id);
    }
}