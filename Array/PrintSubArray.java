
public class PrintSubArray {

    public static void printsubarray(int num[]) {
        int totalpairs = 0;
        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(num[k] + " ");
                }
                totalpairs++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("totalpairs: " + totalpairs);
    }

    public static void main(String[] args) {
        int num[] = { 6, 8, 9, 11, 15 };
        printsubarray(num);
    }
}
