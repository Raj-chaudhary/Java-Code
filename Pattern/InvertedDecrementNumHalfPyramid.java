import java.util.Scanner;

public class InvertedDecrementNumHalfPyramid {


    /*
54321
5432
543
54
5   */
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt(); 

        for (int line = 1; line <= n ; line++) {

            for (int number = n; number >= line; number--) {

             System.out.print(number);   
            }
            System.out.println();
        }

  sc.close();  
}
}
