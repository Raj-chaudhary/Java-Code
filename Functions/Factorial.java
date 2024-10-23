package Functions;

public class Factorial {

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;

        }
        return fact; // Factorial of n
    }

    // binomial coefficient 

    public static int binCoeff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_n_r = factorial(n-r);
        int bin_coeff = fact_n/(fact_r*fact_n_r);
        return bin_coeff;

    }

    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(binCoeff(5, 2));
    }
}
