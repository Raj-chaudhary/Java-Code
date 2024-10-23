import java.util.Scanner;

public class HalfPallindromePyramid {

/*
1
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
 */
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();

        for (int rows = 1; rows <= n; rows++) {

            // //Printing first half of the row
            for (int i = 1; i <= rows; i++) {
                System.out.print(i + " ");
            }

            // Printing second half of the row

            for (int i = rows - 1; i >= 1; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
