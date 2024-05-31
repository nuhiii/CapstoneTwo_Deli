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

### Generating non existant directory, before writing to file
``` java
File directory = new File("receipts");
if (!directory.exists()) {
    directory.mkdirs();
}
```

## Course Through With Images
### GUI (Work In Progress)
<img width="546" alt="Screenshot 2024-05-30 at 10 53 22 PM" src="https://github.com/nuhiii/CapstoneTwo_Deli/assets/143645213/cd57ea4d-79d8-4419-a4c9-9e1dd5b001ce">
<img width="546" alt="Screenshot 2024-05-30 at 10 54 13 PM" src="https://github.com/nuhiii/CapstoneTwo_Deli/assets/143645213/4b6e54ca-80b2-4af3-8c19-37d5d4e8fa62">

### CLI (Complete)
<img width="546" alt="Screenshot 2024-05-30 at 10 55 39 PM" src="https://github.com/nuhiii/CapstoneTwo_Deli/assets/143645213/02ad0a2f-1e6a-4cef-8dbf-a7f7e2e5c04c">
<img width="546" alt="Screenshot 2024-05-30 at 10 56 54 PM" src="https://github.com/nuhiii/CapstoneTwo_Deli/assets/143645213/3c850fed-b72d-40ba-b3bd-d11cd93a4b1b">
<img width="546" alt="Screenshot 2024-05-30 at 10 58 25 PM" src="https://github.com/nuhiii/CapstoneTwo_Deli/assets/143645213/f83cdcff-fb1b-4fdb-8a39-af0cdf252b50">
<img width="546" alt="Screenshot 2024-05-30 at 10 58 37 PM" src="https://github.com/nuhiii/CapstoneTwo_Deli/assets/143645213/d2be29a7-68ee-4f83-8e08-3661d165a253">
<img width="546" alt="Screenshot 2024-05-30 at 10 59 15 PM" src="https://github.com/nuhiii/CapstoneTwo_Deli/assets/143645213/ef142441-4892-4b8b-9e3c-679540ec7778">
<img width="546" alt="Screenshot 2024-05-30 at 10 59 44 PM" src="https://github.com/nuhiii/CapstoneTwo_Deli/assets/143645213/8d724816-8ff2-4466-81fc-1f5378c2b0fd">
<img width="546" alt="Screenshot 2024-05-30 at 11 01 01 PM" src="https://github.com/nuhiii/CapstoneTwo_Deli/assets/143645213/74ca714b-c7f7-4f38-b32f-6a65726cc189">
<img width="546" alt="Screenshot 2024-05-30 at 11 01 38 PM" src="https://github.com/nuhiii/CapstoneTwo_Deli/assets/143645213/bb92d9a4-7426-4b8d-bb28-17cedee347ce">
<img width="546" alt="Screenshot 2024-05-30 at 11 02 00 PM" src="https://github.com/nuhiii/CapstoneTwo_Deli/assets/143645213/d34db72f-3318-491a-9e19-6dd72a371cbd">
<img width="814" alt="Screenshot 2024-05-30 at 11 02 25 PM" src="https://github.com/nuhiii/CapstoneTwo_Deli/assets/143645213/debd9323-0a0c-4679-8a4a-66a1d2931c29">

That's all! Thank you!
~ Nuhi
