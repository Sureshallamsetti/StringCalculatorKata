# String Calculator

A simple Java program implementing a String Calculator using Test-Driven Development (TDD). This calculator can parse and sum numbers from a comma- or newline-separated string, supports custom delimiters, and throws exceptions for negative numbers.

## Features

- Parses and adds numbers from a comma- or newline-separated string.
- Supports an unlimited number of numbers as input.
- Allows custom delimiters.
- Throws exceptions for negative numbers, listing all negative numbers in the error message.
- Follows TDD principles with tests for each feature.

## Technologies Used

- **Java**: Programming language for the implementation.
- **JUnit 5**: For unit testing and TDD.
- **Maven**: For project management and dependency management.
- **Spring Boot**: Initial setup (though not required for the core logic).

## Setup and Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/StringCalculator.git
   cd StringCalculator

2. Open the project in IntelliJ or your preferred IDE.
3. Build the project using Maven.
4. Run the tests to ensure everything is set up correctly:
   mvn test

### 5. **Usage and Examples**


## Usage

The `StringCalculator` class provides a single method, `add`, which takes a string of numbers and returns their sum.

### Examples

```java
StringCalculator calculator = new StringCalculator();

// Empty string returns 0
int result1 = calculator.add("");  // 0

// Single number returns itself
int result2 = calculator.add("5");  // 5

// Two numbers separated by comma
int result3 = calculator.add("1,2");  // 3

// Multiple numbers with commas and newlines
int result4 = calculator.add("1\n2,3");  // 6

// Custom delimiter
int result5 = calculator.add("//;\n1;2");  // 3

// Exception on negative numbers
try {
    calculator.add("1,-2,-3");
} catch (IllegalArgumentException e) {
    System.out.println(e.getMessage());  // "Negative numbers not allowed: -2, -3"
}
```
### 6. **Project Structure**

markdown
## Project Structure

- **src/main/java/com/String/StringCalculator/StringCalculator.java**: Contains the main logic for the String Calculator.
- **src/test/java/com/String/StringCalculator/StringCalculatorTest.java**: Contains unit tests written for each feature in a TDD approach.

## TDD Approach

This project was developed using Test-Driven Development (TDD), with tests written for each feature before implementing the feature itself. Each commit demonstrates the progression of the code as new tests were added and passed.

- **Step 1**: Test and handle an empty string as input.
- **Step 2**: Test and handle a single number input.
- **Step 3**: Test and handle two numbers separated by a comma.
- **Step 4**: Extend to multiple comma-separated numbers.
- **Step 5**: Support newline as a delimiter.
- **Step 6**: Support custom delimiters.
- **Step 7**: Handle negative numbers with exceptions.
