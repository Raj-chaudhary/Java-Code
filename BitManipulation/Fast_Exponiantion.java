package BitManipulation;

import java.util.Scanner;

public class Fast_Exponiantion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base: ");
        int a = sc.nextInt();
        System.out.println("Enter exponent: ");
        int n = sc.nextInt();

        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) { // Check LSB
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        System.out.println("Answer is: "+ans);

        System.out.println();
sc.close();

    }
}
