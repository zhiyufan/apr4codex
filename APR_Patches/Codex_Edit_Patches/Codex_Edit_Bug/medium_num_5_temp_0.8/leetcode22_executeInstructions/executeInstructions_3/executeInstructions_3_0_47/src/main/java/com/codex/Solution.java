package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        int n = 4;
        int[] startPos = new int[]{3, 0};
        String s = "DDU";
        int[] result = executeInstructions(n, startPos, s);
        System.out.println(Arrays.toString(result));
    }

    public static int[] executeInstructions(int n, int[] startPos, String instructions) {
        
        int[] answer = new int[instructions.length()];
        for (int i = 0; i < instructions.length(); i++) {
            int row = startPos[0];
            int col = startPos[1];
            int count = 1;
            char[] directions = instructions.substring(i).toCharArray();
            for (int j = 0; j < directions.length; j++) {
                switch (directions[j]) {
                    case 'L': {
                        if (col > 0) {
                            col--;
                            count++;
                        }
                        break;
                    }
                    case 'R': {
                        if (col < n - 1) {
                            col++;
                            count++;
                        }
                        break;
                    }
                    case 'U': {
                        if (row > 0) {
                            row--;
                            count++;
                        }
                        break;
                    }
                    case 'D': {
                        if (row < n - 1) {
                            row++;
                            count++;
                        }
                        break;
                    }
                }
            }
            answer[i] = count;
        }
        return answer;
    }

}
}