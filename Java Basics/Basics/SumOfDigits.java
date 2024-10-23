import java.util.Scanner;

public class SumOfDigits {

    public static int GetSumOfDigits(int num){
        int sum = 0;
        while (num > 0) {
        sum = sum + (num%10);
        num = num/10;
        
    }
    return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
       System.out.println((GetSumOfDigits(num)));
       sc.close();
    }
}
