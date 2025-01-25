package CodingClub;

import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        int x=10;
        Scanner sc = new Scanner(System.in);
        try {
            int y = sc.nextInt();
            int ans = x/y;
            System.out.println("Ans is: " +ans);

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Hello World");



        try {
            int [] arr = {3,21,40};
            System.out.println(arr[10]);
        } catch (Exception e) {
           System.out.println("Caught " + e.getClass() );
        }
        finally{
            System.out.println("inside finally");
        }
       sc.close(); 
    }
}
