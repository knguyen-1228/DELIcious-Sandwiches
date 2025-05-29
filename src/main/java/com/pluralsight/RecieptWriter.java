package com.pluralsight;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RecieptWriter {

    private static final String filePath ="src/main/resources/receipts.csv";

    public static void saveReceipt(Order order){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            String dateTime = getDateTime();
            writer.write("-------------------------------------------------\n");
            writer.write("\t\t\t\tDELIcious Sandwich\n");
            writer.write(dateTime);
            writer.write("\n=================================================");
            writer.newLine();

            writer.write("Order Summary: \n");
            int count = 1;
            for(Sandwiches sandwiches: order.getSandiches()){
                writer.write("Sandwich #" + count + ":\n");
                writer.write(sandwiches.getSummary());
                writer.write("\n\n");
                count++;
            }

            writer.write("Drink: \n");
            for(Drinks d: order.getDrinksList()){
                writer.write(d.toString());
                writer.write("\n\n");
                count++;
            }
            writer.write("Chips: \n");
            for(Chips c: order.getChipList()){
                writer.write(c.toString());
                writer.write("\n\n");
                count++;
            }
            writer.write(String.format("Subtotal price: $%.2f\n", order.getTotalPrice()));
            double tax = order.getTotalPrice() * .0825;
            writer.write(String.format("Tax: $%.2f\n", tax));
            double total = order.getTotalPrice() + tax;
            writer.write(String.format("Total price: $%.2f\n", total));
            writer.write("-------------------------------------------------\n");
            writer.write("\tThank you for dining at DELIcious Sandwich\n");
            writer.write("=================================================");

            writer.close();
        } catch (IOException e) {
            throw new RuntimeException("Error writing file: ",e);
        }
    }
    public static String getDateTime(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("'Date:' EEEE,MMM d,yyyy 'Time:' HH:mm");
        return now.format(formatter);
    }
    public static void printReceipt(){
        try{
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while((line = reader.readLine() )!= null){
                System.out.println(line);
            }
            reader.close();
        }catch (IOException e){
            throw new RuntimeException("Error reading file: ",e);
        }
    }

}
