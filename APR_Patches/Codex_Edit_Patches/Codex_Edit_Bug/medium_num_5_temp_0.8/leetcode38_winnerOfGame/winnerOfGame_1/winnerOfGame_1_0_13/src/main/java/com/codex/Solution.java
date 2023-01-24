package com.codex;

import java.util.*;

public class Solution {
    public static boolean winnerOfGame(String colors) {
        
        int i = 0;
        int countA = 0;
        int countB = 0;
        while (i < colors.length()) 
            if (colors.charAt(i) == 'A') {
                countA++;
            } else if (colors.charAt(i) == 'B') {
                countB++;
            }
        if (countA % 2 == 1 && countB % 2 == 0) {
            return true;
        } else if (countA % 2 == 0 && countB % 2 == 1) {
            return true;
        } else if (countA % 2 == 0 && countB % 2 == 0) {
            return true;
        } else if (countA % 2 == 1 && countB % 2 == 1) {
            return false;
        } else{
            return false;
        }
    }

}