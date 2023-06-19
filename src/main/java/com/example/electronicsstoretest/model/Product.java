package com.example.electronicsstoretest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String brand;

    private double price;

    private String description;

    private boolean availability;

    @ManyToOne
    @JoinColumn(name = "store_id")
    private ElectronicsStore store;

}
