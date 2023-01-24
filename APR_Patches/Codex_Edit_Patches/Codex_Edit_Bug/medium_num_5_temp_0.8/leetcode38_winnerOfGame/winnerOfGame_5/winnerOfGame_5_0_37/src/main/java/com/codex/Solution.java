package com.codex;

import java.util.*;

public class Solution {
public static int winnerOfGame(String str) {
        
        char[] arr = str.toCharArray();
        int countA = 0, countB = 0;
        
        for(char c : arr){
            if(c == 'A')
                countA++;
            else if (c == 'B')
                countB++;
        }
        
        if(countA>countB)
            return 1;
        else if (countB>countA)
            return 2;
        else {
            return 0;
        }
        
    }
    
}