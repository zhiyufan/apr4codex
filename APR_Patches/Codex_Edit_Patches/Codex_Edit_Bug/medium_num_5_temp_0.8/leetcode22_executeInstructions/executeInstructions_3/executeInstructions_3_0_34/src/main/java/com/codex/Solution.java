package com.codex;

import java.util.*;

public class Solution {
    public static int[] executeInstructions(int n, int[] startPos, String s) { 
        
        int[] answer = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int row = startPos[0];
            int col = startPos[1];
            int count = 0;

            char[] directions = s.substring(i).toCharArray();
            for (int j = 0; j < directions.length; j++) {
                switch (directions[j]) {
                    case 'L': {
                        //if (col > 0) {
                            if(col != 0)
                                col--;
                            else
                                col = n-1;
                            if(row != 0) 
                                row--;
                            else
                                row = n-1;
                            count +=2;
                       // }
                        break;
                    }
                    case 'R': {
                       // if (col < n - 1) {
                        	 if(col != n-1) 
                         		 col++;
                        	 else
                        		 col = 0;
                        	 if(row != n-1) 
                        		 row++;
                        	 else
                        		 row = 0;
                         	count +=2;
                       // }
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