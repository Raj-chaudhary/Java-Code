package Loop;
public class ReverseAnumber {
    public static void main(String[] args) {
        int num = 10899;
        //  int rev = 0;
        while (num > 0) {
            int last_digit = num % 10;
             System.out.print(last_digit + " ");
            // rev = (rev * 10) + last_digit;
            num = num / 10;

        }
        // System.out.println(rev);
    }
}
