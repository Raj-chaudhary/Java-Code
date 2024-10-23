import java.util.Scanner;

public class PallindromePyramid {

    /*
        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
     */
    public static void Palindromic_Pattern(int n) {

        // outer/row
        for (int i = 1; i <= n; i++) {

            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Stars
            // Descending
            for (int j = i; j >= 1; j--) {
                System.out.print(j+ " ");
            }
            // Ascending
            for (int j = 2; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        Palindromic_Pattern(n);
        sc.close();

    }
}
