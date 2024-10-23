package BitManipulation;

public class Clear_last_ithBit {

    // Function to clear the last i-th bit
    public static int clearLastIthBit(int n, int i) {
        // Create a mask by shifting 1 left i times, subtract 1 to get all bits set to 1 from 0 to (i-1)
        int mask = (~0 << i);  // This creates a mask with first 'i' bits set to 0, and the rest as 1
        return n & mask;  // Perform AND operation to clear the last 'i' bits
    }

    public static void main(String[] args) {
        int n = 59; // Example number (in binary: 111011)
        int i = 3;  // Clear last 3 bits (i.e., make last 3 bits zero)
        
        System.out.println("Before clearing: " + Integer.toBinaryString(n)); // Show binary representation before
        int result = clearLastIthBit(n, i);
        System.out.println("After clearing last " + i + " bits: " + Integer.toBinaryString(result)); // Show binary representation after
        System.out.println("Result in decimal: " + result); // Show the result in decimal
    }
}
