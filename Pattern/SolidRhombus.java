
import java.util.Scanner;

public class SolidRhombus {

    /*
         *  *  *  *  *
       *  *  *  *  *
     *  *  *  *  *
   *  *  *  *  *
 *  *  *  *  *
     */

    public static void Solid_Rhombus(int n) {
        // lines/ rows
        for (int i = 1; i <= n; i++) {

            // Spaces
            for (int j = 1; j <=( n - i); j++) {
                System.out.print("  ");
            }
            // Star
            for (int j = 1; j <= n; j++) {
                System.out.print(" * ");
            }

            System.out.println();

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        Solid_Rhombus(n);
        sc.close();
    }

}
