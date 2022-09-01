package edu.sdccd.cisc191;

/**
 * CISC191 2.3 Multidimensional Arrays - Junior
 * @author Christian Jimenez
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

        int arrayMaxValue = 0;

        for (int i = 0; i < a.length; i++)   //This for loop scans each possible int i (within array).
        {
            for (int j = 0; j < a[i].length; j++) //This for loop scans each possible int j (within array). **I ADDED THE '[i]' after finding out it will not work if there is an extension to the array, ex.{ {1,2,3}, {4,5,6}, {7,8,9,45} }. with this 45 can be found as the max value.**
            {
                if (a[i][j] > arrayMaxValue)  //if selected point is greater than existing arrayMaxValue it will run the  int replacing in the body.
                {
                    arrayMaxValue = a[i][j];
                }
            }

        }
        return arrayMaxValue;
    }



    /**
     * @param a 2D array
     * @param x row index
     * @return the sum of the elements in Row x of a
     */
    public static int rowSum(int[][] a, int x) {
        int arrayRowError = 0;
        if (x < a.length)
        {
            int arrayRowSum = 0;

            for (int i = 0; i < a.length; i++) //This is a for loop that scans the length of the array.
            {
                arrayRowSum += a[x][i];
            }
            return arrayRowSum;
        }
        else
            return arrayRowError;
    }

    /**
     * @param a 2D array
     * @param x column index
     * @return the sum of the elements in Column x of a (careful with rows of different lengths!)
     */
    public static int columnSum(int[][] a, int x) {
        int arrayColumnError = 0;
        if (x < a.length) {
            int arrayColumnSum = 0;

            for (int i = 0; i < a.length; i++) //This is a for loop that scans the length of the array.
            {
                arrayColumnSum += a[i][x];
            }
            return arrayColumnSum;
        } else
            return arrayColumnError;
    }

    /**
     * @param a 2D array
     * @return calculates the row sum for every row and returns each of the values in an array. Index i of the return array contains the sum of elements in row i.
     */
    public static int[] allRowSums(int[][] a) {
        int[] rowReturnSum = new int[a.length];
        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a.length; i++) {
                rowReturnSum[j] += a[j][i];
            }
        }
        return new int[] {rowReturnSum[0], rowReturnSum[1], rowReturnSum[2]};
    }
}