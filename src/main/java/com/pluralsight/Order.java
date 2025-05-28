package com.pluralsight;

import java.util.List;
import java.util.Scanner;

public class Order {
    private List<Order> orders;
    private double totalPrice;

    public Order(List<Order> orders, double totalPrice) {
        this.orders = orders;
        this.totalPrice = totalPrice;
    }
    public Sandwiches addSandwich(Scanner scanner){
        String bread = Sandwiches.breadType(scanner);
        int size = Sandwiches.sandwichSize(scanner);
        boolean toasted = Sandwiches.isToasted(scanner);
        List<String> meat = Sandwiches.addMeat(scanner);
        List<String> cheese = Sandwiches.addCheese(scanner);
        List<String> toppings = Sandwiches.addToppings(scanner);
        List<String> sauces = Sandwiches.addSauce(scanner);
        Sandwiches sandwich = new Sandwiches(bread,size,toasted,meat,cheese,toppings,sauces,price)

        double price = Sandwiches.getPrice();

        return new Sandwiches(bread,size,toasted,meat,cheese,toppings,sauces,price);
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
