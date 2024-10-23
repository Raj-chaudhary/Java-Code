public class StringTransformation {
   
        // Function to check if transformation is possible and count the operations
        public static int minOperationsToTransform(String A, String B) {
            if (A.length() != B.length()) {
                return -1;  // Transformation is not possible if lengths are different
            }
    
            int[] count = new int[256];  // ASCII character set size
    
            // Count characters in both strings
            for (int i = 0; i < A.length(); i++) {
                count[A.charAt(i)]++;
                count[B.charAt(i)]--;
            }
    
            // Check if both strings have the same character frequencies
            for (int c : count) {
                if (c != 0) {
                    return -1;  // Transformation is not possible if frequencies are different
                }
            }
    
            // Calculate the number of operations required
            int operations = 0;
            int i = A.length() - 1;
            int j = B.length() - 1;
    
            while (i >= 0) {
                if (A.charAt(i) != B.charAt(j)) {
                    operations++;
                } else {
                    j--;  // Move to the next character in B
                }
                i--;
            }
    
            return operations;
        }
    
        public static void main(String[] args) {
            String A = "EACBaD";
            String B = "EABCDa";
    
            int result = minOperationsToTransform(A, B);
            if (result != -1) {
                System.out.println("Minimum operations required to transform A to B: " + result);
            } else {
                System.out.println("Transformation not possible.");
            }
        }
    }

