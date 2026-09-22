package Array.Medium;
import java.util.*;
class Solution{
    public List<Integer> SpiralMtrix(int[][] matrix){
        if(matrix.length == 0 || matrix[0].length == 0){
            return new ArrayList<>();
        }
        List<Integer> order = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length-1;
        int right = matrix[0].length-1;
        int left = 0;

        while(top <= bottom && left <= right){
            for(int col=left; col <= right; col++){
                order.add(matrix[top][col]);
            }
            top++;

            for(int row = top; row <= bottom; row++){
                order.add(matrix[row][right]);
            }
            right--;

            if(top <= bottom){
                for(int col=right; col>=left; col--){
                    order.add(matrix[bottom][col]);
                }
                bottom--;
            }
            
            if(left <= right){
                for(int row=bottom; row>=top; row--){
                    order.add(matrix[row][left]);
                }
                left++;
            }
        }
        return order;
    }
}
public class SpiralMtrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3,4,5,},
            {6,7,8,9,10},
            {11,12,13,14,15},
            {16,17,18,19,20}
        };
        Solution sol =  new Solution();
        List<Integer> result = sol.SpiralMtrix(matrix);
        System.out.print(result);
    }
}
