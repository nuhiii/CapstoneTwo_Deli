package com.ps;

import javax.swing.*;

public class GUI {
    private Order currentOrder = new Order();

    public void displayHomeScreen() {
        JFrame frame = new JFrame("DELI-cious Sandwich Shop");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeHomeComponents(panel, frame);

        frame.setVisible(true);
    }

    private void placeHomeComponents(JPanel panel, JFrame frame) {
        panel.setLayout(null);

        JLabel label = new JLabel("Welcome To The DELI-cious Sandwich Shop!");
        label.setBounds(10, 20, 300, 25);
        panel.add(label);

        JButton newOrderButton = new JButton("New Order");
        newOrderButton.setBounds(10, 60, 150, 25);
        panel.add(newOrderButton);

        JButton exitButton = new JButton("Exit");
        exitButton.setBounds(200, 60, 150, 25);
        panel.add(exitButton);

        newOrderButton.addActionListener(e -> {
            displayOrderScreen();
            frame.dispose();
        });

        exitButton.addActionListener(e -> System.exit(0));
    }

    public void displayOrderScreen() {
        JFrame frame = new JFrame("Order Screen");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeOrderComponents(panel, frame);

        frame.setVisible(true);
    }

    private void placeOrderComponents(JPanel panel, JFrame frame) {
        panel.setLayout(null);

        JLabel label = new JLabel("Select items to add to your order:");
        label.setBounds(10, 20, 300, 25);
        panel.add(label);

        JButton addSandwichButton = new JButton("Add Sandwich");
        addSandwichButton.setBounds(10, 60, 150, 25);
        panel.add(addSandwichButton);

        JButton addDrinkButton = new JButton("Add Drink");
        addDrinkButton.setBounds(10, 100, 150, 25);
        panel.add(addDrinkButton);

        JButton addChipsButton = new JButton("Add Chips");
        addChipsButton.setBounds(10, 140, 150, 25);
        panel.add(addChipsButton);

        JButton checkoutButton = new JButton("Checkout");
        checkoutButton.setBounds(10, 180, 150, 25);
        panel.add(checkoutButton);
    }
}