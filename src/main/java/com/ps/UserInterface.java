package com.ps;

import java.util.Scanner;

public class UserInterface {
    private Order currentOrder = new Order();
    private static Scanner scanner = new Scanner(System.in);
    public static void displayHomeScreen(){
        int selection;
        do{
            System.out.println("Welcome To The DELI-cious Sandwich Shop!");
            System.out.println("Please select from the appropriate menu options:");
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
            System.out.println("\nWelcome to the Order Screen!");
            System.out.println("Please select from the appropriate menu options:");
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
        System.out.println("\nWelcome to the Sandwich Screen!");
        System.out.println("Please select your bread type:");
        System.out.println("------------------------------");
        System.out.println("1) White");
        System.out.println("2) Wheat");
        System.out.println("3) Rye");
        System.out.println("4) Wrap");
        System.out.println("------------------------------");

        System.out.print("Selection: ");
        String bread = getBreadType(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Select your sandwich size:");
        System.out.println("1) 4\"");
        System.out.println("2) 8\"");
        System.out.println("3) 12\"");
        String size = getSandwichSize(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Would you like the sandwich toasted?");
        System.out.println("Yes");
        System.out.println("No");
        boolean toasted = scanner.nextLine().equalsIgnoreCase("yes");

        Sandwich sandwich = new Sandwich(size, bread, toasted);
        displayAddToppingsScreen(sandwich);
    }

    public static String getBreadType(int selection){
        // IntelliJ enhanced switch suggestion
        return switch (selection) {
            case 1 -> "White";
            case 2 -> "Wheat";
            case 3 -> "Rye";
            case 4 -> "Wrap";
            default -> "Invalid";
        };
    }

    public static String getSandwichSize(int selection){
        // IntelliJ enhanced switch suggestion
        return switch (selection) {
            case 1 -> "4\"";
            case 2 -> "8\"";
            case 3 -> "12\"";
            default -> "Invalid";
        };
    }

    private static void displayAddToppingsScreen(Sandwich sandwich) {
        int selection;
        while (true) {
            System.out.println("Welcome to the Toppings Screen!");
            System.out.println("Please select your topping type:");
            System.out.println("------------------------------");
            System.out.println("1) Meat (steak, ham, salami, roast beef, chicken, bacon)");
            System.out.println("2) Cheese (american, provolone, cheddar, swiss)");
            System.out.println("3) Regular Toppings (lettuce, peppers, onions, tomatoes, jalapenos, cucumbers, pickles, guacamole, mushrooms)");
            System.out.println("4) Sauces (mayo, mustard, ketchup, ranch, thousand islands, vinaigrette)");
            System.out.println("0) Done adding toppings");
            System.out.println("------------------------------");
            selection = scanner.nextInt();
            scanner.nextLine();

            if (selection == 0) {
                break;
            } else {
                System.out.println("Enter the name of the topping:");
                String toppingName = scanner.nextLine();
                String toppingType = getToppingType(selection);
                boolean isPremium = false;
                boolean isExtra = false;
                if (toppingType.equals("Meat") || toppingType.equals("Cheese")){
                    isPremium = true;
                    System.out.println("Would you like to add extra?");
                    System.out.println("Yes");
                    System.out.println("No");
                    isExtra = scanner.nextLine().equalsIgnoreCase("yes");
                }
                sandwich.addTopping(new Topping(toppingName, toppingType, isPremium, isExtra));
            }
        }
    }

    private static String getToppingType(int selection){
        return switch (selection) {
            case 1 -> "Meat";
            case 2 -> "Cheese";
            case 3 -> "Regular Topping";
            case 4 -> "Sauce";
            case 5 -> "Side";
            default -> "Invalid";
        };
    }
    private static void displayAddDrinkScreen() {
    }

    private static void displayAddChipsScreen() {
    }

    private static void displayCheckoutScreen() {
    }

}
