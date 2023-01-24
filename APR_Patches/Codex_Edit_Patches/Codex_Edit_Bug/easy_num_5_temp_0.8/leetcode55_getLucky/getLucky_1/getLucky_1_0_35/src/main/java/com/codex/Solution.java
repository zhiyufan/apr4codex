package com.codex;

import java.util.*;

public class Solution {
    public int getLucky(String s) {
        int[][] count = new int[s.length() + 1][11];
        for (int i = 0; i < 10; i++)
            count[s.length()][i] = i == 7 ? -1 : 0;
        for (int i = s.length() - 1; i >= 0; i--)
            for (int j = 0; j < 10; j++)
                count[i][j] = j == 7 ? -1 : count[i + 1][j] + (j == (s.charAt(i) - '0') ? 1 : 0);
        for (int i = 0; i < s.length(); i++)
            if (count[i][7] > 0)
                return i;
        return -1;
    }
}