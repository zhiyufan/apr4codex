package com.codex;

import java.util.*;

public class Solution {
    public static String[] getPairs(String[] arr) {
        
        
        HashSet<String> table = new HashSet<>();
        List<String> ret = new ArrayList<>();
        for (String s : arr) {
            if (!table.contains(s)) table.add(s);
            else ret.add(s);
        }
        return ret;
    }

    
}