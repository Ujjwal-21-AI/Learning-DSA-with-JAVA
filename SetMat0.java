import java.util.*;

class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        if (rows == 0) {
            return;
        }
        int cols = matrix[0].length;
        int[][] original = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                original[row][col] = matrix[row][col];
            }
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (original[row][col] == 0) {
                    for (int c = 0; c < cols; c++) {
                        matrix[row][c] = 0;
                    }
                    for (int r = 0; r < rows; r++) {
                        matrix[r][col] = 0;
                    }
                }
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 0, 4},
            {5, 6, 7, 8},
            {9, 0, 11, 12},
            {13, 14, 15, 16}
        };

        Solution sol = new Solution();
        sol.setZeroes(matrix);
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}