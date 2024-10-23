public class LargestInArray {

    public static int getLargest(int num[]) {
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE; // +infinity

        for (int i = 0; i < num.length; i++) {
            if (largest < num[i]) {
                largest = num[i];
            }
            if (smallest > num[i]) {
                smallest = num[i];
            }
        }
        System.out.println("smallest value is: " + smallest);
        return largest;

    }

    public static void main(String[] args) {
        int num[] = { 1, 8, 9, 5, 6, 7, 55, 14, 69, 96 };
        System.out.println("Largest value is: " + getLargest(num));
    }
}
