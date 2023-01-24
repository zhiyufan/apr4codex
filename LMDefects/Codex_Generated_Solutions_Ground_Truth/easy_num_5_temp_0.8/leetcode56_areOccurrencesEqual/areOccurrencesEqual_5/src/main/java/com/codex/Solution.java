package com.codex;

import java.util.*;

public class Solution {
    public static boolean areOccurrencesEqual(String s) {
        /** Given a string s, return true if s is a good string, or false otherwise.
         * A string s is good if all the characters that appear in s have the same number of occurrences (i.e., the same frequency).
         */

        Map<Character, Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++) {
            if(map.containsKey(s.charAt(i))) {
                int count = map.get(s.charAt(i));
                map.put(s.charAt(i),count+1);
            }
            else
                map.put(s.charAt(i),1);
        }
        int x = 0;
        boolean res = true;
        for(int i=0;i<s.length();i++) {
            if(i==0)
                x = map.get(s.charAt(i));
            else {
                if(x!=map.get(s.charAt(i))) {
                    res = false;
                    break;
                }
            }
        }
        return res;
    }

    }