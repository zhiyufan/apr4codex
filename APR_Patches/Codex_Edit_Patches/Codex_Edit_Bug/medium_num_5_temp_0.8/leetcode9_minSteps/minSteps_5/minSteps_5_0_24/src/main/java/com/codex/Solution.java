package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        int[] hash = new int[26];
        for(int i = 0; i < magazine.length(); i++) {
            hash[magazine.charAt(i) - 'a']++;
        }
        for(int i = 0; i < ransomNote.length(); i++) {
            int idx = ransomNote.charAt(i) - 'a';
            if(hash[idx] == 0) {
                return false;
            }
            hash[idx]--;
        }
        return true;
    }

}
}