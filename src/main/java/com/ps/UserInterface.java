package com.ps;

import java.util.Scanner;

public class UserInterface {
    private Order currentOrder = new Order();
    private static Scanner scanner = new Scanner(System.in);
    public void displayHomeScreen(){
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

    public void displayOrderScreen() {
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
                    int choice = displayCheckoutScreen();
                    if (choice == 3){
                        break;
                    }
                    return;
                case 0:
                    currentOrder = new Order();
                    System.out.println("Order has been cancelled.");
                    return;
                default:
                    System.out.println("Invalid Choice. Try Again.\n");
                    break;
            }
        } while (selection != 0);
    }

    public void displayAddSandwichScreen() {
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

        currentOrder.addProduct(sandwich);
    }

    public String getBreadType(int selection){
        // IntelliJ enhanced switch suggestion
        return switch (selection) {
            case 1 -> "White";
            case 2 -> "Wheat";
            case 3 -> "Rye";
            case 4 -> "Wrap";
            default -> "Invalid";
        };
    }

    public String getSandwichSize(int selection){
        // IntelliJ enhanced switch suggestion
        return switch (selection) {
            case 1 -> "4\"";
            case 2 -> "8\"";
            case 3 -> "12\"";
            default -> "Invalid";
        };
    }

    private void displayAddToppingsScreen(Sandwich sandwich) {
        int selection;
        while (true) {
            System.out.println("\nWelcome to the Toppings Screen!");
            System.out.println("Please select your topping type:");
            System.out.println("------------------------------");
            System.out.println("1) Meat (steak, ham, salami, roast beef, chicken, bacon)");
            System.out.println("2) Cheese (american, provolone, cheddar, swiss)");
            System.out.println("3) Regular Toppings (lettuce, peppers, onions, tomatoes, jalapenos, cucumbers, pickles, guacamole, mushrooms)");
            System.out.println("4) Sauces (mayo, mustard, ketchup, ranch, thousand islands, vinaigrette)");
            System.out.println("0) Done adding toppings");
            System.out.println("------------------------------");

            System.out.print("Selection: ");
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

    private String getToppingType(int selection){
        return switch (selection) {
            case 1 -> "Meat";
            case 2 -> "Cheese";
            case 3 -> "Regular Topping";
            case 4 -> "Sauce";
            case 5 -> "Side";
            default -> "Invalid";
        };
    }
    private void displayAddDrinkScreen() {
        System.out.println("\nWelcome to the Drinks Screen!");
        System.out.println("Select drink size:");
        System.out.println("------------------------------");
        System.out.println("1) Small");
        System.out.println("2) Medium");
        System.out.println("3) Large");
        System.out.println("------------------------------");
        System.out.print("Selection: ");
        String size = getDrinkSize(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Enter drink flavor: ");
        String flavor = scanner.nextLine();

        Drink drink = new Drink(size, flavor);
        currentOrder.addProduct(drink);
    }

    private String getDrinkSize(int selection) {
        return switch (selection) {
            case 1 -> "Small";
            case 2 -> "Medium";
            case 3 -> "Large";
            default -> "Invalid";
        };
    }

    private void displayAddChipsScreen() {
        System.out.println("\nWelcome to the Chips Screen!");
        System.out.println("Enter the chips you would like: ");
        String chipsBrand = scanner.nextLine();

        Chips chips = new Chips(chipsBrand);
        currentOrder.addProduct(chips);
    }

    private int displayCheckoutScreen() {
        System.out.println("\nWelcome to the Checkout Screen!");
        System.out.println("These are the products in your current order:");
        currentOrder.orderDetails();
        System.out.println("Please confirm if you would like to proceed:");
        System.out.println("------------------------------");
        System.out.println("1) Confirm");
        System.out.println("2) Cancel Order");
        System.out.println("3) Go Back");
        System.out.println("------------------------------");
        System.out.print("Selection: ");
        int selection = scanner.nextInt();
        scanner.nextLine();

        switch (selection){
            case 1:
                FileManager.saveOrder(currentOrder);
                currentOrder = new Order();
                System.out.println("Checkout completed! Receipt confirmed!");
                break;
            case 2:
                currentOrder = new Order();
                System.out.println("Order has been cancelled.");
                break;
            case 3:
                break;
        }
        return selection;
    }

}
