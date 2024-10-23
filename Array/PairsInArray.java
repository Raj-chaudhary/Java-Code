public class PairsInArray {


    public static void PrinPairs(int num[]) {
        int totalPairs = 0;
        // total no. of pairs = n(n-1)/2 i.e n=6 5*4/2 = 10 
        for (int i = 0; i < num.length; i++) {

            int curr = num[i];
            for (int j = i + 1; j < num.length; j++) {
                System.out.print("(" + curr + "," + num[j] + ")");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total pairs are: " + totalPairs);
    }

    public static void main(String[] args) {
        int num[] = { 6, 8, 9, 11, 15, 20, 17 };
        PrinPairs(num);
    }
}
