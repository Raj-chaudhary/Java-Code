
public class MaxSubArraySum {

  // 1. Brute force method - O(n^3)

  public static void MaxSubArraySumUsingBruteForce(int array[]) {
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;

    for (int i = 0; i < array.length; i++) {
      int start = i;
      for (int j = i; j < array.length; j++) {
        int end = j;
        currSum = 0;
        for (int k = start; k <= end; k++) { // print
          // subarray sum
          currSum += array[k];
        }
        System.out.println(currSum);
        if (maxSum < currSum) {
          maxSum = currSum;
        }
      }
    }
    System.out.println("max sum using brute force method: " + maxSum);
  }

  // 2. Prefix array

  public static void maxsubarraySumUsingPrefixArray(int array[]) {
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;
    int prefix[] = new int[array.length];

    // Calculate prefix array  ---- O(N^2)
    prefix[0] = array[0];
    for (int i = 1; i < prefix.length; i++) {
      prefix[i] = prefix[i - 1] + array[i];
    }

    for (int i = 0; i < array.length; i++) {
      int start = i;
      for (int j = i; j < array.length; j++) {
        int end = j;

        currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
        if (maxSum < currSum) {
          maxSum = currSum;
        }
      }
    }
    System.out.println("max sum using prefix array: " + maxSum);
  }

  // 3. kadane's algorithm --- O(n)

  public static void kadaneAlgo(int array[]) {
    int maxSum = array[0];
    int currSum = array[0];
    for (int i = 1; i < array.length; i++) {
     
      if (currSum < 0) {
        currSum = array[i];
      }
      else{
        currSum = currSum + array[i];
      }
      maxSum = Math.max(currSum, maxSum);
    }
    System.out.println("our max sub array sum is: " + maxSum);
  }

  public static void main(String[] args) {
    int[] array = {-2,-1,-3,4,-1,2,1,-5,4};
    // MaxSubArraySumUsingBruteForce(array);
    // maxsubarraySumUsingPrefixArray(array);
     kadaneAlgo(array);
  }
}
