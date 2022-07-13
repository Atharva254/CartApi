package com.cartsystem.cartapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cartsystem.cartapi.entities.Product;
import com.cartsystem.cartapi.repository.ProductRepository;


@Service
public class ProductImpl implements ProductInterface {
    
    @Autowired
    public ProductRepository productRepoObj;
    
    public List<Product> fetchAllProducts() {
        return productRepoObj.findAll();
    }

    public Product fetchProductById(int id){
        Optional<Product> ret = productRepoObj.findById(id);
        if(ret.isPresent()){
            return ret.get();
        }
        else{
            return null;
        }
    }
    
    public String addNewProduct(Product productObj){
        productRepoObj.save(productObj);
        return "Product added!";
    }

}
