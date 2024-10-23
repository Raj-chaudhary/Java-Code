public class DiagonalSum {

    public static int PrintDiagonalSum(int matrix[][]){
        int sum = 0;
for (int i = 0; i < matrix.length; i++) {
    
// primary diagonal
sum+= matrix[i][i];

// Secondary diagonal
if(i != matrix.length-i-1)
sum+= matrix[i][matrix.length-i-1];
}
return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        // int matrix[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println("Sum of Diagonal Elements is: "+PrintDiagonalSum(matrix));
    }
}
