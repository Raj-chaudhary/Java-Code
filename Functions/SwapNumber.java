package Functions;

public class SwapNumber {


    // Call by value take place
    public static void Swap(int a, int b){
        int temp = a;
        a = b;
        b = temp; 
        System.out.println("After Swapping");
        System.out.println("a = " +a);
        System.out.println("b = " +b);

    }
    public static void main(String[] args) {
        // Swap  - values exchange
        System.out.println("Before Swapping");
        
        int a = 10;
        int b = 20;
        System.out.println("a = " +a);
        System.out.println("b = " +b);
        Swap(a,b);

    }
}
