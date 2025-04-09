# Multiset Equivalence Checker

This project is a **Java application** designed to compare two multisets of real numbers and determine if they are
equivalent. The program takes user input, processes it, and outputs whether the two multisets are equivalent, displaying
their contents. This project was created for educational purposes as part of a school assignment.

---

## Features

- **User Input**: Accepts two sets of real numbers separated by commas.
- **Multiset Comparison**: Compares the two multisets for equivalence.
- **Output**: Displays whether the two multisets are equivalent and prints their contents.
- **Error Handling**: Handles invalid input by parsing and trimming user input.

---

## How It Works

1. The user enters two sets of real numbers separated by commas.
2. The program parses the input into arrays of `double` values.
3. The arrays are converted into `Multiset` objects.
4. The program checks if the two `Multiset` objects are equivalent using the `.equals()` method.
5. The result is displayed to the user.

---

## Prerequisites

- **Java Development Kit (JDK)**: Version 8 or higher.
- **IDE**: IntelliJ IDEA (recommended) or any Java-compatible IDE.

---

## How to Run

1. Clone the repository or download the project files.
2. Open the project in your preferred IDE (e.g., IntelliJ IDEA).
3. Compile and run the `Main.java` file.
4. Follow the on-screen instructions to input two sets of real numbers.

---

## Code Structure

- **`Main.java`**: Contains the main logic for user input, parsing, and multiset comparison.
- **`Multiset` Class**: Represents a multiset of real numbers and provides methods for comparison and string
  representation.

---

## Multiset Class

The `Multiset` class is a custom implementation that supports:

- **Initialization**: Accepts an array of `double` values.
- **Equality Check**: Overrides the `.equals()` method to compare two multisets.
- **String Representation**: Overrides `.toString()` to display the multiset contents.

---

## Error Handling

- If the user enters invalid input (e.g., non-numeric values), the program throws a `NumberFormatException`.
- Ensure that the input is formatted correctly (e.g., `1.0, 2.0`) to avoid errors.

---

## License

This project is intended for educational purposes only and is not meant for commercial use.

---

## Author

- **Name**: [Filippo Spazzali]
- **School**: [Università degli Studi di Trieste]
- **Course**: [Computer Science]
