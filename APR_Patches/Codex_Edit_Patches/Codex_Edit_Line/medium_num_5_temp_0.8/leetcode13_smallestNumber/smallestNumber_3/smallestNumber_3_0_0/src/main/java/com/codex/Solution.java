package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long num) {

        //Convert long to string
        String s = String.valueOf(num);

        //Convert string to char array
        char[] arr = s.toCharArray();
        
        Arrays.sort(arr);

        //Convert back to string
        s = new String(arr);

        //Convert back to long
        long answer = 0;
        for (int i = 0; i < s.length(); i++) {
            answer += Long.parseLong(String.valueOf(s.charAt(i))) * Math.pow(10, i);
        }

        return answer;
    }
}