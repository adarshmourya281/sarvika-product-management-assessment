package com.am.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.am.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}