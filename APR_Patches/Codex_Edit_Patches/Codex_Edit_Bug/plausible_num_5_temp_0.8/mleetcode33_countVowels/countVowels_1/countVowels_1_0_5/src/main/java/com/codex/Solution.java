package com.codex;

import java.util.*;

public class Solution {

public static long countVowels(String word) {


        long count = 0;
        int len = word.length();

        for (int i = 0; i < len; i++) {
            if (isVowel(word.charAt(i))) {
                count += len - i + 1;
            }
        }
        return count;
    }

    
}