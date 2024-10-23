import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        // next    --> it only prints ony first word before space
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        // nextLine   --> it prints complete line 
        // Scanner sc = new Scanner(System.in);
        // String input = sc.nextLine();

        // nextInt
        // Scanner sc = new Scanner(System.in);
        // int input = sc.nextInt();

        // nextByte
        // nextFloat
        // nextDouble
        // nextBoolean
        // nextsShort
        // nextLong

        System.out.println(input);
        sc.close();
    }
}
