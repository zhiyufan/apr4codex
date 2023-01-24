package com.codex;

import java.util.*;

public class Solution {
    public static long maximumSubsequenceCount(String text, String pattern) {
        
       return text.split(pattern).length - 1;

    }

    
}