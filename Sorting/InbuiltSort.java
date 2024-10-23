package Sorting;

import java.util.Arrays;

public class InbuiltSort {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        Arrays.sort(arr);
        // Arrays.sort(arr, 0, 3 );  -- it wil be used to sort array from 0 index to 2nd index
        //Arrays.sort(arr, Collections.reverseOrder());   -- it will be used to reverse the order of array
        //Arrays.sort(arr, 0, 3 Collections.reverseOrder());   -- it will be used to reverse the order of array from 0 to 2nd index

        printArr(arr);

    }
}