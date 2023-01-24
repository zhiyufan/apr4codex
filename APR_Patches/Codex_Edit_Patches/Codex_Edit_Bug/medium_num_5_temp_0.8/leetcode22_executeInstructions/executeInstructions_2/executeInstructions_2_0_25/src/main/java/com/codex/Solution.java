package com.codex;

import java.util.*;

public class Solution {
public static int[] executeInstructions(int n, int[] startPos, String s) {

    int[] result = new int[s.length()];
    for (int i = 0; i < s.length(); i++) {
        int count = 0;
        int[] pos = new int[2];
        pos[0] = startPos[0];
        pos[1] = startPos[1];
        while (pos[0] >= 0 && pos[0] < n && pos[1] >= 0 && pos[1] < n && i + count < s.length()) {
            if (s.charAt(i + count) == 'L') {
                pos[1]--;
            } else if (s.charAt(i + count) == 'R') {
                pos[1]++;
            } else if (s.charAt(i + count) == 'U') {
                pos[0]--;
            } else if (s.charAt(i + count) == 'D') {
                pos[0]++;
            } else if (s.charAt(i + count) == '*') {
                break;
            }
            count++;
        } count--; //lelele
        result[i] = count;
    }
    return result;
}



//
//    public static int[] executeInstructions(int n, int[] startPos, String s) {
//        
//        int[] result = new int[s.length()];
//        for (int i = 0; i < s.length(); i++) {
//            int count = 0;
//            int[] pos = new int[2];
//            pos[0] = startPos[0];
//            pos[1] = startPos[1];
//            while (pos[0] >= 0 && pos[0] < n && pos[1] >= 0 && pos[1] < n && i + count < s.length()) {
//                if (s.charAt(i + count) == 'L') {
//                    pos[1]--;
//                } else if (s.charAt(i + count) == 'R') {
//                    pos[1]++;
//                } else if (s.charAt(i + count) == 'U') {
//                    pos[0]--;
//                } else if (s.charAt(i + count) == 'D') {
//                    pos[0]++;
//                }
//                count++;
//            }
//            result[i] = count;
//        }
//        return result;
//    }
//
//    






//    public static int[] executeInstructions(int n, int[] startPos, String s) {
//        if (n <= 0) return new int[0];
//        if (startPos.length != 2) return new int[0];
//
//        int[] positions = new int[s.length()];
//        for (int i = 0; i < s.length(); i++) {
//            positions[i] = executeInstruction(n, startPos, s.substring(i));
//        }
//        return positions;
//    }
//
//    private static int executeInstruction(int n, int[] startPos, String s) {
//        int count = 0;
//        int[] pos = new int[2];
//        pos[0] = startPos[0];
//        pos[1] = startPos[1];
//
//        while (pos[0] >= 0 && pos[0] < n && pos[1] >= 0 && pos[1] < n) {
//            if (s.charAt(count) == 'L') {
//                pos[1]--;
//            } else if (s.charAt(count) == 'R') {
//                pos[1]++;
//            } else if (s.charAt(count) == 'U') {
//                pos[0]--;
//            } else if (s.charAt(count) == 'D') {
//                pos[0]++;
//            } else {
//                return count;
//            }
//            count++;
//        }
//        return count;
//    }









//    public static int[] executeInstructions(int n, int[] startPos, String s) {
//        if (n <= 0) return new int[0];
//        if (startPos.length != 2) return new int[0];
//        if (s.length() == 0) return new int[0];
//
//        int[] result = new int[s.length()];
//
//        for (int i = 0; i < s.length(); i++) {
//            int pos = 0;
//            int x = startPos[0];
//            int y = startPos[1];
//
//            while (x >= 0 && x < n && y >= 0 && y < n && pos < s.length() && s.charAt(pos) != '*') {
//                if (s.charAt(pos) == 'L') y--;
//                else if (s.charAt(pos) == 'R') y++;
//                else if (s.charAt(pos) == 'U') x--;
//                else if (s.charAt(pos) == 'D') x++;
//                pos++;
//            }
//            result[i] = pos;
//        }
//        return result;
//    }
//
//    









//    public static int[] executeInstructions(int n, int[] startPos, String s) {
//        int[] output = new int[s.length()];
//
//        for (int i = 0; i < output.length; i++) {
//            char c;
//            int count = 0;
//            int x = startPos[0];
//            int y = startPos[1];
//            while (x >= 0 && x < n && y >= 0 && y < n && count < output.length && (c = s.charAt(count)) != '*') {
//                if (c == 'L') y--;
//                else if (c == 'R') y++;
//                else if (c == 'U') x--;
//                else if (c == 'D') x++;
//                count++;
//            }
//
//            output[i] = count;
//        }
//        return output;
    }
}