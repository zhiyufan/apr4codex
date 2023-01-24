package com.codex;

import java.util.*;

public class Solution {
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        
        int sum = mean * (rolls.length + n);
        for (int x : rolls) sum -= x;
        if (sum % n != 0) return new int[]{};
        else {
            int avg = sum / n;
            if (avg < 1 || avg > 6) return new int[]{};
            else {
                int[] res = new int[n];
                Arrays.fill(res, avg);
                return res;
            }
        }
    }


public class DoritosContest {

    public static boolean canDivide(int[] rolls, int prev) {
        if (rolls.length <= 1) return true;
        else {
            int count = 1;
            for (int i = 1; i < rolls.length; i++)
                if (rolls[i] == rolls[i - 1]) count++;
                else if (rolls[i] != rolls[i - 1] && count % 2 == 1) return false;
                else if (rolls[i] != rolls[i - 1] && count % 2 == 0) count = 1;
            return count % 2 == 0;
        }
    }

    public static int doritosContest(int[] rolls) {
        int[] sum = new int[rolls.length + 1];
        for (int i = 0; i < rolls.length; i++) sum[i + 1] = rolls[i] + sum[i];
        int res = 1;
        for (int i = 0; i < rolls.length - 1; i++) {
            int[] arr = Arrays.copyOfRange(rolls, i + 1, rolls.length);
            int prev = rolls[i];
            for (int j = 1; j <= 6; j++)
                if ((rolls.length + i - sum[i + 1]) % 2 == 1) {
                    if (j == prev) continue;
                    else if (canDivide(arr, j)) res++;
                } else {
                    if (j != prev && canDivide(arr, j)) res++;
                    else if (j == prev && canDivide(arr, j)) res++;
                }
        }
        return res;
    }
}
    
}