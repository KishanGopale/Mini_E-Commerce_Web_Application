package com.kishan.E_Commerce.dto;

import java.util.Date;
import java.util.List;

public class OrderDTO {

    private Long id;
    private double totalAmount;
    private String status;
    private Date orderDate;
    private String userName;
    private String email;

    private List<OrderItemDTO> orderItems; //jab bhi koi user oreder karega wo

    public OrderDTO(Long id, double totalAmount, String status, String userName, List<OrderItemDTO> orderItems) {
        this.id = id;
        this.totalAmount = totalAmount;
        this.status = status;
        this.userName = userName;
        this.orderDate = orderDate;
        this.email = email;
        this.orderItems = orderItems;
    }

    public OrderDTO(Long id, double totalAmount, String status, Date orderDate, List<OrderItemDTO> orderItems) {
        this.id = id;
        this.totalAmount = totalAmount;
        this.status = status;
        this.orderDate = orderDate;
        this.orderItems = orderItems;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<OrderItemDTO> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItemDTO> orderItems) {
        this.orderItems = orderItems;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
