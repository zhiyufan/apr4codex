package com.codex;

import java.util.*;

public class Solution {
    public static int minTimeToType(String word) {
        

        int res = 0;
        for (int i = 1; i < word.length(); i++) {
            res += Math.min(move(word.charAt(i - 1), word.charAt(i)), 26 - move(word.charAt(i - 1), word.charAt(i)));
        }
        return res;
    }

    private static int move(char c1, char c2) {
        int num1 = c1 - 'a';
        int num2 = c2 - 'a';
        return Math.abs(num1 - num2);
    }


    int result = 0;
    public int beautifulArray(int N) {
        int[] res = new int[N];
        dfs(res, 0, N);
        return res[N - 1];
    }

    private int dfs(int[] res, int start, int end) {
        if (start == end) {
            return start;
        }
        int i = start;
        int j = end;
        int mid = 0;
        while (i < j) {
            mid = (i + j) / 2;
            if (mid % 2 == 0) {
                mid--;
            }
            res[mid] = dfs(res, start, mid);
            res[mid + 1] = dfs(res, mid + 1, end);
            j = mid;
        }
        return ++result;
    }

    

    
}