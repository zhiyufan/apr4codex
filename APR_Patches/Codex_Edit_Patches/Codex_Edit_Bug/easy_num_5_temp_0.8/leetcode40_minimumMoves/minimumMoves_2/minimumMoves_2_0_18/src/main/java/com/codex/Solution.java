package com.codex;

import java.util.*;

public class Solution {
    public static int minimumMoves(String s) {
        
        int count = 0;
        int changed = 0;
        while(true) {
            int X = 0;
            int O = 0;
            int XO = 0;
            for (int i = 0; i < s.length() - 2; i++) {
                if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i + 1) == s.charAt(i + 2) && s.charAt(i) == 'X') {
                    count++;
                    i += 2;
                }
            }
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == 'X') {
                    X++;
                } else if(s.charAt(i) == 'O') {
                    O++;
                } else if(s.charAt(i) == 'M') {
                    XO++;
                }
            }
            X = (X + XO) % 3;
            O = (O + XO) % 3;
            if(X == 1) {
                changed = replace(s, 'O', 'M');
                if(changed == -1) {
                    return -1;
                } else {
                    count++;
                }
            } else if(X == 2) {
                changed = replace(s, 'O', 'M');
                if(changed == -1) {
                    return -1;
                } else {
                    count++;
                }
                changed = replace(s, 'O', 'M');
                if(changed == -1) {
                    return -1;
                } else {
                    count++;
                }
            } else if(O == 1) {
                changed = replace(s, 'X', 'M');
                if(changed == -1) {
                    return -1;
                } else {
                    count++;
                }
            } else if(O == 2) {
                changed = replace(s, 'X', 'M');
                if(changed == -1) {
                    return -1;
                } else {
                    count++;
                }
                changed = replace(s, 'X', 'M');
                if(changed == -1) {
                    return -1;
                } else {
                    count++;
                }
            } else {
                break;
            }
        }
        return count;
    }
    public static int replace(String s, char x, char y) {
        StringBuilder sb = new StringBuilder(s);
        int index = s.lastIndexOf("" + x);
        if(index == -1) {
            return -1;
        }
        sb.setCharAt(index, y);
        s = sb.toString();
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(minimumMoves("XXXXXX"));
    }

    
}