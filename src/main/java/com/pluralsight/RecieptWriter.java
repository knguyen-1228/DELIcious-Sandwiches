package com.pluralsight;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RecieptWriter {

    private static final String filePath ="src/main/resources/receipts.csv";

    public static void saveReceipt(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            String dateTime = getDateTime();
            writer.write("-------------------------------------------------\n");
            writer.write("\t\t\t\tDELIcious Sandwich\n");
            writer.write(dateTime);
            writer.write("\n=================================================");
            writer.newLine();


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
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("'Date:' MM-dd-yyyy 'Time:' HH:mm:ss");
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
