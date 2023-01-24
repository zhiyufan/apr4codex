package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        int[] letter = new int[26];
        
        for (int i=0; i < magazine.length(); i++)
        {
            letter[magazine.charAt(i) - 'a']++; // Add count of letter
        }
        
        for (int i=0; i < ransomNote.length(); i++)
        {
            if(--letter[ransomNote.charAt(i) - 'a'] < 0) // Subtract count of letter
            {
                return false;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i] + 1)) {
                count += 1;
            }
        }
        return count;
    }

    
}