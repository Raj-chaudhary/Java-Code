
import java.util.Scanner;

public class FloydTriangle {

    /* 
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
    */

    public static void Floyd_Triangle(int n) {
        int counter = 1;
        // line/ rows
        for (int i = 1; i <= n; i++) {

            // inner loop or how many time counter will print

            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        Floyd_Triangle(n);
        sc.close();
    }
}
