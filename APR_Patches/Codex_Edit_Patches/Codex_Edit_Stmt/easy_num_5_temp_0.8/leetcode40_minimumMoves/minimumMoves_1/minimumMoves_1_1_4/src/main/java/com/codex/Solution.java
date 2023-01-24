package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        /*
        String[] arr = {"boo", "and", "foo"};
        String[] arr2 = Arrays.copyOf(arr, arr.length);
        System.out.println(arr2);
        
        String b = "bar";
        String bb = "bar";
        System.out.println(b == bb);
        */
        
        String s = "XXXX_XX_XX_XXXX";
        System.out.println(minimumMoves(s));
        
    }
    
    public static int minimumMoves(String s) {
        
        if (s.length() < 3) { return 0; }
        int count = 0;
        for (int i = 2; i < s.length(); i++) {
            if (s.charAt(i) == '_' && s.charAt(i - 1) == 'X' && s.charAt(i - 2) == 'X') {
                count++;
                i += 2;
            }
        }
        return count;
        
    }
}


    
}