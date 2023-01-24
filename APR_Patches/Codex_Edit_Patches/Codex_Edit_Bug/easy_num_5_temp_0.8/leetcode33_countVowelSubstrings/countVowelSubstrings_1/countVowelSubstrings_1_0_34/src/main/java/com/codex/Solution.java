package com.codex;

import java.util.*;

public class Solution {
 public static int countVowelSubstrings(String word) {
        
        int a = 0,e = 0,i = 0,o = 0,u = 0;
        int count = 0,temp = 0;
        for(int j = 0;j < word.length();j++)
        {
            if(word.charAt(j) == 'a' && a == 0)
                a = 1;
            else if(word.charAt(j) == 'e' && e == 0)
                e = 1;
            else if(word.charAt(j) == 'i' && i == 0)
                i = 1;
            else if(word.charAt(j) == 'o' && o == 0)
                o = 1;
            else if(word.charAt(j) == 'u' && u == 0)
                u = 1;
            if(a == 1 && e == 1 && i == 1 && o == 1 && u == 1)
            {
                count += (j + 1) - temp;
                temp = j + 1;
                a = 0;
                e = 0;
                i = 0;
                o = 0;
                u = 0;
            }
        }
        return count;
    }
}