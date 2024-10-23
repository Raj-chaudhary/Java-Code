import java.util.Scanner;

public class BubbleSortSwapCount {
    // Function to perform bubble sort and count swaps
    public static int bubbleSort(int[] arr, boolean ascending) {
        int swapCount = 0;
        int n = arr.length;

        // Outer loop for the number of passes
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            // Inner loop for comparison
            for (int j = 0; j < n - i - 1; j++) {
                if ((ascending && arr[j] > arr[j + 1]) || (!ascending && arr[j] < arr[j + 1])) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapCount++;
                    swapped = true;
                }
            }

            // If no elements were swapped, break the loop early
            if (!swapped) {
                break;
            }
        }

        return swapCount;
    }

    // Main function to determine the minimum swaps required
    public static int findMinimumSwaps(int[] arr) {
        int[] ascendingArr = arr.clone();
        int[] descendingArr = arr.clone();

        // Get the swap counts for both ascending and descending order
        int ascendingSwaps = bubbleSort(ascendingArr, true);
        int descendingSwaps = bubbleSort(descendingArr, false);

        // Return the minimum swap count
        return Math.min(ascendingSwaps, descendingSwaps);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of elements
        int N = scanner.nextInt();
        int[] arr = new int[N];

        // Read the array elements
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find the minimum swap operations required to make the array beautiful
        int result = findMinimumSwaps(arr);
        
        // Output the result without any extra formatting
        System.out.print(result);
   scanner.close();
    }
}
