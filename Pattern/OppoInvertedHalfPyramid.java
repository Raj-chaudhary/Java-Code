import java.util.Scanner;

public class OppoInvertedHalfPyramid {

    /*
1 2 3 4 5
  1 2 3 4
    1 2 3
      1 2
        1
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();

        for (int line = n; line >= 1; line--) {

            // print space
            for (int i = 2 * n - line; i > line; i--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= line; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
