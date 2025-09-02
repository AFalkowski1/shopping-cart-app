# Shopping Cart Application

The **shopping-cart-app** project is an implementation of shopping cart logic for an e-commerce store. The application focuses on advanced product management, including sorting and applying various promotions. The main goal of the project is to demonstrate key design patterns and object-oriented programming principles in the Java language.

---

## Key Features

The project implements the following functions:
* **Product Management:** The application operates on `Product` objects (code, name, price, promotional price) and stores them in an array.
* **Searching:** Finding the cheapest/most expensive products and the `n` cheapest/most expensive products from the collection.
* **Sorting:** Sorting products by price (descending) and alphabetically by name. The sorting mechanism is flexible and can be easily modified.
* **Total Calculation:** Calculating the total price of all products in the cart.
* **Applying Promotions:** Applying multiple types of promotions, such as percentage discounts, free products, or fixed-amount discounts. The promotion mechanism was designed to easily add and remove new rules.

---

## Key Technical Aspects

The project was developed with an emphasis on clean code and the application of object-oriented principles:
* **Design Patterns:** The **Command pattern** was used in the implementation of the cart and promotions, which ensures system flexibility and extensibility.
* **SOLID Principles:** The **Dependency Inversion Principle** was applied in the sorting mechanism, allowing for easy changes to sorting criteria (e.g., by price, by name) without modifying the core logic.
* **Java Interfaces:** The `Comparable` and `Comparator` interfaces were utilized to implement a flexible sorting mechanism.
* **Unit Tests:** The project includes comprehensive **unit tests** for all implemented functionalities, which guarantees the correctness of the application.

---

## How to run?
To run the project, ensure you have a configured Java environment and compile the code using Java build tools (e.g., Maven or Gradle).
