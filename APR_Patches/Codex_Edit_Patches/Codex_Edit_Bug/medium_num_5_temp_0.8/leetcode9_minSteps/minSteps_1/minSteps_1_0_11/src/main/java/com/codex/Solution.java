package com.codex;

import java.util.*;

public class Solution {
    public static int numJewelsInStones(String J, String S) {
        
        return (J + S).replaceAll("[^" + J + "]", "").length();
        
    }

    
}