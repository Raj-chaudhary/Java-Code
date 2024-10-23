import java.util.Scanner;

public class ProblemOfMinimalTravelFromAtoZ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int count = 0;

        for (int i = 0; i < 25; i++) { // A to Y
            char currentChar = (char) ('A' + i);
            char nextChar = (char) ('A' + (i + 1));

            int x = str.indexOf(currentChar);
            int y = str.indexOf(nextChar);

            count += Math.abs(x - y);

        }
        System.out.println(count);

        sc.close();
    }
}
