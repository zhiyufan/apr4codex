package com.codex;

import java.util.*;

public class Solution {
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class CountVowel {
    public static void main(String args[]) {
        
        String word = "a";

        System.out.println(countVowelSubstrings(word));

        for (int i = 0; i < word.length(); i++) {
            if (vowels.contains(word.charAt(i))) {
                count += word.length() - i;
            }
        }

        return count;
    }

    
}