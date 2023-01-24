package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] rolls = {1, 1, 1, 1, 1, 5, 1, 1, 1, 5};
        int n = 5;
        int mean = 5;
        int[] res = missingRolls(rolls, n, mean);
        System.out.println(Arrays.toString(res));
    }

    public static int[] missingRolls(int[] rolls, int n, int mean) {

        int[] res = new int[n]; 
        int sum = n * mean;
        for (int i : rolls) {
            sum -= i;
        }
        if (sum < 0) return new int[0];
        Arrays.fill(res, mean);
        sum /= n;
        System.out.println(sum);
        if (sum % 6 == 0 || sum % 6 == 2) {
            return new int[0];
        }
        return res;
    }
}
}