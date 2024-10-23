import java.util.Scanner;

public class OppoHalfPyramidNum {

    /* 
        1
      1 2
    1 2 3
  1 2 3 4
1 2 3 4 5
    */
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();  
        
        

        for (int line = 1; line <= n ; line++) {

            // Printing Space

            for (int j = 2*n-line; j > line; j--)
            {
                System.out.print(" ");
            }


            for (int j = 1; j <= line; j++)
            {
                System.out.print(j+" ");
            }
 
            System.out.println();
        }

  sc.close();  
}
}
