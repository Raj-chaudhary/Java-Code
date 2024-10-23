package BitManipulation;

public class Get_ith_Bit {
    public static void main(String[] args) {
        int n = 10; // 1010 in binary
        int i = 2;
        int bitMask = 1<<i;

        if((n & bitMask) == 0){
System.out.println("0");
        } else 
        System.out.println("1");

    }
}
