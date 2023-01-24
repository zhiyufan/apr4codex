package com.codex;

import java.util.*;

public class Solution {
import java.util.*;
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> mem = new HashSet<>();
        Set<String> res = new HashSet<>();
        if (s.length() <= 10) return new ArrayList<>(res);
        for (int i = 0; i + 10 <= s.length(); i++) {
            if (mem.contains(s.substring(i, i + 10))) {
                res.add(s.substring(i, i + 10));
            } else {
                mem.add(s.substring(i, i + 10));
            }
            
        }
        return new ArrayList<>(res);
    }  
}
}