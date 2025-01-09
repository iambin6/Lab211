
package lab211Week1;


import java.util.Random;
import java.util.Scanner;

public class LinearSearchTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinearSearch linearSearch = new LinearSearch();

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        linearSearch.addValue(size);

        System.out.println("Generated Array:");
        linearSearch.showArray();
        System.out.println();

        System.out.print("Enter a value to search for: ");
        int value = scanner.nextInt();
        
        int result = linearSearch.searchValue(value);
        if (result != -1) {
            System.out.println("Value " + value + " found at index: " + result);
        } else {
            System.out.println("Value " + value + " not found in the array.");
        }

        scanner.close();
    }
}
