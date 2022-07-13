package com.cartsystem.cartapi.controller;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cartsystem.cartapi.entities.Product;
import com.cartsystem.cartapi.services.ProductImpl;

@RestController
public class ProductController {
    private ProductImpl ProductSrvObj;

    @GetMapping(value = "product/addnew")
    public String addNewProduct(@RequestBody Product productObj){
        return ProductSrvObj.addNewProduct(productObj);
    }

    @GetMapping(value = "/product/fetchbyid/{id}")
    public Product fetchProductById(@Param("id") int id){
        return ProductSrvObj.fetchProductById(id);
    }

    @GetMapping(value = "/product/fetchall")
    public List<Product> fetchAllProducts(){
        return ProductSrvObj.fetchAllProducts();
    }

}
