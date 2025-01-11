
package lab211Week1;


import java.util.Scanner;

public class NumberConversion {

    public static String decimalToHexadecimal(int decimalNumber) {
        return Integer.toHexString(decimalNumber).toUpperCase();
    }

    public static int hexadecimalToDecimal(String hexadecimalNumber) {
        try {
            return Integer.parseInt(hexadecimalNumber, 16);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("The input string is not a valid hexadecimal number.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Convert Decimal to Hexadecimal");
        System.out.println("2. Convert Hexadecimal to Decimal");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter a decimal number: ");
                int decimalNumber = scanner.nextInt();
                String hexResult = decimalToHexadecimal(decimalNumber);
                System.out.println("Decimal " + decimalNumber + " to hexadecimal: " + hexResult);
                break;

            case 2:
                System.out.print("Enter a hexadecimal number: ");
                String hexadecimalNumber = scanner.next();
                try {
                    int decimalResult = hexadecimalToDecimal(hexadecimalNumber);
                    System.out.println("Hexadecimal " + hexadecimalNumber + " to decimal: " + decimalResult);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;

            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
        }
    }
}
