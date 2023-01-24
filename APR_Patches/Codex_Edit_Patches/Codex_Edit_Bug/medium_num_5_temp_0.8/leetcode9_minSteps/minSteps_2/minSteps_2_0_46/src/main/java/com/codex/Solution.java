package com.codex;

import java.util.*;

public class Solution {
    public static int numJewelsInStones(String J, String S) {
        
        int[] count = new int[128];
        char[] JArray = J.toCharArray();
        char[] SArray = S.toCharArray();
        for (int i = 0; i < JArray.length; i++) {
            count[JArray[i]]++;
        }
        
        int countJewels = 0;
        for (int i = 0; i < SArray.length; i++) {
            if (count[SArray[i]] > 0) {
                countJewels++;
            }
        }
        return countJewels;

    }

    
}