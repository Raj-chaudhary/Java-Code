import java.util.Scanner;

public class DecNumHalfPyramidType2 {

    /*
1
21
321
4321
54321
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt(); 

        for (int line = 1; line <= n ; line++) {

            for (int number = line; number >= 1; number--) {

             System.out.print(number);   
            }
            System.out.println();
        }

  sc.close();  
}
}