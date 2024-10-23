public class TripletSum {


    public static void tripleSum(int nums[]){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if(nums[i] + nums[j] + nums[k] == 0){
                        System.out.println(nums[i] + "," + nums[j] + "," +nums[k]);
                    }
                }
            }
        }
    } 
    public static void main(String[] args) {
        int array[]= {-1, 0, 1, 2, -1, -4};
        tripleSum(array);
    }
}
