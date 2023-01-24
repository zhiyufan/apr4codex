package com.codex;

import java.util.*;

public class Solution {
package grokking_programs;



public class Grokking_Programs {

public static int minimumMoves(String s) {
        
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i + 1) == s.charAt(i + 2) && s.charAt(i) == 'X') {
                count++;
                i += 2;
            }
        }
        return count;
    }

    public static void main(String[] args) {
      String str = "XXX";
      System.out.println(minimumMoves(str));
    }
    
}
    
}