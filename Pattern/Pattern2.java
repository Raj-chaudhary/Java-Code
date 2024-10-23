import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();

        // Inverted star pattern

        // ****
        // ***
        // **
        // *

        for (int line = 1; line <= n; line++) {
            for (int star = 1; star <= n - line + 1; star++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
  sc.close();
    }
}
