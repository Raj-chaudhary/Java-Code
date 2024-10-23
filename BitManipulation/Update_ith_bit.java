package BitManipulation;

public class Update_ith_bit {
    public static void main(String[] args) {
        int n = 10; // 1010 in binary
        int i = 2;
        int newBit = 1;
        int bitMask = ~(1<<i);
        int bitMaskPos = 1<<i;
        if (newBit == 0){
            System.out.println(n & bitMask);
        } else {
           System.out.println(n | bitMaskPos);
    }
}
}