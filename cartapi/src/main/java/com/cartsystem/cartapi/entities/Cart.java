package com.cartsystem.cartapi.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter
@Entity
public class Cart {
    
    @Id
    @Column(name= "cart_id")
    public int cartId;

    @Column(name= "cart_owner_name")
    public String cartOwnerName;

}