package com.ps;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int selection;
        System.out.println("Please select from the following UI Display options:");
        System.out.println("------------------------------");
        System.out.println("1) CLI");
        System.out.println("2) GUI");
        System.out.println("------------------------------");
        System.out.print("Selection: ");

        try {
            selection = scanner.nextInt();
            scanner.nextLine();

            switch (selection) {
                case 1:
                    UserInterface userInterface = new UserInterface();
                    userInterface.displayHomeScreen();
                    break;
                case 2:
                    GUI gui = new GUI();
                    gui.displayHomeScreen();
                    break;
                default:
                    System.out.println("Invalid Choice. Try Again.\n");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("ERROR! Invalid Input Type. Please enter a number!\n");
            scanner.nextLine();
        }

    }
}