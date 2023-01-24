package com.codex;

import java.util.*;

public class Solution {
    public static String makeFancyString(String s, int[] numbers) {
        char[] sAsChars = s.toCharArray();
        int numberIndex = 0;
        int stringIndex = 0;


        String result = "";
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i]; j++) {
                if (j <= 1) {
                    if (j == 1 && sAsChars[stringIndex + 0] == sAsChars[stringIndex + 1]) {
                        result += sAsChars[stringIndex + 0];
                        stringIndex++;
                    } else {
                        result += sAsChars[stringIndex];
                    }
                } else {
                    if (sAsChars[stringIndex] != sAsChars[stringIndex - 1] && sAsChars[stringIndex] != sAsChars[stringIndex - 2]) {
                        result += sAsChars[stringIndex];
                    }
                }
                stringIndex++;
            }
        }
        return result;
    }

    
}