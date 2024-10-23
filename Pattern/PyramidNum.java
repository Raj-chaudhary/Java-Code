import java.util.Scanner;

public class PyramidNum {

    /*
    1
   1 2
  1 2 3 
 1 2 3 4
1 2 3 4 5
     
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {

            // print space 
            for (int i = 1; i <= n-row; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= row; i++) {
                System.out.print(i+ " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
