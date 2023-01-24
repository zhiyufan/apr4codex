package com.codex;

import java.util.*;

public class Solution {
    public static int getLucky(String s, int k) {
        

        int result = 0;
        for (int i = 0; i < s.length(); i++)
            result += Character.isLetter(s.charAt(i)) ? s.charAt(i) - 'a' + 1 : 0;
        
        for (int i = 0; i < k; i++) {
            int temp = 0;
            while (result > 0) {
                temp += result % 10;
                result /= 10;
            }
            result = temp;
        }
        return result;
    }

    
}