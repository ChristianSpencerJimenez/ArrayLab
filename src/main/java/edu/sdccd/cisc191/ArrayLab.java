package edu.sdccd.cisc191;

/**
 * CISC191 2.3 Multidimensional Arrays - Junior
 * @author Andrew Huang
 */


public class ArrayLab {
    /**
     * @param args command line parameters
     */
    public static void main(String[] args) {
        int[][] spreadsheet = new int[][] { {1,2,3}, {4,5,6}, {7,8,9} };
        System.out.println("Max: " + max(spreadsheet));
        System.out.println("Sum of row 0: " + rowSum(spreadsheet,0));
        System.out.println("Sum of col 0: " + columnSum(spreadsheet,0));
        int[] rowSums = allRowSums(spreadsheet);
        for(int row = 0; row < rowSums.length; row++) {
            System.out.println("Sum of row " + row + ": " + rowSums[row]);
        }

    }

    /**
     * @param a 2D array
     * @return the maximum value in the 2d parameter array a
     */
    public static int max(int[][] a) {
        return 0;
    }

    /**
     * @param a 2D array
     * @param x row index
     * @return the sum of the elements in Row x of a
     */
    public static int rowSum(int[][] a, int x) {
        return 0;
    }

    /**
     * @param a 2D array
     * @param x column index
     * @return the sum of the elements in Column x of a (careful with rows of different lengths!)
     */
    public static int columnSum(int[][] a, int x) {
        return 0;
    }

    /**
     * @param a 2D array
     * @return calculates the row sum for every row and returns each of the values in an array. Index i of the return array contains the sum of elements in row i.
     */
    public static int[] allRowSums(int[][] a) {
        return new int[] {0};
    }
}