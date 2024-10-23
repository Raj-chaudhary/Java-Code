import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        /*

             1
           2 1 2
         3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5
        
       
        if n = 5 lines =  5
         */

        int sp = n - 1;
        int str = 1;

        for (int line = 1; line <= n; line++) {

            // print space
            for (int i = 0; i < sp; i++) {
                System.out.print("  ");
            }

            // print numbers
            int number = line;
            for (int i = 0; i < str; i++) {
                System.out.print(number + " ");
                if (i < str / 2) {
                    number--;
                } else {
                    number++;
                }
            }

            // Next line
            System.out.println();
            sp--;
            str += 2;

        }
sc.close();
    }
}
