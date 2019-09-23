package com.integral;

public class ChocolateAllocation {

    public static int makeChocolate(int small, int big, int total) {

        if (total / 5 >= big) {
            total -= big * 5;
        } else {
            total %= 5;
        }

        if (total <= small) {
            return total;
        }
        return -1;
    }
}
