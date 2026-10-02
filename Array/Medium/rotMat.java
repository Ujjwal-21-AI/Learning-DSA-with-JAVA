package Array.Medium;
import java.util.*;

class Solution{
    public void rotate(int[][] matrix){
        int n = matrix.length;
        int[][] rotated = new int[n][n];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                rotated[j][n-1-i] = matrix[i][j];
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = rotated[i][j];
            }
        }
    }    
}
public class rotMat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int matrix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        Solution sol = new Solution();

        sol.rotate(matrix);
        printmatrix(matrix);
    }
    private static void printmatrix(int[][] matrix){
        for(int[] row : matrix){
            System.out.println(Arrays.toString(row));
        }
    }
}
