package com.kishan.E_Commerce.model;

//this is kind of DTO(DATA TRANSFER OBJECT)

import jakarta.persistence.Entity;

import java.util.Map;

public class OrderRequest {

    //key is product id
    //value is quantity
    private Map<Long, Integer> productQuantities;

    private double totalAmount;

    public Map<Long, Integer> getProductQuantities() {
        return productQuantities;
    }

    public void setProductQuantities(Map<Long, Integer> productQuantities) {
        this.productQuantities = productQuantities;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
