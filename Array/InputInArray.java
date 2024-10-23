
import java.util.Scanner;

public class InputInArray {
    public static void main(String[] args) {
        int marks[] = new int[50];

        Scanner sc = new Scanner(System.in);
        // int phy;
        // phy = sc.nextInt();

System.out.println("Length of array: " + marks.length);  // length of array

        marks[0]  = sc.nextInt(); // physics
        marks[1]  = sc.nextInt(); // chemistry
        marks[2]  = sc.nextInt(); // maths

        System.out.println("phy: " +marks[0]);
        System.out.println("chem: " +marks[1]);
        System.out.println("maths: " +marks[2]);

marks[2] = 100;
System.out.println("maths: " +marks[2]);
sc.close();
    }

}
