import java.util.Scanner;

public class InvertedRotatedHalfPyramid {

    /*
      *
    * *
  * * *
* * * * 
 */

    public static void Inverted_Rotated_Half_Pyramid(int n) {
        // rows/lines
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        Inverted_Rotated_Half_Pyramid(n);
        sc.close();
    }
}