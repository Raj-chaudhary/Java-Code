import java.util.Scanner;

public class InvertedHalfPyramidType2 {

    /*
55555
4444
333
22
1
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        int counter = n;
        for (int lines = 1; lines <= n; lines++) {
            for (int i = n; i >= lines; i--) {
                System.out.print(counter);
            }
            counter--;
            System.out.println();

        }

        sc.close();
    }
}
