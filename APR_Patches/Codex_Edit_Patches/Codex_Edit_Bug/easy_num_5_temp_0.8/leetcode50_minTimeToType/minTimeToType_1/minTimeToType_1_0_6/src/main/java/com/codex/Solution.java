package com.codex;

import java.util.*;

public class Solution {
public static int minTimeToType(String word) {
        // Write your code here.
        if(word.length() == 0){
            return 0;
        }
        int res = 0; // res keeps track of how many rotations our fingers do
        for (int i = 1; i < word.length(); i++){
            // checking if current char is the same pos as the previous character
            if (word.charAt(i) == word.charAt(i-1)){
                // If the character is in the same position we simply add 1
                res += 1;
            } else { // moving to a different character
                // To rotate n characters to the right, it will take n rotations.
                res += Math.min(Math.abs(word.charAt(i) - word.charAt(i-1)), 26 - Math.abs(word.charAt(i) - word.charAt(i-1)));
}
            }
        }
        return res;
    }
}