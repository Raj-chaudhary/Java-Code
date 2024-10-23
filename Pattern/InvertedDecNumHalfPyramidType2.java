import java.util.Scanner;

public class InvertedDecNumHalfPyramidType2 {

    /*
54321
4321
321
21
1
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt(); 

        for (int line = n; line >= 1 ; line--) {

            for (int number = n; number >= 1; number--) {

             System.out.print(number);   
            }
            n--;
            System.out.println();
        }

  sc.close();  
}
}
