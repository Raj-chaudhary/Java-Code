package BitManipulation;

public class BitManipulation {
    public static void main(String[] args) {
         // Binary AND --- when both is 1 then 1 else 0
         System.out.println(5 & 6); // 4

         // Binary OR --- When both 0 then 0 else 1
         System.out.println(5 | 6); // 7

         // Binary XOR --- same bit 0 and opposite bit 1
         System.out.println(5 ^ 6); // 3

         // Binary One's compliment  
         System.out.println(~5); // -6

         //Binary left shift a<<b = a * 2^b 
         System.out.println(5 << 2); // 20

         // Binary right Shift a>>b = a/2^b
         System.out.println(5 >> 2); // 1


        
    }
   

}
