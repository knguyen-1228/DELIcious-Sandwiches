# DELI-cious Sandwich Shop POS System

A console-based point-of-sale (POS) system for a sandwich shop, built in Java using object-oriented programming principles.

## 📋 Features

- Order customized sandwiches with:
    - Bread type
    - Size (6" or 12")
    - Meat, cheese, toppings, and sauces
    - Toasted or not
- Add chips (Lay’s, Doritos, Sun Chips, Ruffles)
- Add drinks (Coke, Dr. Pepper, Pepsi, Sprite in Small/Medium/Large)
- View complete order summary
- Calculate total price of all items
- Receipt printing simulation (console output)

## 🛠 Technologies

- Java
- IntelliJ IDEA (recommended IDE)
- Console-based interaction

## 🚀 Getting Started

1. **Clone or download** the project to your local machine.
2. Open the project in **IntelliJ IDEA**.
3. Make sure your `src` folder contains the `com.pluralsight` package and the following classes:
    - `DeliciousSandwichesApp` (with the `main` method)
    - `UserInterface`
    - `Order`
    - `Sandwiches`
    - `Chips`
    - `Drinks`
4. Press **Run** or use `Shift + F10` to launch the app.

## 🎮 Usage

1. Run the program.
2. Follow the on-screen prompts to:
    - Add a sandwich, chips, or drink
    - View the order summary
    - Cancel or complete an order
3. View the final receipt with a breakdown of all items and prices.

## 🧾 Sample Output

----------Order Summary---------

Sandwich #1: $18.25

- Bread: Wheat

- Size: 12"

- Toasted: Yes

- Meat: Steak, Ham

- Cheese: Swiss

- Toppings: Lettuce, Tomato

- Sauces: Mayo


Chip: Doritos $1.50

Drink: Large Coke $3.00

Subtotal: $22.75

Tax: $1.88

Total price: $24.63


## Interesting Piece of Code
This process took me the longest to figure out. I got really confused at some points managing the all the switch statements.

```
boolean appRunning = true;
        while(appRunning){
            int userChoice = homeScreen();
            switch(userChoice){
                case 1:
                    boolean orderRunning = true;
                    while(orderRunning){
                        int orderChoice = orderScreen();
                        switch(orderChoice){
                            case 1:
                                order.addSandwich(myScanner);
                                boolean sandwichRunning = true;
                                while(sandwichRunning){
                                    int sandwichChoice = sandwichScreen();
                                    switch (sandwichChoice){
                                        case 1:
                                            order.addSandwich(myScanner);
                                            break;
                                        case 2:
                                            order.getOrderSummary();
                                            sandwichRunning = false;
                                            break;
                                        default:
                                            System.out.println("Invalid choice, try again!");
                                    }
                                }
                                break;
                            case 2:
                                order.addDrink(myScanner);
                                break;
                            case 3:
                                order.addChips(myScanner);
                                break;
                            case 4:
                                boolean confRunning = true;
                                while(confRunning){
                                    order.getOrderSummary();
                                    int confInput = confirmation();
                                    switch(confInput){
                                        case 1:
                                            RecieptWriter.saveReceipt(order);
                                            RecieptWriter.printReceipt();
                                            confRunning = false;
                                            orderRunning = false;
                                            appRunning = false;
                                            break;
                                        case 2:
                                            confRunning = false;
                                            System.out.println("Returning to ordering menu");
                                            break;
                                    }
                                }
                                break;
                            case 0:
                                orderRunning = false;
                                System.out.println("Returning to Home Screen");
                                break;
                            default:
                                System.out.println("Invalid choice, try again!");
                        }
                    }
                    break;
                case 0:
                    appRunning = false;
                    System.out.println("Thank you for visiting The DELIcious Sandwiches, Have a nice day!");
                    break;
                default:
                    System.out.println("Invalid choice, try again!");
            }
```

## Diagram

![DeliSandwich Diagram](Diagram/DelisandwichDiagram.drawio.png)

## 👨‍💻 Author

Created by [Kevin Nguyen] for a Java capstone project.

---