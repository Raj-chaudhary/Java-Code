package BitManipulation;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if ((n & 1) == 1) {
            System.out.println(n + " is an odd number.");
        } else 
        System.out.println(n + " is an even number.");
        sc.close();
    }
}
