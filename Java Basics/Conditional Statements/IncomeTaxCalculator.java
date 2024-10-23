import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     int Income = sc.nextInt();
     int tax;
        if (Income < 500000) {
            tax = 0;
        System.out.println("Your Tax is " + tax);
    }
    else if (Income >= 500000 && Income < 1000000) {
        tax =(int) (Income * 0.2);
        System.out.println("Your Tax is " + tax);
    }

    else {
tax = (int)(Income * 0.3);
System.out.println("Your Tax is " + tax);

    }
}
}
