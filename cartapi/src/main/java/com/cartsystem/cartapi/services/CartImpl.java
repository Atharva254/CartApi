package com.cartsystem.cartapi.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.cartsystem.cartapi.entities.Cart;
import com.cartsystem.cartapi.repository.CartRepository;

public class CartImpl implements CartInterface {

    @Autowired
    public CartRepository cartRepoObj;

    public List<Cart> fetchallCarts() {
        return cartRepoObj.findAll();
    }

    public Cart fetchCartById(int id) {
        Optional<Cart> ret= cartRepoObj.findById(id);
        if(ret.isPresent()){
            return ret.get();
        }
        else{
            return null;
        }
    }

    public String addNewCart(Cart obj) {
        cartRepoObj.save(obj);
        return "Added successfully!";
    }
}
