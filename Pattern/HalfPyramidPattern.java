import java.util.Scanner;
public class HalfPyramidPattern {
    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();  
        
        

        for (int line = 1; line <= n ; line++) {
            for (int number = 1; number <= line; number++) {
             System.out.print(number);   
            }
            System.out.println();
        }

  sc.close();  
}
    
}
