import java.util.Scanner;

public class Diamond {

    /*
          * 
       *  *  * 
    *  *  *  *  * 
 *  *  *  *  *  *  *
 *  *  *  *  *  *  *
    *  *  *  *  *
       *  *  * 
          *
     */

    public static void Diamond_Pattern(int n) {

        // Upper half
        // lines/rows
        for (int i = 1; i <= n; i++) {

            // space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("   ");
            }

            // star
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(" * ");
            }

            System.out.println();

        }
        // lower half

        for (int i = n; i >= 1; i--) {
            // space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("   ");
            }

            // star
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(" * ");
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        Diamond_Pattern(n);
        sc.close();
    }

}
