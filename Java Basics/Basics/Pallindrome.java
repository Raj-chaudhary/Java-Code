import java.util.Scanner;

public class Pallindrome {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number");
     int num = sc.nextInt();
     int temp = num;
     int rev_num = 0;
     
     while(temp!=0){
        rev_num = rev_num*10;
        rev_num = rev_num + (temp%10);
        temp = temp/10;
     } if(num ==rev_num){
         System.out.println("The number is pallindrome");
     } else{
        System.out.println("The number is not pallindrome");
     }
     sc.close();
   } 
}
