import java.util.Scanner;

public class HollowSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();

        // * * * * *
        // *       *
        // *       *
        // * * * * *
        int st = n;
        int sp = n - 2;

        for (int line = 1; line <= n - 1; line++) {
            if (line == 1 || line == n - 1) {

                // Print n star
                for (int i = 0; i < st; i++) {
                    System.out.print("* ");
                }
            } else {
                // Print one star
                System.out.print("* ");

                // print spaces
                for (int i = 0; i < sp; i++) {
                    System.out.print("  ");
                }

                // print one star
                System.out.print("* ");

            }
            System.out.println();
        }

    }
}
