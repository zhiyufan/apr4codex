package com.codex;

import java.util.*;

public class Solution {
    public static List<String> findRepeatedDnaSequences(String s) {
        
        HashSet<String> uniques  = new HashSet<>();
        HashSet<String> dupes = new HashSet<>();
        
        for (int i = 0; i + 10 <= s.length(); i++) {
            
            String sequence = s.substring(i, i + 10);
            if(!uniques.add(sequence))
                dupes.add(sequence);
        }

        return new ArrayList<>(dupes);
    }

    
}