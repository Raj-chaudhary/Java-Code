package BitManipulation;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        // Swap two number without using third variable

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int x = sc.nextInt();
        System.out.println("Enter second number");
        int y = sc.nextInt();

        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        System.out.println("swapped x is: " + x);
        System.out.println("swapped y is: " + y);


        
        sc.close();
    }
}
