package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {
    private List<Sandwiches> sandwiches;
    private List<Drinks> drinksList;
    private List<Chips> chipList;
    private double totalPrice;

    public Order() {
        this.sandwiches = new ArrayList<>();
        this.chipList = new ArrayList<>();
        this.drinksList = new ArrayList<>();
        this.totalPrice = totalPrice;
    }
    public void addSandwich(Scanner scanner){
        String bread = Sandwiches.breadType(scanner);
        int size = Sandwiches.sandwichSize(scanner);
        boolean toasted = Sandwiches.isToasted(scanner);
        List<String> meat = Sandwiches.addMeat(scanner);
        List<String> cheese = Sandwiches.addCheese(scanner);
        List<String> toppings = Sandwiches.addToppings(scanner);
        List<String> sauces = Sandwiches.addSauce(scanner);

        Sandwiches sandwich = new Sandwiches(bread,size,toasted,meat,cheese,toppings,sauces,0);
        double price = sandwich.getPrice();
        sandwich.setSandwichPrice(price);

        sandwiches.add(sandwich);
        totalPrice += price;


    }

    public void addDrink(Scanner scanner){
        Drinks drinks = Drinks.selectDrinks(scanner);
        if(drinks != null){
            drinksList.add(drinks);
            totalPrice += drinks.getPrice();
        }

    }

    public void addChips(Scanner scanner){
        Chips chips = Chips.selectChips(scanner);
        if(chips != null){
            chipList.add(chips);
            totalPrice += chips.getPrice();
        }
    }

    public void getOrderSummary(){
        System.out.println("----------Order Summary---------");
        int count = 1;
        for(Sandwiches s: sandwiches){
            System.out.println("Sandwich #" + count + ": $" + s.getPrice());
            System.out.println(s.getSummary());
            System.out.println();
            count++;
        }
        for (Chips chip: chipList){
            System.out.println("Chip: " + chip.getBrands() + " $" + chip.getPrice());
        }
        for(Drinks drink: drinksList){
            System.out.println("Drink: " + drink.getSize() + " " + drink.getBrands() + " $" +drink.getPrice());
        }
        System.out.println("\n\n");
        System.out.printf("Subtotal: $%.2f\n", totalPrice);
        double tax = totalPrice * .0825;
        System.out.printf("Tax: $%.2f\n", tax);
        double total = totalPrice + tax;
        System.out.printf("Total price: $%.2f\n", total);

    }


    public List<Sandwiches> getSandiches(){
        return sandwiches;
    }

    public void setSandwiches(List<Sandwiches> sandwiches) {
        this.sandwiches = sandwiches;
    }

    public List<Drinks> getDrinksList() {
        return drinksList;
    }

    public void setDrinksList(List<Drinks> drinksList) {
        this.drinksList = drinksList;
    }

    public List<Chips> getChipList() {
        return chipList;
    }

    public void setChipList(List<Chips> chipList) {
        this.chipList = chipList;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
