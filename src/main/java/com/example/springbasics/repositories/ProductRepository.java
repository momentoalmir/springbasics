package com.example.springbasics.repositories;

import com.example.springbasics.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.Repository; // Not needed because JpaRepository already has it

import java.util.UUID;

// @Repository - Not needed because JpaRepository already has it
public interface ProductRepository extends JpaRepository<ProductModel, UUID> {
}
