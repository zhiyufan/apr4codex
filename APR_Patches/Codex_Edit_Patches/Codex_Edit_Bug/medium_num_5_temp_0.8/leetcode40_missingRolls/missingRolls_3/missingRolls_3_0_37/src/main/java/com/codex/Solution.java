package com.codex;

import java.util.*;

public class Solution {
package com.company;

public class GuessTheMean implements Algorithm{

    /**
     * Find the mean of the array
     * @param n Length of the array
     * @param rolls Integer array with length n
     * @param mean Mean found, -1 if not found
     * @param stDev Standard deviation found, -1 if not found
     * @return 0 if mean and stDev is correct, 1 if mean is correct but stDev is wrong,
     * 2 if mean is wrong but stDev is correct, 3 if neither mean nor stDev is correct,
     * 4 if mean is correct but stDev is not calculated.
     */
    @Override
    public int guessMean(int n, int[] rolls, int mean, int stDev) {

    public static int[] missingRolls(int[] rolls, int mean, int n) {

        int[] ans = new int[n];
        int sum = 0;
        int meanCount = 0;
        int stDevCount = 0;
        for(int i = 0; i < rolls.length; i++) {
            sum += rolls[i];
        }
        return ans;
    }

}
}