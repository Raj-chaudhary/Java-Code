import java.util.Scanner;

public class OppoInvertedDecNumHalfPyramid {

    /*
 5 4 3 2 1
   4 3 2 1
     3 2 1
       2 1
         1
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();

        for (int line = 1; line <= n; line++) {

            // Printing spaces
            for (int j = 1; j < line * 2; j++) {
                System.out.print(" ");
            }

            // Printing numbers
            for (int j = n - line + 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
