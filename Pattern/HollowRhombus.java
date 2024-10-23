
import java.util.Scanner;

public class HollowRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();
         /*
          
            * * * * *
           *       *
          *       *
         *       *
        * * * * *


          if n = 5,  lines = 5
         */

        int outerSp = n - 1;
        int innerSp = n - 2;

        for (int line = 1; line <= n; line++) {
            // Print outer Space
            for (int i = 0; i < outerSp; i++) {
                System.out.print("  ");
            }
            if (line == 1 || line == n) {

                for (int i = 0; i < n; i++) {
                    System.out.print("* ");
                }
            } else {

                // Print Star
                System.out.print("* ");

                // Print inner space
                for (int i = 0; i < innerSp; i++) {
                    System.out.print("  ");
                }
                // Print Star
                System.out.print("* ");

            }
            System.out.println();
            outerSp--;

        }

  sc.close();
    }
}
