package com.codex;

import java.util.*;

public class Solution {
   public static int[] missingRolls(int[] rolls, int mean, int n) {
   
        int sum = mean * (rolls.length + n);
        for (int x : rolls) sum -= x;
        if (sum % n != 0) return new int[]{};
        else {
            int face = sum / n;
            if (face < 1 || face > 6) return new int[]{};
            else {
                int[] ans = new int[n];
                Arrays.fill(ans, face);
                return ans;
            }
        }
    }

    
}