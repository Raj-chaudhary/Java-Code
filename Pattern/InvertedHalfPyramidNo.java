import java.util.Scanner;

public class InvertedHalfPyramidNo {

    /*
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
     */

    public static void Inverted_Half_Num_pyramid(int n) {

        // lines/rows
        for (int i = 1; i <= n; i++) {
            // col
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        Inverted_Half_Num_pyramid(n);
        sc.close();
    }
}
