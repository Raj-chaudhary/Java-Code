import java.util.Scanner;

// Given an integer array nums, return true if any value appears at least twice in the array, 
//and return false if every element is distinct
// Example: Input:nums = [1, 2, 3, 1] Output:   true
// Input:nums = [1, 2, 3, 4]Output:   false

public class CheckingdistinctNoOrNot {

    public static boolean checkingArray(int nums[]) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int nums[] = new int[n];

        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(checkingArray(nums));
        sc.close();
    }
}
