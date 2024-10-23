package Loop;
public class SumOfNNaturalNumber{
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        int i =1;
        while (i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of first " + n + " natural number is " + sum);
}
}