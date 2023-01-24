package com.codex;

import java.util.*;

public class Solution {
    public static int countVowelSubstrings(String word) {
        
        List<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (vowels.contains(word.charAt(i))) {
                count += word.length() - i;
            }
        }

        return count;
    }

    

	
	
    public static String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int sum = 0;
        while (i >= 0 || j >= 0) {
            sum /= 2;
            if (i >= 0) {
                sum += Character.getNumericValue(a.charAt(i));
                i--;
            }
            if (j >= 0) {
                sum += Character.getNumericValue(b.charAt(j));
                j--;
            }
            res.insert(0, sum % 2);
        }
        if (sum == 1) {
            res.insert(0, sum);
        }
        return res.toString();
    }
    
}