package BitManipulation;

public class set_ith_Bit {
    public static void main(String[] args) {
        // set means set that index with 1
        int n = 10; // 1010 in binary
        int i = 2; // index of bit to be set (0-indexed)
        int bitMask = 1<<i;
        System.out.println(n | bitMask);
    }
}
