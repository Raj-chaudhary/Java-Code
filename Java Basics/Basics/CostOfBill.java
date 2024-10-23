import java.util.Scanner;

public class CostOfBill {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float CostOfPencil =  sc.nextFloat();
    float CostOfPen =  sc.nextFloat();
    float CostOfEraser =  sc.nextFloat();

    System.out.println("Cost Of Pencil is: " + CostOfPencil);
    System.out.println("Cost Of Pen is: " + CostOfPen);
    System.out.println("Cost Of Eraser is: " + CostOfEraser);

    Float TotalCost = CostOfPencil + CostOfPen + CostOfEraser;
    System.out.println("Total Cost is: " + TotalCost);
// adding 18% GST
    
    float FinalCost = TotalCost + (0.18f * TotalCost);
    System.out.println("Final Cost after adding 18% GST is: " + FinalCost);
    sc.close();
 }   
}

