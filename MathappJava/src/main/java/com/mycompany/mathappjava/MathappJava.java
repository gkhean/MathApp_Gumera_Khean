/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mathappjava;
import java.util.Scanner;
/**
 *
 * @author dell
 */
public class MathappJava {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Math App Menu ===");
            System.out.println("1. Addition of two numbers");
            System.out.println("2. Subtraction of two numbers");
            System.out.println("3. Multiplication of two numbers");
            System.out.println("4. Division of two numbers");
            System.out.println("5. Factorial of a number");
            System.out.println("6. Power (x^y)");
            System.out.println("7. Sum of numbers 1 to N");
            System.out.println("8. Check if a number is prime");
            System.out.println("9. Greatest Common Divisor (GCD)");
            System.out.println("10. Absolute value of a number");
            System.out.println("11. Average of N numbers (stored in an array)");
            System.out.println("12. Maximum of N numbers (stored in an array)");
            System.out.println("0. Exit");

            // Input validation for menu choice
            while (true) {
                System.out.print("Enter your choice: ");

                if (input.hasNextInt()) {
                    choice = input.nextInt();
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a number from 0 to 12.");
                    input.next();
                }
            }

            switch (choice) {

                // CASE 1: Addition
                case 1:
                    double num1, num2;

                    System.out.print("Enter first number: ");
                    while (!input.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a number.");
                        input.next();
                    }
                    num1 = input.nextDouble();

                    System.out.print("Enter second number: ");
                    while (!input.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a number.");
                        input.next();
                    }
                    num2 = input.nextDouble();

                    System.out.println("Result: " + (num1 + num2));
                    break;

                // CASE 2: Subtraction
                case 2:
                    System.out.print("Enter first number: ");
                    while (!input.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a number.");
                        input.next();
                    }
                    num1 = input.nextDouble();

                    System.out.print("Enter second number: ");
                    while (!input.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a number.");
                        input.next();
                    }
                    num2 = input.nextDouble();

                    System.out.println("Result: " + (num1 - num2));
                    break;

                // CASE 3: Multiplication
                case 3:
                    System.out.print("Enter first number: ");
                    while (!input.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a number.");
                        input.next();
                    }
                    num1 = input.nextDouble();

                    System.out.print("Enter second number: ");
                    while (!input.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a number.");
                        input.next();
                    }
                    num2 = input.nextDouble();

                    System.out.println("Result: " + (num1 * num2));
                    break;

                // CASE 4: Division
                case 4:
                    System.out.print("Enter first number: ");
                    while (!input.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a number.");
                        input.next();
                    }
                    num1 = input.nextDouble();

                    System.out.print("Enter second number: ");
                    while (!input.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a number.");
                        input.next();
                    }
                    num2 = input.nextDouble();

                    if (num2 == 0) {
                        System.out.println("Error: Cannot divide by zero.");
                    } else {
                        System.out.println("Result: " + (num1 / num2));
                    }
                    break;

                // CASE 5: Factorial
                case 5:
                    int n;
                    long factorial = 1;

                    System.out.print("Enter a number: ");

                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a whole number.");
                        input.next();
                    }
                    n = input.nextInt();

                    if (n < 0) {
                        System.out.println("Error: Factorial cannot be negative.");
                    } else if (n > 20) {
                        System.out.println("Error: Number is too large for long factorial.");
                    } else {
                        for (int i = 1; i <= n; i++) {
                            factorial = factorial * i;
                        }

                        System.out.println("Factorial: " + factorial);
                    }
                    break;

                // CASE 6: Power
                case 6:
                    double base;
                    int exponent;

                    System.out.print("Enter the base (x): ");
                    while (!input.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a number.");
                        input.next();
                    }
                    base = input.nextDouble();

                    System.out.print("Enter the exponent (y): ");
                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a whole number.");
                        input.next();
                    }
                    exponent = input.nextInt();

                    System.out.println("Result: " + Math.pow(base, exponent));
                    break;

                // CASE 7: Sum from 1 to N
                case 7:
                    int limit;
                    long sum = 0;

                    System.out.print("Enter N: ");

                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a whole number.");
                        input.next();
                    }
                    limit = input.nextInt();

                    if (limit < 1) {
                        System.out.println("Error: N must be at least 1.");
                    } else {
                        for (int i = 1; i <= limit; i++) {
                            sum = sum + i;
                        }

                        System.out.println("Sum from 1 to " + limit + ": " + sum);
                    }
                    break;

                // CASE 8: Prime Check
                case 8:
                    int primeNumber;
                    boolean isPrime = true;

                    System.out.print("Enter a number: ");

                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a whole number.");
                        input.next();
                    }
                    primeNumber = input.nextInt();

                    if (primeNumber < 2) {
                        isPrime = false;
                    } else {
                        for (int i = 2; i < primeNumber; i++) {
                            if (primeNumber % i == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                    }

                    if (isPrime) {
                        System.out.println(primeNumber + " is a prime number.");
                    } else {
                        System.out.println(primeNumber + " is not a prime number.");
                    }
                    break;

                // CASE 9: GCD
                case 9:
                    int a, b;
                    int gcd = 1;

                    System.out.print("Enter first number: ");
                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a whole number.");
                        input.next();
                    }
                    a = input.nextInt();

                    System.out.print("Enter second number: ");
                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a whole number.");
                        input.next();
                    }
                    b = input.nextInt();

                    a = Math.abs(a);
                    b = Math.abs(b);

                    if (a == 0 && b == 0) {
                        System.out.println("Error: GCD of 0 and 0 is undefined.");
                    } else {
                        int smaller;

                        if (a < b) {
                            smaller = a;
                        } else {
                            smaller = b;
                        }

                        for (int i = 1; i <= smaller; i++) {
                            if (a % i == 0 && b % i == 0) {
                                gcd = i;
                            }
                        }

                        System.out.println("GCD: " + gcd);
                    }
                    break;

                // CASE 10: Absolute Value
                case 10:
                    double value;

                    System.out.print("Enter a number: ");

                    while (!input.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a number.");
                        input.next();
                    }
                    value = input.nextDouble();

                    System.out.println("Absolute value: " + Math.abs(value));
                    break;

                // CASE 11: Average of N Numbers
                case 11:
                    int count;
                    double total = 0;

                    System.out.print("Enter N (number of values): ");

                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a whole number.");
                        input.next();
                    }
                    count = input.nextInt();

                    if (count <= 0) {
                        System.out.println("Error: N must be greater than 0.");
                    } else {
                        double[] numbers = new double[count];

                        for (int i = 0; i < count; i++) {
                            System.out.print("Enter number " + (i + 1) + ": ");

                            while (!input.hasNextDouble()) {
                                System.out.println("Invalid input. Please enter a number.");
                                input.next();
                            }

                            numbers[i] = input.nextDouble();
                            total = total + numbers[i];
                        }

                        double average = total / count;

                        System.out.println("Average: " + average);
                    }
                    break;

                // CASE 12: Maximum of N Numbers
                case 12:
                    int numberCount;

                    System.out.print("Enter N (number of values): ");

                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a whole number.");
                        input.next();
                    }
                    numberCount = input.nextInt();

                    if (numberCount <= 0) {
                        System.out.println("Error: N must be greater than 0.");
                    } else {
                        double[] values = new double[numberCount];

                        for (int i = 0; i < numberCount; i++) {
                            System.out.print("Enter number " + (i + 1) + ": ");

                            while (!input.hasNextDouble()) {
                                System.out.println("Invalid input. Please enter a number.");
                                input.next();
                            }

                            values[i] = input.nextDouble();
                        }

                        double maximum = values[0];

                        for (int i = 1; i < numberCount; i++) {
                            if (values[i] > maximum) {
                                maximum = values[i];
                            }
                        }

                        System.out.println("Maximum value: " + maximum);
                    }
                    break;

                // CASE 0: Exit
                case 0:
                    System.out.println("Thank you for using the Math App!");
                    break;

                // Invalid choice
                default:
                    System.out.println("Invalid choice. Please select 0 to 12.");
            }

        } while (choice != 0);

        input.close();
    }
}
 

                   
                
                       
                   
                   
                  

                 

                   
                

                    
