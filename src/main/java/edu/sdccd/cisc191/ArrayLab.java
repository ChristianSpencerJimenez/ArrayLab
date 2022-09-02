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
        int[][] spreadsheet = new int[][] { {1,2,3}, {4,5,6}, {7,8,9,4} };
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
        int arrayMaxValue = a[0][0];  //Sets Max to first possible array value. This helps with negative testing.
        try {
            for (int i = 0; i < a.length; i++)
            {
                for (int j = 0; j < a.length; j++)
                {
                    if (a[i][j] > arrayMaxValue)
                    {
                        arrayMaxValue = a[i][j];    //if tested array value is above 0 and is larger than the existing max, it is replaced.
                    }
                    //Below is when selected array value is < 0. and the greatest negative value is inputted to the value.
                    else if (a[i][j] < 0){
                        if (a[i][j] > arrayMaxValue){
                            a[i][j] = arrayMaxValue;
                        }
                    }
                }
            }

        }catch (ArrayIndexOutOfBoundsException e){}
        return arrayMaxValue;
    }



    /**
     * @param a 2D array
     * @param x row index
     * @return the sum of the elements in Row x of a
     */
    public static int rowSum(int[][] a, int x) {
        int arrayRowSum = 0;


        for (int i = 0; i < a[x].length; i++) //This is a for loop that scans the length of the array.
        {
            arrayRowSum += a[x][i];
        }
        return arrayRowSum;
    }


    /**
     * @param a 2D array
     * @param x column index
     * @return the sum of the elements in Column x of a (careful with rows of different lengths!)
     */
    public static int columnSum(int[][] a, int x) {
        int arrayColumnSum = 0;
            try {
                for (int i = 0; i < a.length; i++) //This is a for loop that scans the length of the array.
                {
                    arrayColumnSum += a[i][x];
                }
            }
            catch (ArrayIndexOutOfBoundsException e) {

            }
        return arrayColumnSum;
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