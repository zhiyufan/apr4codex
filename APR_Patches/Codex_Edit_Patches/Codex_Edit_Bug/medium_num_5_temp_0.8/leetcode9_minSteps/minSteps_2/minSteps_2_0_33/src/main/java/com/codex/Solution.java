package com.codex;

import java.util.*;

public class Solution {
    public static int minSteps(String s, String t) {
        
        int[] sArray = new int[26];
        int[] tArray = new int[26];
        for (int i = 0; i < s.length(); i++) {
            sArray[s.charAt(i) - 'a']++;
            tArray[t.charAt(i) - 'a']++;
        }
        int result = 0;
        for (int i = 0; i < 26; i++) {
            result += Math.abs(sArray[i] - tArray[i]);
        }
        return result / 2;
    }



    

	public String removeDuplicateLetters(String s) {
        StringBuilder result = new StringBuilder();
        
        int[] counter = new int[26];
        boolean[] visited = new boolean[26];
        
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < s.length(); i++) {
            
            int index = s.charAt(i) - 'a';
            
            
            counter[index]--;
            
            if (visited[index]) {
                continue;
            }
            
            while (result.length() > 0 && result.charAt(result.length() - 1) > s.charAt(i) && counter[result.charAt(result.length() - 1) - 'a'] > 0) {
                visited[result.charAt(result.length() - 1) - 'a'] = false;
                result.deleteCharAt(result.length() - 1);
            }
            
            result.append(s.charAt(i));
            
            visited[index] = true;
        }
        
        return result.toString();
    }
    
}