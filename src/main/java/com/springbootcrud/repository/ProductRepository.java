package com.springbootcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootcrud.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
