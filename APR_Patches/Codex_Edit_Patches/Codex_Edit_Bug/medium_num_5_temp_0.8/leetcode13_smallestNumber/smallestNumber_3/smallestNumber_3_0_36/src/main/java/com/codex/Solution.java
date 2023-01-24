package com.codex;

import java.util.*;

public class Solution {

    private static int nextSmallest(int num) {
        String numStr = Integer.toString(num);
        int length = numStr.length();
        char[] numC = numStr.toCharArray();

        int i;
        for(i = length - 1; i > 0; i--) {
            if(numC[i] < numC[i - 1]) {
                break;
            }
        }
        if (i == 0) {
            return -1;
        }
        return answer;
    }

    
}