import java.util.*;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();

        // *
        // * *
        // * * *
        // * * * *

        int st = 1;
        int sp = n - 1;

        for (int line = 1; line <= n; line++) {

            // Print spaces
            for (int i = 0; i < sp; i++) {
                System.out.print("  ");
            }
            // Print Star

            for (int i = 0; i < st; i++) {
                System.out.print("* ");
            }
            // Prepare for next line
            System.out.println();
            st++;
            sp--;
        }
    }
}
