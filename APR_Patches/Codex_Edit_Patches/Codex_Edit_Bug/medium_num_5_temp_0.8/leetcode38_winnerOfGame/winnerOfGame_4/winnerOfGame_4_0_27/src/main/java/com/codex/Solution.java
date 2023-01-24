package com.codex;

import java.util.*;

public class Solution {
package others;

public class GhostGame {
    public static void main(String args[]){
        String str = "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGB";
        String str1 = "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRG";
        String result = winnerOfGame(str);
        String result1 = winnerOfGame(str1);
        System.out.println(result);
        System.out.println(result1);
    }

    public static String winnerOfGame(String colors) {
        if (colors.length() == 0) {
            return "NO WINNER";
        } else if (colors.length() == 1) {
            return "Tead";
        } else {
            if(isWinningPossibility(colors).equals("Tead")){
                return "Tead";
            }else if(isWinningPossibility(colors).equals("King")){
                return "King";
            }else{
                return "Ghost";
            }
        }
    }

    private static String isWinningPossibility(String colors) {
        if (colors.length() == 0) {
            return "NO WINNER";
        } else if (colors.length() == 1) {
            return "Tead";
        }

        StringBuilder sb = new StringBuilder(colors);
        int index = 0;
        while (index + 2 < sb.length()) {
            char start = sb.charAt(index);
            char mid = sb.charAt(index + 1);
            char end = sb.charAt(index + 2);
            if (start == mid && mid == end) {
                sb.deleteCharAt(index + 1);
                index = index + 2;
            } else {
                index++;
            }
        }
        return isWinningPossibility(sb.toString());
    }
}