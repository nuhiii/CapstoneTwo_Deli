# DELI-cious Java CLI Application

This Java CLI application allows users to create and manage deli sandwich orders, and can include drinks, and chips. Users can customize their sandwiches with various toppings and can see the total price of all their orders on a receipt.

## Features
- **Home Screen** Option to choose between CLI or GUI display.
- **New Order:** Start a new order.
- **Add Sandwich:** Add a customizable sandwich to the order.
- **Add Signature Sandwich:** Add an existing sandwich template with ability to customize.
- **Add Drink:** Add a drink to the order.
- **Add Chips:** Add chips to the order.
- **Checkout:** Calculate total price of the order and generate a receipt.
- **Cancel Order** Go back or cancel and reset order entirely.

## Project Structure
- **Main.java**: Entry point of the application. Triggers the display of the home screen.

- **Order.java**: Manages a collection of products (sandwiches, drinks, chips) and calculates the total price of the order.

- **Product.java**: Abstract base class for different types of products (sandwiches, drinks, chips).

- **Sandwich.java**: Class representing a sandwich with size, bread type, toasting option, and toppings.

- **Topping.java**: Class representing a topping that can be added to a sandwich.

- **Drink.java**: Class representing a drink with size and flavor.

- **Chip.java**: Class representing chips with specific brand option.

- **SignatureSandwich.java** - Abstract base class for various sandwich templates (BLT, Philly, etc).

- **BLT.java** - Class template for BLT sandwich that can be further customized.

- **PhillyCheeseSteak.java** - Class template for Philly sandwich that can be further customized.

- **FileManager.java**: Handles saving the order details to a file.

- **UserInterface.java**: Handles user interactions and display logic for the CLI.

## Future Improvements
- Further implement graphical user interface (GUI) (using Swing).
- Integrate database for persistent storage of orders.
- Enhance error handling and input validation for user interactions.
- Add functionality for customizing drink flavors and chip types.
- Allow ability to remove items.
- Check to make sure certain items are available (in toppings).

## Interesting Code Snippet
### Specific Formatter using Date and Time for generating OrderID on Receipt
``` java
this.orderID = java.time.LocalDateTime.now().format(java.time.format.DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss"));
```
