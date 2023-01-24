package com.codex;

import java.util.*;

public class Solution {
//the fucntion of "tArray[t.charAt(i) - 'a']++;" is to find the different char between str1 and str2
//and add them up

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



//find the different char between str1 and str2
//then add them up

public static int minSteps(String s, String t) {

    int[] sArray = new int[26];
    int[] tArray = new int[26];
    for (int i = 0; i < s.length(); i++) {
        sArray[s.charAt(i) - 'a']++;
        tArray[t.charAt(i) - 'a']++;
    }
    int result = 0;
    for (int i = 0; i < 26; i++) {
        if (tArray[i] > sArray[i]) {
            result += tArray[i] - sArray[i];
        }
    }

    return result;
}
}