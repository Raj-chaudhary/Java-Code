import java.util.Scanner;

public class DecrementNumHalfPyramid {


    /*
5
54
543
5432
54321
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt(); 

        for (int line = n; line >= 1 ; line--) {

            for (int number = n; number >= line; number--) {

             System.out.print(number);   
            }
            System.out.println();
        }

  sc.close();  
}
}
