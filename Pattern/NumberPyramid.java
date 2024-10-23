import java.util.Scanner;

public class NumberPyramid {
    /*

    1
   2 2
  3 3 3
 4 4 4 4 
5 5 5 5 5

     */

    public static void Number_Pyramid(int n) {
        // outer loop/ rows
        for (int i = 1; i <= n; i++) {

            // space

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // numbers print
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        Number_Pyramid(n);
        sc.close();
    }
}
