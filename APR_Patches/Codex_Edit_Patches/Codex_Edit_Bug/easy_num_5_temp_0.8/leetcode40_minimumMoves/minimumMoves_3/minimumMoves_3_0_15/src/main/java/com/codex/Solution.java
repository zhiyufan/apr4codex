package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int minimumMoves(String s) {
        int result = 0;
        int length = s.length();
        int r = 0;
        while (r < length) {
            if (r + 1 < length && s.charAt(r) == 'X' && s.charAt(r + 1) == 'X') {
                result++;
                r++;
            } else if (r + 1 < length && s.charAt(r) == 'X' && s.charAt(r + 1) == 'O') {
                result++;
                r++;
            } else if (r + 2 < length && s.charAt(r) == 'X' && s.charAt(r + 1) == 'O' && s.charAt(r + 2) == 'X') {
                result++;
                r++;
            }
            r++;
        }
        return move;
    }
}