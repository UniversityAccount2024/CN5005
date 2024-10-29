import java.util.Scanner;
/**
 * @author Nikita Robinson
 * @Version 29/10/2024
 * @description A Java code to find an element in an array and calculate the factorial of a number input by the user.
 */
public class Main {
    public static void main(String[] args) {
        // Declaring variable
        int number;
        int target = 8;

        // Array for binary search
        int [] array = {3, 4, 5, 6, 7, 8, 9};

        // Taking user input
        Scanner user = new Scanner(System.in);
        System.out.println("Input a number: ");
        number = user.nextInt();

        // Return factorial and print results
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);

        // Return binary search and print results
        int index = binarySearch(array, target, 0, array.length - 1);
        System.out.println("Number 8 in array found at index " + index);

    }

    // Factorial Recursion method
    public static int factorial(int number)
    {
        if (number == 0) {
            return 1;
        }
        return number * factorial(number - 1);
    }

    // Binary search recursion method
    public static int binarySearch(int array[], int target, int left, int right)
    {
        if (left > right) {
            return -1;
        }

        // Middle Index
        int mid = left + (right - left) / 2;

        // If middle index is target, return
        if (array[mid] == target) {
            return mid;
        }

        else if (array[mid] > target) {
            // Search left half
            return binarySearch(array, target, left, mid - 1);
        }

        else {
            // Search right half
            return binarySearch(array, target, mid + 1, right);
        }
    }
}
