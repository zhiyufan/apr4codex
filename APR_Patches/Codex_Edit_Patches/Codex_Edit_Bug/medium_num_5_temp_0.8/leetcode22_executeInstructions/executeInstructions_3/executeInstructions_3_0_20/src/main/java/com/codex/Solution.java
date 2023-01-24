package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;

class Solution {
    public static int[] executeInstructions(int n, int[] startPos, String s) {

        int[] answer = new int[s.length() + 1];
        int[] position = startPos;
        
        for (int i = 0; i < s.length(); i++) {
            position = executeInstruction(n, position, s.charAt(i));
            answer[i + 1] = answer[i] + position[0];
        }
        return answer;
    }

    public static int[] executeInstruction(int n, int[] startPos, char c) {
        int[] answer = new int[1];
        int row = startPos[0];
        int col = startPos[1];
        switch (c) {
            case 'L': {
                if (col > 0) {
                    col--;
                    answer[0] = 1;
                } else {
                    answer[0] = 0;
                }
            }
            answer[i] = count;
        }
        return answer;
    }

    
}