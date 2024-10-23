import java.util.Scanner;

public class InvertedHalfPyramidNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();

        // 1 2 3 4
        // 1 2 3
        // 1 2 
        // 1 
        int counter = n;
        for (int line = 1; line <= n; line++) {

            for (int number = 1; number <= counter; number++) {
                System.out.print(number);
            }
            System.out.println();
            counter--;
        }

        sc.close();
    }
}
