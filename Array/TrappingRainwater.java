public class TrappingRainwater {

    /*
     * Conditions for trapping rainwater
     * 1. The input list is non-empty and contains only non-negative integers.
     * 2. minimum no. of bars > 2
     * 3. Asecending/descending - no water trapped
     * 4. water level = min (maxLeft, maxRight)
     * 5. trapped water = (water level - barlevel)
     * 
     */

    public static int trappedRainWater(int height[]) {
        int n = height.length;

        // calculate leftMaxBoundary - array

        int leftMax[] = new int[n];
        leftMax[0] = height[0];

        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Calculate rightMaxtBoundary - array

        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // loop
        int trappedRainWater = 0;

        for (int i = 0; i < n; i++) {

            // water level = min (leftMaxBoundary, rightMaxBoundary)

            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // trapped water = water level - height[i]
            trappedRainWater = trappedRainWater + waterLevel - height[i];
        }

        return trappedRainWater;

    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 }; // time complexity O(n)

        System.out.println("Trapped water: " + trappedRainWater(height));
    }
}
