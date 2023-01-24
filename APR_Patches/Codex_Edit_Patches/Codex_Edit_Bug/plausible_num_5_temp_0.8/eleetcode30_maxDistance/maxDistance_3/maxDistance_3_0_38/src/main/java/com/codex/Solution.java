package com.codex;

import java.util.*;

public class Solution {
//Given two strings s and t , write a function to determine if t is an anagram of s.

public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
      
        int[] alpha = new int[26];
        for(int i=0;i<s.length();i++) {
            alpha[s.charAt(i)-'a']++;
            alpha[t.charAt(i)-'a']--;
        }
      
        for(int i=0;i<alpha.length; i++) {
            if(alpha[i]!=0)
                return false;
        }
        return true;
    }

}
}