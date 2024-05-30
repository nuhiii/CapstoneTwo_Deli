package com.ps;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
    public static void saveOrder(Order order) {
        try {
            BufferedWriter buffWriter = new BufferedWriter(new FileWriter("receipts/" + order.getOrderID() + ".txt"));
            buffWriter.write(order.toString());
        } catch (IOException e) {
            System.out.println("An error occurred while saving the order.");
            e.printStackTrace();
        }
    }
}
