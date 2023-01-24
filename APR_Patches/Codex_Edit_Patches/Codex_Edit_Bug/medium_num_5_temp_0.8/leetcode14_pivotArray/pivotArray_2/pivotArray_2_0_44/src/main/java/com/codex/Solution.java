package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    // public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
    public int[] repeatedNumber(final int[] A) {

        int[] result = new int[2];
        int missingNumber = 0;
        int repeatedNumber = 0;

        int n = A.length;
        long sum = (long)n * (n + 1) / 2;
        long squareSum = (long)n * (n + 1) * (2 * n + 1) / 6;

        for (int i = 0; i < A.length; i++) {
            sum -= (long)A[i];
            squareSum -= (long)A[i] * A[i];
        }

        missingNumber = (int)((sum + squareSum / sum) / 2);
        repeatedNumber = (int)(missingNumber - sum);

        result[0] = repeatedNumber;
        result[1] = missingNumber;
        return result;

	}
}

    
}