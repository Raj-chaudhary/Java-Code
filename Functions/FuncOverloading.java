package Functions;

/* 
In Java, Function/method Overloading allows different methods to have the same name, 
but different signatures where the signature can differ by the number of input parameters 
or type of input parameters, or a mixture of both.
*/ 

// function to calc sum of 2 nums
public class FuncOverloading {
    public static int Sum(int a, int b) {
        return a + b;
    }

    // function to calc sum of 3 nums
    public static int Sum(int a, int b, int c) {
        return a + b + c;
    }

    // function tot calc float sum of 2 nums

    public static float Sum(float a, float b){
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println(Sum(3, 5));
        System.out.println(Sum(5, 2, 1));
        System.out.println(Sum(3.5f, 4.5f));
    }
}
