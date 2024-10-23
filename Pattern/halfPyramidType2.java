import java.util.Scanner;

public class halfPyramidType2 {

/*
1
22
333
4444
55555
 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();

        for (int lines = 1; lines <= n; lines++) {

            for (int i = 1; i <= lines ; i++) {
                System.out.print(lines);
            }
            System.out.println();

        }

        sc.close();
    }
}
