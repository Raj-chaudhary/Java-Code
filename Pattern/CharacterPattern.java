import java.util.Scanner;

public class CharacterPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        char ch = 'A';

        // A
        // B C
        // C D E
        // D E F G

        // outer loop

        for (int line = 1; line <= n; line++) {

            // inner loop
            for (int chars = 1; chars <= line; chars++) {
                System.out.print( ch + " ");
                ch++;
            }
            System.out.println();
        }
        sc.close();
    }

}
