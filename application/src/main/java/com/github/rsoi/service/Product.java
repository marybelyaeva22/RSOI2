package com.github.rsoi.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private int IDProduct;
    private String nameProduct;
    private int amountOfOrders;
    private double avgMrk;

    public Product(int IDProduct, String nameProduct, int amountOfOrders) {
        this.IDProduct = IDProduct;
        this.nameProduct = nameProduct;
        this.amountOfOrders = amountOfOrders;
    }
}
