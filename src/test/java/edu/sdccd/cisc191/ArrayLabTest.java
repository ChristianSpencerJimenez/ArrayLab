package edu.sdccd.cisc191;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayLabTest {

    // example arrays for testing
    private int[][] basic, allneg, nonsquare;

    /**
     * Sets up the test fixture with some arrays to test.
     * This method is called before every test case method.
     */
    @BeforeAll
    public void setUp() {
        basic = new int[][] { {1,2,3}, {4,5,6}, {7,8,9} };
        allneg = new int[][] { {-10,-12,-3}, {-4,-5,-6,-8}, {-7,-8} }; //all neg and ragged
        nonsquare = new int[][] { {1,2,3}, {4,5}, {6,7,8,9} };
    }

    /**
     * Test max is found correctly (last element in the search)
     */
    @Test
    public void testMaxNormal() {
        assertEquals(9,ArrayLab.max(basic));
    }

    /**
     * Test max correct when all vals are negative
     */
    @Test public void testMaxAllNeg() {
        assertEquals(-3,ArrayLab.max(allneg));
    }

    /**
     * Test row sum calculated correctly including for nonsquare arrays
     */
    @Test public void testRowSum() {
        assertEquals(6, ArrayLab.rowSum(basic, 0));
        assertEquals(15, ArrayLab.rowSum(basic, 1));
        assertEquals(24, ArrayLab.rowSum(basic, 2));
        assertEquals(30, ArrayLab.rowSum(nonsquare, 2));
    }

    /**
     * Test column sum calculated correctly for standard cases
     */
    @Test public void testColumnSum() {
        assertEquals(12, ArrayLab.columnSum(basic, 0));
        assertEquals(15, ArrayLab.columnSum(basic, 1));
        assertEquals(18, ArrayLab.columnSum(basic, 2));
    }


    /**
     * Test column sum calculated correctly for nonsquare arrays
     * This checks for sum of incomplete columns (from ragged arrays)
     */
    @Test public void testColumnSumRagged() {
        assertEquals(11, ArrayLab.columnSum(nonsquare, 2));
        assertEquals(9, ArrayLab.columnSum(nonsquare, 3));
    }

    /**
     * Checks array of row sums correctly calculated
     */
    @Test public void testAllRowSums() {
        int[] expected = new int[] {6,15,24};
        int[] actual = ArrayLab.allRowSums(basic);
        assertArrayEquals(expected, actual);
    }

}