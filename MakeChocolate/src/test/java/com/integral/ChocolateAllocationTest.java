package com.integral;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ChocolateAllocationTest {

    @Test
    public void everythingZero() {
        assertEquals(0, ChocolateAllocation.makeChocolate(0, 0, 0));
    }

    @Test
    public void oneSmallOneGoal() {
        assertEquals(1, ChocolateAllocation.makeChocolate(1, 0, 1));
    }

    @Test
    public void twoSmallOneGoal() {
        assertEquals(1, ChocolateAllocation.makeChocolate(2, 0, 1));
    }

    @Test
    public void zeroSmallOneBig() {
        assertEquals(0, ChocolateAllocation.makeChocolate(0, 1, 5));
    }

    @Test
    public void sevenSmallNoBigSevenGoal() {
        assertEquals(7, ChocolateAllocation.makeChocolate(7, 0, 7));
    }

    @Test
    public void fiveSmallOneBigFiveGoal() {
        assertEquals(0, ChocolateAllocation.makeChocolate(5, 1, 5));
    }

    @Test
    public void twoSmallOneBigZeroGoal() {
        assertEquals(0, ChocolateAllocation.makeChocolate(2, 1, 0));
    }

    @Test
    public void fourSmallOneBigNineGoal() {
        assertEquals(4, ChocolateAllocation.makeChocolate(4, 1, 9));
    }

    @Test
    public void fourSmallOneBigSevenGoal() {
        assertEquals(2, ChocolateAllocation.makeChocolate(4, 1, 7));
    }

    @Test
    public void zeroSmallOneBigOneGoal() {
        assertEquals(-1, ChocolateAllocation.makeChocolate(0, 1, 1));
    }

    @Test
    public void someSmallOneBigTenGoal() {
        assertEquals(-1, ChocolateAllocation.makeChocolate(3, 1, 10));
    }

    @Test
    public void threeSmallOneBigThreeGoal() {
        assertEquals(3, ChocolateAllocation.makeChocolate(3, 1, 3));
    }

    @Test
    public void threeSmallTwoBigSevenGoal() {
        assertEquals(2, ChocolateAllocation.makeChocolate(3, 2, 7));
    }

    @Test
    public void tenSmallTwoBigSeventeenGoal() {
        assertEquals(7, ChocolateAllocation.makeChocolate(10, 2, 17));
    }
}