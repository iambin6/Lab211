/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab211Week1;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    solveSuperlativeEquation(scanner);
                    break;
                case 2:
                    solveQuadraticEquation(scanner);
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
        
        scanner.close();
    }

    public static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Solve Superlative Equation");
        System.out.println("2. Solve Quadratic Equation");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void solveSuperlativeEquation(Scanner scanner) {
        System.out.println("\nSolving Superlative Equation: Ax + B = 0");

        double A = getValidInput(scanner, "Enter A: ");
        double B = getValidInput(scanner, "Enter B: ");

        if (A != 0) {
            double x = -B / A;
            System.out.println("Solution: x = " + x);
            displayEvenOddSquareNumbers(A, B);
        } else {
            System.out.println("A cannot be zero for a valid equation.");
        }
    }

    public static void solveQuadraticEquation(Scanner scanner) {
        System.out.println("\nSolving Quadratic Equation: Ax^2 + Bx + C = 0");

        double A = getValidInput(scanner, "Enter A: ");
        double B = getValidInput(scanner, "Enter B: ");
        double C = getValidInput(scanner, "Enter C: ");

        double discriminant = B * B - 4 * A * C;

        if (discriminant > 0) {
            double x1 = (-B + Math.sqrt(discriminant)) / (2 * A);
            double x2 = (-B - Math.sqrt(discriminant)) / (2 * A);
            System.out.println("Solutions: x1 = " + x1 + ", x2 = " + x2);
        } else if (discriminant == 0) {
            double x = -B / (2 * A);
            System.out.println("Solution: x = " + x);
        } else {
            System.out.println("No real solutions.");
        }

        displayEvenOddSquareNumbers(A, B, C);
    }

    public static double getValidInput(Scanner scanner, String prompt) {
        double value;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear invalid input
            }
        }
        return value;
    }

    public static void displayEvenOddSquareNumbers(double... coefficients) {
        System.out.println("\nEven, Odd, and Square Numbers from Coefficients:");
        for (double coefficient : coefficients) {
            System.out.println("Coefficient: " + coefficient);
            if (coefficient % 2 == 0) {
                System.out.println(coefficient + " is an even number.");
            } else {
                System.out.println(coefficient + " is an odd number.");
            }

            if (isPerfectSquare(coefficient)) {
                System.out.println(coefficient + " is a square number.");
            } else {
                System.out.println(coefficient + " is not a square number.");
            }
        }
    }

    public static boolean isPerfectSquare(double num) {
        if (num < 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
}
