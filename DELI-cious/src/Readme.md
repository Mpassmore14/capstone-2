# Java Ordering System

This is a simple Java console application simulating a food ordering system. Users can build an order by selecting items such as drinks, chips, and sandwiches, then proceed to checkout. This project was built using core object-oriented principles including encapsulation, inheritance, and class interactions.

## Features

* Text-based UI with menus for item selection
* Add multiple items to an order
* Calculate totals and checkout
* Organized using Java classes for modular design
* Unit tests for selected features (DrinkTest)

## Technologies

* Java SE 17+
* IntelliJ IDEA Community Edition (recommended)
* JUnit 5 for testing

## Structure

```
src/
 ├── main/java/
 │   ├── Main.java           // Entry point
 │   ├── HomeScreen.java     // User interface logic
 │   ├── Order.java           // Stores the user's order
 │   ├── Checkout.java        // Handles total calculation
 │   ├── Sandwich.java, Drink.java, Chips.java // Menu items
 │   └── Size.java            // Size enumeration (if implemented as enum)
 └── test/java/
     └── DrinkTest.java      // Unit test for Drink class
```

## How to Run

1. Clone or download the project.
2. Open it in IntelliJ IDEA.
3. Run `Main.java` using `Ctrl+Shift+F10` or right-click > Run.

## How to Test

* Navigate to `DrinkTest.java`.
* Run the file to execute tests.

## Suggested Improvements

* Introduce an abstract `MenuItem` superclass.
* Convert `Size` into a Java `enum`.
* Separate UI logic from business logic for cleaner design.
* Add more unit tests for `Order` and `Checkout` logic.

## License

Educational use only - part of a Java course curriculum.
