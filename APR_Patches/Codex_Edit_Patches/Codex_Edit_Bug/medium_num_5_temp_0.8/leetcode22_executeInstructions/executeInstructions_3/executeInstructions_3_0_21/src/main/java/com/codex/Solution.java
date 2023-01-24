package com.codex;

import java.util.*;

public class Solution {
int[][] answer(int n, int[] startPos, String[] arr) 
{
    int[] row = { -1, 0, 1, 0 };
    int[] col = { 0, 1, 0, -1 };
    int[] pos = startPos;
    int[][] finalanswer = new int[arr.length][arr[0].length()];
    for (int i = 0; i < arr.length; i++) 
    {
        char[] s = arr[i].toCharArray();
        int[] currentpos = pos;
        int[] count = new int[s.length];
        int steps = 0;
        for (int j = 0; j < s.length; j++) 
        {
            int movement = (s[j] == 'L') ? 3 : s[j] - '0';
            int r = currentpos[0] + row[movement];
            int c = currentpos[1] + col[movement];
            if (isValid(n, r, c)) 
            {
                currentpos[0] = r;
                currentpos[1] = c;
                count[i] = steps;
            }
            steps++;
        }
    }
    return finalanswer;
}

boolean isValid(int n, int r, int c) 
{
    return (r >= 0 && r < n && c >= 0 && c < n);
}
}