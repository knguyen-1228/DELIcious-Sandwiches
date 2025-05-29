package com.pluralsight;

import java.util.Scanner;

public class Chips {
    private String brands;
    private double price;

    public Chips(String brands, double price) {
        this.brands = brands;
        this.price = price;
    }

    public static Chips selectChips(Scanner scanner){
        boolean chipScreen = true;
        while(chipScreen) {
            System.out.println("\n\n" +
                    "----------Chip Screen---------" +
                    "\n\t1) Lay's" +
                    "\n\t2) Doritos" +
                    "\n\t3) Sun chips" +
                    "\n\t4) Ruffles" +
                    "\n\t0) Cancel Order" +
                    "\nWhat bread do you want?");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    chipScreen = false;
                    return new Chips("Lay's", 1.50);
                case 2:
                    chipScreen = false;
                    return new Chips("Doritos", 1.50);
                case 3:
                    chipScreen = false;
                    return new Chips("Sun chips", 1.50);
                case 4:
                    chipScreen = false;
                    return new Chips("Ruffles", 1.50);
                case 0:
                    System.out.println("Canceling order");
                    chipScreen = false;
                    return null;
                default:
                    System.out.println("Invalid choice, try again!");

            }
        }
        return null;
    }
    @Override
    public String toString(){
        return brands + " $" + String.format("%.2f", price);
    }


    public String getBrands() {
        return brands;
    }

    public void setBrands(String brands) {
        this.brands = brands;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
