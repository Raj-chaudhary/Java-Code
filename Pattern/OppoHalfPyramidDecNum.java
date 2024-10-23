import java.util.Scanner;

public class OppoHalfPyramidDecNum {

/*
        1
      2 1
    3 2 1
  4 3 2 1
5 4 3 2 1

 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();

        for (int line = 1; line <= n; line++) {

            // Printing Space

            for (int j = 2 * n - line; j > line; j--) {
                System.out.print(" ");
            }
           // printing numbers
            for (int j = line; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
