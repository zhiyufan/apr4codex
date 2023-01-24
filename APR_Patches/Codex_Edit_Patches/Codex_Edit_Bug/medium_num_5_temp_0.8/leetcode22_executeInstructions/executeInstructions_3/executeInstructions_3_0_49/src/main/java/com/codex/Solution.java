package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int[] result = new int[s.length()];

        int x = startPos[0];
        int y = startPos[1];

        for (int i = 0; i < s.length(); i++) {
            char instruction = s.charAt(i);
            switch (instruction) {
                case 'U':
                    if (x > 0) {
                        x--;
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