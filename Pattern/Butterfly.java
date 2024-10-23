import java.util.Scanner;

public class Butterfly {

/*
*              *
* *          * *
* * *      * * *
* * * *  * * * *
* * * *  * * * *
* * *      * * *
* *          * *
*              *
 */

    public static void Butterfly_Patter(int n) {

        // outer
        // first half
        for (int i = 1; i <= n; i++) {

            // inner
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // space
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            // star
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        // 2nd half

        // outer
        for (int i = n; i >= 1; i--) {
            // inner
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // space
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        Butterfly_Patter(n);
        sc.close();

    }
}
