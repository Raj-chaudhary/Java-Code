import java.util.Scanner;

public class HalfButterflyNum {

    /*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
     */
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();


        // upper half
        for (int line = 1; line <= n; line++) {
            for (int i = 1; i <= line; i++) {
                System.out.print(i+ " ");
            }
            System.out.println();
        }

        // lower half
        for (int i = n-1; i >=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+ " ");
            }
           
            System.out.println();
        }
        sc.close();
    }
}
