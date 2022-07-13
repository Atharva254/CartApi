package com.cartsystem.cartapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cartsystem.cartapi.entities.Cart;

public interface CartRepository extends JpaRepository<Cart,Integer> {
    
}
