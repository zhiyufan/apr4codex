package com.codex;

import java.util.*;

public class Solution {
    public static int getLucky(String s, int k) {
        

        s = s.toLowerCase();
        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            number = number + s.charAt(i) - 96;
        }
       
        return number;
    }

    
}