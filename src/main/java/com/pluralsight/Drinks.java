package com.pluralsight;

import java.util.Scanner;


public class Drinks{
    private String brands;
    private String size;
    private double price;
    static Scanner myScanner = new Scanner(System.in);

    public Drinks(String brands, String size, double price) {
        this.brands = brands;
        this.size = size;
        this.price = price;
    }
    public static Drinks selectDrinks(Scanner scanner){
        boolean drinkSizeScreen = true;
        while(drinkSizeScreen) {
            int drinkSize =  drinkSizeChoice();
            switch (drinkSize) {
                case 1:
                    boolean drinkBrandScreen = true;
                    while(drinkBrandScreen){
                        int drinkBrand = drinkChoice();
                        switch (drinkBrand){
                            case 1:
                                drinkBrandScreen = false;
                                return new Drinks("Coke", "Small", 2.00);
                            case 2:
                                drinkBrandScreen = false;
                                return new Drinks("Dr.Pepper", "Small", 2.00);
                            case 3:
                                drinkBrandScreen = false;
                                return new Drinks("Pepsi", "Small", 2.00);
                            case 4:
                                drinkBrandScreen = false;
                                return new Drinks("Sprite", "Small", 2.00);
                            case 0:
                                System.out.println("Canceling order");
                                drinkSizeScreen = false;
                                return null;
                            default:
                                System.out.println("Invalid choice, try again!");
                        }
                        break;
                    }
                case 2:
                    drinkBrandScreen = true;
                    while(drinkBrandScreen){
                        int drinkBrand = drinkChoice();
                        switch (drinkBrand){
                            case 1:
                                drinkBrandScreen = false;
                                return new Drinks("Coke", "Medium", 2.50);
                            case 2:
                                drinkBrandScreen = false;
                                return new Drinks("Dr.Pepper", "Medium", 2.50);
                            case 3:
                                drinkBrandScreen = false;
                                return new Drinks("Pepsi", "Medium", 2.50);
                            case 4:
                                drinkBrandScreen = false;
                                return new Drinks("Sprite", "Medium", 2.50);
                            case 0:
                                System.out.println("Canceling order");
                                drinkSizeScreen = false;
                                return null;
                            default:
                                System.out.println("Invalid choice, try again!");
                        }
                        break;
                    }

                case 3:
                    drinkBrandScreen = true;
                    while(drinkBrandScreen){
                        int drinkBrand = drinkChoice();
                        switch (drinkBrand){
                            case 1:
                                drinkBrandScreen = false;
                                return new Drinks("Coke", "Large", 3.00);
                            case 2:
                                drinkBrandScreen = false;
                                return new Drinks("Dr.Pepper", "Large", 3.00);
                            case 3:
                                drinkBrandScreen = false;
                                return new Drinks("Pepsi", "Large", 3.00);
                            case 4:
                                drinkBrandScreen = false;
                                return new Drinks("Sprite", "Large", 3.00);
                            case 0:
                                System.out.println("Canceling order");
                                drinkSizeScreen = false;
                                return null;
                            default:
                                System.out.println("Invalid choice, try again!");
                        }
                        break;
                    }

                case 0:
                    System.out.println("Canceling order");
                    drinkSizeScreen = false;
                    return null;
                default:
                    System.out.println("Invalid choice, try again!");
            }
        }
        return null;
    }
    public static int drinkSizeChoice(){
        int choice = -1;
        System.out.println("\n\n" +
                "----------Drink Size Screen---------" +
                "\n\t1) Small" +
                "\n\t2) Medium" +
                "\n\t3) Large" +
                "\n\t0) Cancel Order" +
                "\nWhat size would you like?");
        if(myScanner.hasNextInt()) {
            choice = myScanner.nextInt();
            myScanner.nextLine();
            if (choice <= 3 || choice >= 0) {
                return choice;
            } else {
                System.out.println("Please choose a valid input (0 or 4)");
            }
        }else{
            myScanner.nextLine();
            System.out.println("Invalid input!");
        }
        return choice;
    }
    public static int drinkChoice(){
        int choice = -1;
        System.out.println("\n\n" +
                "----------Drink Screen---------" +
                "\n\t1) Coke" +
                "\n\t2) Dr.Pepper" +
                "\n\t3) Pepsi" +
                "\n\t4) Sprite" +
                "\n\t0) Cancel Order" +
                "\nWhat Drink would you like?");
        if(myScanner.hasNextInt()) {
            choice = myScanner.nextInt();
            myScanner.nextLine();
            if (choice <= 4 || choice >= 0) {
                return choice;
            } else {
                System.out.println("Please choose a valid input (0 or 4)");
            }
        }else{
            myScanner.nextLine();
            System.out.println("Invalid input!");
        }
        return choice;
    }
    @Override
    public String toString(){
        return size + " " + brands + " $" + String.format("%.2f", price);
    }

    public String getBrands() {
        return brands;
    }

    public void setBrands(String brands) {
        this.brands = brands;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
