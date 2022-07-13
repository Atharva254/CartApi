package com.cartsystem.cartapi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString
@Entity
@Table(name="product", schema = "cartapi")
public class Product {
    
    @Id
    @Column(name= "product_id")
    public int productId;

    String productName;

    String productImg;

    int productQty=1;

    float productPrice;

    boolean productStatus;

    @ManyToOne
    @JoinColumn(name= "cart_id", nullable = false)
    private Cart cart;
}