import java.util.Scanner;

public class Oppo_K_Shape {


    /*
12345
 2345
  345
   45
    5
   45
  345
 2345
12345
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row: ");
        int n = sc.nextInt();

        // upper half

        for (int row = 1; row <= n; row++) {

            // space

            for (int i = 1; i < row; i++) {
                System.out.print(" ");
            }

            // Printing j to n value at the end of each row
            for (int j = row; j <= n; j++) {
                System.out.print(j + "");
            }

            System.out.println();

        }

        // Printing lower half of the pattern

        for (int row = n - 1; row >= 1; row--) {
            // Printing j spaces at the beginning of each row

            for (int j = 1; j < row; j++) {
                System.out.print(" ");
            }

            // Printing j to n value at the end of each row

            for (int j = row; j <= n; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
        sc.close();
    }
}
