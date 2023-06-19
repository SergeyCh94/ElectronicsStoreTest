package com.example.electronicsstoretest.controller;

import com.example.electronicsstoretest.model.ElectronicsStore;
import com.example.electronicsstoretest.service.ElectronicsStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stores")
public class ElectronicsStoreController {

    private final ElectronicsStoreService storeService;

    @Autowired
    public ElectronicsStoreController(ElectronicsStoreService storeService) {
        this.storeService = storeService;
    }

    @PostMapping
    public ElectronicsStore createStore(@RequestBody ElectronicsStore store) {
        return storeService.saveStore(store);
    }


    @GetMapping("/{id}")
    public ElectronicsStore getStoreById(@PathVariable Long id) {
        return storeService.getStoreById(id);
    }

    @GetMapping
    public List<ElectronicsStore> getAllStores() {
        return storeService.getAllStores();
    }

    @DeleteMapping("/{id}")
    public void deleteStore(@PathVariable Long id) {
        storeService.deleteStore(id);
    }
}
