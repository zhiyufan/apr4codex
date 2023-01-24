package com.codex;

import java.util.*;

public class Solution {
    public static int minTimeToType(String[] words) {
        

        int time = 0;
        
        for(int i = 1; i < words.length; i++){
            int prev = words[i-1].length();
            for(int j = 0; j < words[i].length(); j++){
                if(j < prev && words[i].charAt(j) != words[i-1].charAt(j)){
                    time += Math.min(Math.abs(words[i].charAt(j) - words[i-1].charAt(j)), 26 - Math.abs(words[i].charAt(j) - words[i-1].charAt(j)));                    
                }else{
                    time += words[i].charAt(j) - 'a' + 1;
                }
            }
        }
    }


    public static int minTimeToType(String[] words) {
        
        int time = 0;
        
        for(int i = 0; i < words.length;i++){
            if(i != 0) time += similar(words[i], words[i-1]);
            else time += words[i].charAt(0) - 'a' + 1;
        }
        
        return time;
    }

    private static int similar(String str1, String str2) {

        int min = Math.min(str1.length(), str2.length());
        int count = 0;
        for (int i = 0; i < min; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                count = Math.min(Math.abs(str1.charAt(i) - str2.charAt(i)), 26 - Math.abs(str1.charAt(i) - str2.charAt(i))) + 1;
                break;
            }
        }
        return count;
    }

    
}