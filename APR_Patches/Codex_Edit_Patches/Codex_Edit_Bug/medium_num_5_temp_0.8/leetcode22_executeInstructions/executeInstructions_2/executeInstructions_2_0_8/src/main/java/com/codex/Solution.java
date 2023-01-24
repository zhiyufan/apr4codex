package com.codex;

import java.util.*;

public class Solution {

import java.util.*;

public class InstructionExecutor {

    public static int[] executeInstructions(int n, int[] startPos, String s) {

        int[] result = new int[s.length() + 1];
        int start = startPos[0];
        for (int i = 1; i <= s.length(); i++) {
            for (int j = start; j < i; j++) {
                result[j] = i - j;
            }
            start = i;
            int pos = startPos[1];
            int count = 1;
            while (pos >= 0 && pos < n && count < s.length() && i + count < s.length()) {
                if (s.charAt(i + count) == 'L') {
                    pos--;
                } else if (s.charAt(i + count) == 'R') {
                    pos++;
                }
                count++; 
            }
            result[i] = count;
        }
        return result;
    }

    
}