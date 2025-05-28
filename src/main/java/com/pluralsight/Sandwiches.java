package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sandwiches {

    private String breadType;
    private static int breadSize;
    private boolean isToasted;
    private List<String> meat;
    private List<String> cheese;
    private List<String> toppings;
    private List<String> sauces;
    private double sandwichPrice;

    public Sandwiches(String breadType, int breadSize, boolean isToasted, List<String> meat, List<String> cheese, List<String> toppings, List<String> sauces, double sandwichPrice) {
        this.breadType = breadType;
        this.breadSize = breadSize;
        this.isToasted = isToasted;
        this.meat = meat;
        this.cheese = cheese;
        this.toppings = toppings;
        this.sauces = sauces;
        this.sandwichPrice = sandwichPrice;
    }


    public static String breadType(Scanner scanner){
        String breadType = "";
        boolean breadScreen = true;
        while(breadScreen) {
            System.out.println("\n\n" +
                    "----------Bread Screen---------" +
                    "\n\t1) White" +
                    "\n\t2) Wheat" +
                    "\n\t3) Rye" +
                    "\n\t4) Wrap" +
                    "\n\t0) Cancel Order" +
                    "\nWhat bread do you want?");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    breadType = "white";
                    breadScreen = false;
                    break;
                case 2:
                    breadType = "wheat";
                    breadScreen = false;
                    break;
                case 3:
                    breadType = "rye";
                    breadScreen = false;
                    break;
                case 4:
                    breadType = "wrap";
                    breadScreen = false;
                    break;
                case 0:
                    System.out.println("Canceling order");
                    breadScreen = false;
                default:
                    System.out.println("Invalid choice, try again!");

            }
        }
        return breadType;
    }
    public static int sandwichSize(Scanner scanner){
        int breadSize = -1;
        boolean sizeScreen = true;
        while(sizeScreen) {
            System.out.println("\n\n" +
                    "----------Sandwich size Screen---------" +
                    "\n\t1) 4" +
                    "\n\t2) 8" +
                    "\n\t3) 12" +
                    "\n\t0) Cancel Order" +
                    "\nWhat size would you like?");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    breadSize = 4;
                    sizeScreen = false;
                    break;
                case 2:
                    breadSize = 8;
                    sizeScreen = false;
                    break;
                case 3:
                    breadSize = 12;
                    sizeScreen = false;
                    break;
                case 0:
                    System.out.println("Canceling order");
                    sizeScreen = false;
                default:
                    System.out.println("Invalid choice, try again!");

            }
        }
        return breadSize;
    }

    public static List<String> addMeat(Scanner scanner){
        List<String> meatList = new ArrayList<>();
        int choice;
        boolean meatScreen = true;
        while(meatScreen) {
            System.out.println("\n\n" +
                    "----------Meat Selection Screen---------" +
                    "\n\t1) Steak" +
                    "\n\t2) Ham" +
                    "\n\t3) Salami" +
                    "\n\t4) Roast Beef" +
                    "\n\t5) Chicken" +
                    "\n\t6) Bacon" +
                    "\n\t7) Extra Meat" +
                    "\n\t0) Done" +
                    "\nWhat meat do you want?");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1:
                    meatList.add("Steak");
                    break;
                case 2:
                    meatList.add("Ham");
                    break;
                case 3:
                    meatList.add("Salami");
                    break;
                case 4:
                    meatList.add("Roast beef");
                    break;
                case 5:
                    meatList.add("Chicken");
                    break;
                case 6:
                    meatList.add("Bacon");
                    break;
                case 7:
                    meatList.add("Extra Meat");
                    break;
                case 0:
                    meatScreen = false;
                    break;
                default:
                    System.out.println("Invalid choice, try again!");
            }

        }

        return meatList;
    }
    public static List<String> addCheese(Scanner scanner){
        List<String> cheeseList = new ArrayList<>();
        int choice;
        boolean cheeseScreen = true;
        while(cheeseScreen) {
            System.out.println("\n\n" +
                    "----------Cheese Selection Screen---------" +
                    "\n\t1) American" +
                    "\n\t2) Provolone" +
                    "\n\t3) Cheddar" +
                    "\n\t4) Swiss" +
                    "\n\t5) Extra Cheese" +
                    "\n\t0) Done" +
                    "\nWhat cheese do you want?");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1:
                    cheeseList.add("American");
                    break;
                case 2:
                    cheeseList.add("Provolone");
                    break;
                case 3:
                    cheeseList.add("Cheddar");
                    break;
                case 4:
                    cheeseList.add("Swiss");
                    break;
                case 5:
                    cheeseList.add("Extra cheese");
                    break;
                case 0:
                    cheeseScreen = false;
                    break;
                default:
                    System.out.println("Invalid choice, try again!");
            }
        }
        return cheeseList;
    }
    public static List<String> addToppings(Scanner scanner){
        List<String> toppingsList = new ArrayList<>();
        int choice;
        boolean toppingScreen = true;
        while(toppingScreen) {
            System.out.println("\n\n" +
                    "----------Topping Selection Screen---------" +
                    "\n\t1) Lettuce" +
                    "\n\t2) Peppers" +
                    "\n\t3) Onions" +
                    "\n\t4) Tomatoes" +
                    "\n\t5) Jalapeno" +
                    "\n\t6) Cucumber" +
                    "\n\t7) Pickles" +
                    "\n\t8) Guacamole" +
                    "\n\t9) Mushroom" +
                    "\n\t0) Done" +
                    "\nWhat topping do you want?");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1:
                    toppingsList.add("Lettuce");
                    break;
                case 2:
                    toppingsList.add("Peppers");
                    break;
                case 3:
                    toppingsList.add("Onions");
                    break;
                case 4:
                    toppingsList.add("Tomatoes");
                    break;
                case 5:
                    toppingsList.add("Jalapeno");
                    break;
                case 6:
                    toppingsList.add("Cucumber");
                    break;
                case 7:
                    toppingsList.add("Pickles");
                    break;
                case 8:
                    toppingsList.add("Guacamole");
                    break;
                case 9:
                    toppingsList.add("Mushroom");
                    break;
                case 0:
                    toppingScreen = false;
                    break;
                default:
                    System.out.println("Invalid choice, try again!");
            }
        }
        return toppingsList;
    }
    public static List<String> addSauce(Scanner scanner){
        List<String> sauceList = new ArrayList<>();
        int choice;
        boolean sauceScreen = true;
        while(sauceScreen) {
            System.out.println("\n\n" +
                    "----------Sauce Selection Screen---------" +
                    "\n\t1) Mayo" +
                    "\n\t2) Mustard" +
                    "\n\t3) Ketchup" +
                    "\n\t4) Ranch" +
                    "\n\t5) Thousand Island" +
                    "\n\t6) Vinaigrette" +
                    "\n\t7) Salt and Pepper" +
                    "\n\t0) Done" +
                    "\nWhat sauce do you want?");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1:
                    sauceList.add("Mayo");
                    break;
                case 2:
                    sauceList.add("Mustard");
                    break;
                case 3:
                    sauceList.add("Ketchup");
                    break;
                case 4:
                    sauceList.add("Ranch");
                    break;
                case 5:
                    sauceList.add("Thousand Island");
                    break;
                case 6:
                    sauceList.add("Vinaigrette");
                    break;
                case 7:
                    sauceList.add("Salt and Pepper");
                    break;
                case 0:
                    sauceScreen = false;
                    break;
                default:
                    System.out.println("Invalid choice, try again!");
            }
        }
        return sauceList;
    }
    public static boolean isToasted(Scanner scanner){
        boolean isToasted = false;
        int choice;
        boolean toastedScreen = true;
        while(toastedScreen) {
            System.out.println("\n\n" +
                    "----------Toasted Screen---------" +
                    "\n\t1) Yes" +
                    "\n\t2) No" +
                    "\n\t0) Cancel Order" +
                    "\nWhat would you like to do?");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1:
                    isToasted = true;
                    toastedScreen = false;
                    break;
                case 2:
                    isToasted = false;
                    toastedScreen = false;
                    break;
                case 0:
                    toastedScreen = false;
                default:
                    System.out.println("Invalid choice, try again!");
            }
        }
        return isToasted;
    }

    public double getPrice(){
        double price = 0;
        if(breadSize == 4){
            price += 5.50;
            for (String m: meat){
                if(m.equalsIgnoreCase("extra meat")){
                    price += .50;
                }else{
                    price += 1;
                }
            }
            for(String c: cheese){
                if(c.equalsIgnoreCase("extra cheese")){
                    price += .30;
                }else{
                    price += .75;
                }
            }
        } else if (breadSize == 8) {
            price += 7.00;
            for (String m: meat){
                if(m.equalsIgnoreCase("extra meat")){
                    price += 1;
                }else{
                    price += 2;
                }
            }
            for(String c: cheese){
                if(c.equalsIgnoreCase("extra cheese")){
                    price += .60;
                }else{
                    price += 1.50;
                }
            }
        }else{
            price += 8.50;
            for (String m: meat){
                if(m.equalsIgnoreCase("extra meat")){
                    price += 1.50;
                }else{
                    price += 3;
                }
            }
            for(String c: cheese){
                if(c.equalsIgnoreCase("extra cheese")){
                    price += .90;
                }else{
                    price += 2.25;
                }
            }
        }

        return price;

    }
    public static void getSummary(){

    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public int getBreadSize() {

        return breadSize;
    }

    public void setBreadSize(int breadSize) {
        this.breadSize = breadSize;
    }

    public boolean isToasted() {

        return isToasted;
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }

    public List<String> getMeat() {
        return meat;
    }

    public void setMeat(List<String> meat) {
        this.meat = meat;
    }

    public List<String> getCheese() {
        return cheese;
    }

    public void setCheese(List<String> cheese) {
        this.cheese = cheese;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    public List<String> getSauces() {
        return sauces;
    }

    public void setSauces(List<String> sauces) {
        this.sauces = sauces;
    }

    public double getSandwichPrice() {
        return sandwichPrice;
    }

    public void setSandwichPrice(double sandwichPrice) {
        this.sandwichPrice = sandwichPrice;
    }
}
