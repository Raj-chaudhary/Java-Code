import java.util.Scanner;

public class O1Triangle {


    /*
1
0 1
1 0 1
0 1 0 1 
1 0 1 0 1
     
     */
    public static void _01Triangle(int n) {

        // outer loop/ lines/ rows
        for (int i = 1; i <= n; i++) {

            // inner loop
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        _01Triangle(n);
        sc.close();

    }
}
