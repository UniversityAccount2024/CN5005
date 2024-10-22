public class Main {
    public static void main(String[] args) {
        // My Bubble Sort Array before sorting
        int arr[] = {93, 42, 51, 3, 455, 20, 5, 100, 5487, 87, 96, 21};
        // Printing unsorted bubble array
        System.out.println("\nUnsorted Bubble Array: ");
        PrintArray(arr);

        // Sort the array and get the loop count
        int bubbleCount = BubbleSort(arr);
        System.out.println("\nSorted bubble array after " + bubbleCount + " loops:");
        PrintArray(arr);

        // Printing unsorted selection array
        int array[] = {10, 33, 28, 5, 63, 224, 6978, 96, 57};
        System.out.println("\nUnsorted Selection Array: ");
        PrintSecondArray(array);

        // Sort the array and get the loop count
        int selectionCount = SelectionSort(array);
        System.out.println("\nSorted selection array after " + selectionCount + " loops:");
        PrintSecondArray(array);
    }

    // Print Bubble sort array
    public static void PrintArray(int[] arr) {
        for (int number : arr) {
            System.out.print(number + " ");
        }
        System.out.println(); // Move to the next line after printing the array
    }

    // Bubble sort function
    public static int BubbleSort(int[] arr) {
        System.out.println("\nSorting Bubble Array:");
        int count = 0; // Creating count
        boolean sorted;

        for (int i = 0; i < arr.length - 1; i++) {
            // Assume the array is sorted
            sorted = true;

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    sorted = false;

                    // Printing each stage
                    count++;
                    System.out.print("Loop " + count + ": ");
                    PrintArray(arr);
                }
            }
            if (sorted) {
                break; // If no swaps occurred, the array is sorted
            }
        }
        return count; // Return the count
    }

    // Print Selection Array
    public static void PrintSecondArray(int[] array) {
        for (int number : array) {
            System.out.print(number + " "); // Add a space after each number
        }
        System.out.println(); // Move to the next line after printing the array
    }

    // Selection sort function
    public static int SelectionSort(int[] array) {
        System.out.println("\nSorting Selection Array:");
        int count = 0;

        for (int i = 0; i < array.length - 1; i++) {
            int index = i; // Assume the smallest element is the first unsorted element

            // Find the index of the smallest element in the unsorted portion
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j; // Update index if a smaller element is found
                }
            }

            // Swap if the index is not the current one
            if (index != i) {
                int temp = array[i];
                array[i] = array[index];
                array[index] = temp;

                // Printing each stage
                count++;
                System.out.print("Loop " + count + ": ");
                PrintSecondArray(array);
            }
        }
        return count; // Return the count
    }
}
