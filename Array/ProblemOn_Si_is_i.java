import java.util.*;

public class ProblemOn_Si_is_i {

    /*
    write java code  in which there are 12 strings S1 to S12 where print count++ if Si is equal to i 
     */
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        int count = 0;

        for (int i = 1; i <= 12; i++) {
            String str = scn.next();
            if (str.length() == i) {
                count++;
            }
        }
        System.out.print(count);
        scn.close();
    }
}