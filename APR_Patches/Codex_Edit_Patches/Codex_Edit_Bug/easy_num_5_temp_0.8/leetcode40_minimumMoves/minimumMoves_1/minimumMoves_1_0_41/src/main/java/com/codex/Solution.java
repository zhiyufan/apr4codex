package com.codex;

import java.util.*;

public class Solution {
    public static int minimumMoves(String s) {
        
        if (s.length() < 3) return 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i + 2 < s.length() && s.charAt(i) == 'X' && s.charAt(i + 1) == 'X' && s.charAt(i + 2) == 'X') {
                System.out.println(i);
                s = s.substring(0, i + 1) + "Y" + s.substring(i + 2);
                System.out.println(s);
                count += 1;
                i-=1;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(minimumMoves("XX"));
    }
}