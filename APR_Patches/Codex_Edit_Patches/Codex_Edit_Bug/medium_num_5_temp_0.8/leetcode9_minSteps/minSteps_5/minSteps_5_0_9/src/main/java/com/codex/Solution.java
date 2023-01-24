package com.codex;

import java.util.*;

public class Solution {
public class LongestRepeatingCharacter {
    public static char findLongestCharacter(String str){
        if (str == null || str.length() == 0) {
            return ' ';
        }
        char[] letters = str.toCharArray();
        
        Arrays.sort(letters);

        int max = 1;
        int count = 1;
        char maxChar = letters[0];
        for (int i = 1; i < letters.length; i++) {
            if (letters[i] == letters[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count > max) {
                max = count;
                maxChar = letters[i];
            }
        }
        return maxChar;
    }


    public static void main(String[] args) {
        System.out.println(findLongestCharacter("aaabbbcc"));
    }
}
}