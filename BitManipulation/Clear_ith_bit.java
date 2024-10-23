package BitManipulation;

public class Clear_ith_bit {
    public static void main(String[] args) {
        int n = 10; // 1010 in binary
        int i = 1;
        int bitMask = ~(1<<i);
        System.out.println(n & bitMask);

    }
}
