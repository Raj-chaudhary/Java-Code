public class InvertedArraySearch {

    /*
     * This function searches for a target value in an inverted (rotated) sorted
     * array.
     * It first finds the index of the minimum element (which indicates the point of
     * rotation),
     * then performs a binary search in the appropriate half of the array.
     */
    public static int invertedSearch(int nums[], int target) {

        // Find the index of the minimum element in the rotated array
        int min = minSearch(nums);

        // If the target is in the range of the right sorted part (from min to end),
        // search in the right half
        if (nums[min] <= target && target <= nums[nums.length - 1]) {
            return search(nums, min, nums.length - 1, target);
        }

        // Otherwise, search in the left sorted part (from start to one before min)
        else {
            return search(nums, 0, min - 1, target);
        }
    }

    /*
     * This function performs a binary search in a sorted subarray (from index left
     * to right).
     * It returns the index of the target value if found, or -1 if the target is not
     * present.
     */
    public static int search(int nums[], int left, int right, int target) {
        int l = left; // Initialize the left pointer
        int r = right; // Initialize the right pointer

        // Perform binary search
        while (l <= r) {
            int mid = l + (r - l) / 2; // Calculate the middle index

            // If the middle element is the target, return its index
            if (nums[mid] == target) {
                return mid;
            }
            // If the target is smaller than the middle element, search the left half
            else if (nums[mid] > target) {
                r = mid - 1;
            }
            // If the target is larger than the middle element, search the right half
            else {
                l = mid + 1;
            }
        }

        // If the target is not found, return -1
        return -1;
    }

    /*
     * This function finds the index of the minimum element in the rotated sorted
     * array.
     * The minimum element indicates the point of rotation.
     */
    public static int minSearch(int nums[]) {
        int left = 0; // Initialize the left pointer
        int right = nums.length - 1; // Initialize the right pointer

        // Perform binary search to find the minimum element
        while (left < right) {
            int mid = left + (right - left) / 2; // Calculate the middle index

            // If the middle element is less than the previous element, it's the minimum
            if (mid > 0 && nums[mid - 1] > nums[mid]) {
                return mid;
            }
            // If the middle element is greater than the first element and greater than the
            // last,
            // the minimum is in the right half
            else if (nums[left] <= nums[mid] && nums[mid] > nums[right]) {
                left = mid + 1;
            }
            // Otherwise, the minimum is in the left half
            else {
                right = mid;
            }
        }

        // When the loop ends, left == right, and it points to the minimum element
        return left;
    }

    /*
     * The main method to test the invertedSearch function.
     * It initializes an inverted (rotated) sorted array and searches for a target
     * value.
     */
    public static void main(String[] args) {
        int[] array = { 4, 5, 6, 7, 1, 2, 3 }; // An example of a rotated sorted array
        int pos = invertedSearch(array, 5); // Search for the target value 2
        System.out.println(pos); // Output the index of the target value (should print 5)
    }
}
