package com.codex;

import java.util.*;

public class Solution {
    public static int getLucky(String s, int k) {
        
        int temp = 0;

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            temp += (s.charAt(i) - 'a' + 1);
            temp = temp % 9;
        }        
        result = (temp * k) % 9;
        if (result == 0) {
       
            result = temp;
        }
        return result;
    }

    
}