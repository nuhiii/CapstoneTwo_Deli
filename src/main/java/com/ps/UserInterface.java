package com.ps;

import java.util.Scanner;

public class UserInterface {
    private static final Scanner scanner = new Scanner(System.in);
    public static void displayHomeScreen(){
        int selection;
        do{
            System.out.println("Welcome To The DELI-cious Sandwich Shop!");
            System.out.println("Please select from the appropriate menu options: ");
            System.out.println("------------------------------");
            System.out.println("1) New Order");
            System.out.println("0) Exit");
            System.out.println("------------------------------");
            System.out.print("Selection: ");

            selection = scanner.nextInt();
            scanner.nextLine();

            switch (selection){
                case 1:
                    displayOrderScreen();
                    break;
                case 0:
                    System.out.println("Thank you for visiting!");
                    break;
                default:
                    System.out.println("Invalid Choice. Try Again.\n");
                    break;
            }
        } while (selection != 0);
    }

    public static void displayOrderScreen() {
        int selection;
        do{
            System.out.println("\nWelcome to The Order Screen!");
            System.out.println("Please select from the appropriate menu options: ");
            System.out.println("------------------------------");
            System.out.println("1) Add Sandwich");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Chips");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel Order");
            System.out.println("------------------------------");
            System.out.print("Selection: ");

            selection = scanner.nextInt();
            scanner.nextLine();

            switch (selection){
                case 1:
                    displayAddSandwichScreen();
                    break;
                case 2:
                    displayAddDrinkScreen();
                    break;
                case 3:
                    displayAddChipsScreen();
                    break;
                case 4:
                    displayCheckoutScreen();
                    break;
                case 0:
                    System.out.println("Cancelling Order.");
                    break;
                default:
                    System.out.println("Invalid Choice. Try Again.\n");
                    break;
            }
        } while (selection != 0);
    }

    public static void displayAddSandwichScreen() {
    }

    private static void displayAddDrinkScreen() {
    }

    private static void displayAddChipsScreen() {
    }

    private static void displayCheckoutScreen() {
    }

}
