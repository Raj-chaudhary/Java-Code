import java.util.Scanner;

public class Count_Fingers {

    // Explanation https://www.geeksforgeeks.org/program-count-numbers-fingers/

    public static int Count_num_Fingers(int n) {
        int r = n % 8;
        if (r == 0) {
            return 2;
        }
        if (r < 5) {
            return r;
        } else {
            return 10 - r;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Counting to count the fingers: ");
        int n = sc.nextInt();
        System.out.println(Count_num_Fingers(n));

        sc.close();
    }
}
