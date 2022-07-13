package com.cartsystem.cartapi.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cartsystem.cartapi.entities.Cart;
import com.cartsystem.cartapi.services.CartImpl;



@RestController
public class CartController {

    @Autowired
    private CartImpl cartSrvObj; 

    @GetMapping(value = "/cart/fetchall")
    public List<Cart> fetchallCarts(){
        return cartSrvObj.fetchallCarts();
    }

    @GetMapping(value = "/cart/fetchbyid/{id}")
    public Cart fetchCartById(@Param("id") int id){
        return cartSrvObj.fetchCartById(id);
    }

    @PostMapping(value = "cart/addnew")
    public String addNewCart(@RequestBody Cart obj){
        return cartSrvObj.addNewCart(obj);
    }
    
    
}
