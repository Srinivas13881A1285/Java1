import java.util.Arrays;

/**
 * @author Srinivas_Chintakindhi
 */

public class PrintDiagonal {
    public static void printMatrixDiagonally(int[][] matrix) {
        int rowCount = matrix.length;
        int colCount = matrix[0].length;

        for (int k = 0; k < rowCount; k++) {
            for (int row = k, col = 0; row >= 0 && col < colCount; row--, col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }

        for (int k = 1; k < colCount; k++) {
            for (int row = rowCount - 1, col = k; row >= 0 && col < colCount; row--, col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int row = 4,col = 5;
        int k = 1;
        int matrix[][] = new int[row][col];
        for(int i = 0;i < row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j] = k++;
            }
        }

        System.out.println("Input Matrix");

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        System.out.println("\nPrinting Matrix Diagonally");
        printMatrixDiagonally(matrix);
    }
}
