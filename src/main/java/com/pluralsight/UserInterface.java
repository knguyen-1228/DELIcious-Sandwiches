package com.pluralsight;

import java.util.Scanner;

public class UserInterface {

    static Scanner myScanner = new Scanner(System.in);

    public static void display(){
        loadingBar("Loading", 25,60);
        boolean appRunning = true;
        while(appRunning){
            int userChoice = homeScreen();
            switch(userChoice){
                case 1:
                    boolean orderRunning = true;
                    while(orderRunning){
                        int orderChoice = orderScreen();
                        switch(orderChoice){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 0:
                                orderRunning = false;
                                System.out.println("Returning to Home Screen");
                                break;
                        }
                    }
                    break;
                case 0:
                    appRunning = false;
                    System.out.println("Thank you for visiting The DELIcious Sandwiches, Have a nice day!");
                    break;
            }
        }
    }
    public static void loadingBar(String message, int length, long timeInterval){
        //creating variables for the solid block and light shade block
        String incomplete = "░";
        String complete = "█";
        //creating a string builder
        StringBuilder builder = new StringBuilder();
        //for loop to add light shade blocks into string
        for(int i = 0; i<length; i++){
            builder.append(incomplete);
        }
        //prints the message
        System.out.println(message);
        //for loop for the progress bar
        for(int i = 0; i < length; i++){
            //replacing incomplete with complete
            builder.replace(i, i+1, String.valueOf(complete));
            //calculate the percentage of current completion
            int percent = (i +1)* 100 /length;
            //moves the cursor to the beginning and overwrites the line also prints the progress bar
            String progressBar = "\r" + builder + " " + percent + "%";
            System.out.print(progressBar);
            //includes a pause in between
            try{
                Thread.sleep(timeInterval);
            }catch (InterruptedException ignored){

            }
        }
        System.out.println("\n");

    }
    public static int homeScreen(){
        int choice = -1;
        System.out.println("\n\n" +
                "Welcome to The DELIcious Sandwiches" +
                "\n\t1) New Order" +
                "\n\t0) Exit" +
                "\nWhat would you like to do?");
        if(myScanner.hasNextInt()) {
            choice = myScanner.nextInt();
            myScanner.nextLine();
            if (choice == 1 || choice == 0) {
                return choice;
            } else {
                System.out.println("Please choose a valid input (0 or 1)");
            }
        }else{
            myScanner.nextLine();
            System.out.println("Invalid input!");
        }
        return choice;
    }
    public static int orderScreen(){
        int choice = -1;
        System.out.println("\n\n" +
                "----------Order Screen---------" +
                "\n\t1) Add Sandwich" +
                "\n\t2) Add Drink" +
                "\n\t3) Add Chips" +
                "\n\t4) Checkout" +
                "\n\t0) Cancel Order" +
                "\nWhat would you like to do?");
        if(myScanner.hasNextInt()) {
            choice = myScanner.nextInt();
            myScanner.nextLine();
            if (choice >= 0 && choice <= 4) {
                return choice;
            } else {
                System.out.println("Please choose a valid input between 0 and 4");
            }
        }else{
            myScanner.nextLine();
            System.out.println("Invalid input!");
        }
        return choice;
    }

}
