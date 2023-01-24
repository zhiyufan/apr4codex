package com.codex;

import java.util.*;

public class Solution {
    public static boolean winnerOfGame(String colors) {
        
        StringBuilder sb = new StringBuilder(colors);
        int index = 0;
        while (index + 2 < sb.length()) {
            if (isWinningPosition(sb.charAt(index), sb.charAt(index + 1), sb.charAt(index + 2))) {
                sb.deleteCharAt(index + 1);
                index = index + 1;
            } else {
                index++;
            }
        }
        return isWinningPosition(sb.charAt(0), sb.charAt(1), sb.charAt(2));
    } 
}