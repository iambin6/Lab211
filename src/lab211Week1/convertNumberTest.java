package lab211Week1;

import java.util.Scanner;

public class convertNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConvertNumber cv = new ConvertNumber();

        try {
            System.out.print("Enter Decimal: ");
            int decimal = scanner.nextInt();
            String binary = cv.decimalToBinary(decimal);
            System.out.println("Binary: " + binary);

            System.out.print("Enter Binary: ");
            String binaryInput = scanner.next();
            int decimalResult = cv.binaryToDecimal(binaryInput);
            System.out.println("Decimal: " + decimalResult);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
