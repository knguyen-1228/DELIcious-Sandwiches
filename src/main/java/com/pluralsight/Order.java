package com.pluralsight;

import java.util.List;

public class Order {
    private List<Order> orders;
    private double totalPrice;

    public Order(List<Order> orders, double totalPrice) {
        this.orders = orders;
        this.totalPrice = totalPrice;
    }
    public static void addSandwich(){

    }
    public static void addDrink(){

    }
    public static void addChips(){

    }
    public static void getOrderSummary(){

    }
    public static void getSandwiches(){

    }
    public static void getChips(){

    }
    public static void getDrinks(){

    }


    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
