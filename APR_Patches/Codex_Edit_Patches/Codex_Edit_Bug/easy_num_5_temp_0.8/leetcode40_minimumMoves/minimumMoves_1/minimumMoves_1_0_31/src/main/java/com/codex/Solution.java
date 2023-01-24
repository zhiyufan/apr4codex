package com.codex;

import java.util.*;

public class Solution {
    
    public class Solution {

    public static int minimumMoves(String s) { 
        int count = 0;
        boolean flag = false;
        int i = 0;
        while (i < s.length()) {
            if (flag) {
                if (s.charAt(i) == 'X') i++;
                else flag = false;
            } else {
                if (s.charAt(i) == 'X') {
                    if (i < s.length() - 2 && s.charAt(i + 1) == 'X' && s.charAt(i + 2) == 'X') {
                        count++;
                        i+=3;
                        flag = true;
                    } else {
                        i++;
                    }
                } else {
                    i++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "XXX";
        System.out.println(minimumMoves(s));
    }

}



















    /*public static int minimumMoves(String s) {
        
        if (s.length() < 3) return 0;
        int count = 0;
        for (int i = 2; i < s.length(); i++) {
            if (s.charAt(i) == 'X' && s.charAt(i - 1) == 'X' && s.charAt(i - 2) == 'X') {
                count++;
                i += 2;
            }
        }
        return count;
    }


*/
    
}