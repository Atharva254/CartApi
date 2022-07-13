package com.cartsystem.cartapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cartsystem.cartapi.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{
    
}
