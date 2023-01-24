package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long num) {
    
        String number = String.valueOf(num);
        ArrayList<Long> list = new ArrayList<>();
        while (number.length() > 0) {
            String newString = number.charAt(0) + "";
            for (int i = 1; i < number.length(); i++) {
                if (number.charAt(i) == '0') {
                    newString += number.charAt(i) + "";
                }
            }
            number = number.replaceFirst(newString, "");
            list.add(Long.parseLong(newString));
        }
        
        Collections.sort(list);
        String newString = "";
        for (Long l : list) {
            newString += l;
        }
        long result = Long.parseLong(newString);
        return result;
    }

    
}