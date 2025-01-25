package CodingClub;

import java.util.Random;

public class Random_num_Generator {
public static void main(String[] args) {
     
    // upper bound will be exclusively
    Random random = new Random();
  int num =  random.nextInt(100);
    System.out.println(num);

    // random number between range
    int num2 = 50+ random.nextInt(50) ;
    System.out.println("Random number between 50-99: "+num2);

}    
}
