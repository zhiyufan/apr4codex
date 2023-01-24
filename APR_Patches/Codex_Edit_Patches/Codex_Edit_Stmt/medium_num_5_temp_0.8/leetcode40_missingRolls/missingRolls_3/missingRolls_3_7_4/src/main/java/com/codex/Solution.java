package com.codex;

import java.util.*;

public class Solution {
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        
<<<<<<< HEAD
        int[] ans = new int[n];
=======
        int[] ans = new int[n-rolls.length];
>>>>>>> f54f2c9cd624b8aacfec6bbd2fbfe1b28b10ff42
        int sum1 = 0;
        for (int i = 0; i < rolls.length; i++) {
            sum1 += rolls[i];
        }
        int sum = (mean * (n + rolls.length)) - sum1;
        for (int i = 0; i < ans.length; i++) {
            ans[i] = sum / n;
        }
        return ans;
    }

    
}