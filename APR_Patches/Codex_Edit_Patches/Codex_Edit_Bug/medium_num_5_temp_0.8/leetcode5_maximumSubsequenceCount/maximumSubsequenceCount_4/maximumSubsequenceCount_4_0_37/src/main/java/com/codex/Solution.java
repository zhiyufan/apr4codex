package com.codex;

import java.util.*;

public class Solution {
import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try {
            FileInputStream fileInput = new FileInputStream(args[0]);
            FileOutputStream fileOutput = new FileOutputStream(args[1]);
            int x;
            while ((x = fileInput.read()) != -1) {
                x ^= 13;
                fileOutput.write(x);
            }
            fileInput.close();
            fileOutput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


/*public static long maximumSubsequenceCount(String text, String pattern) {
        
        long res = 0;
        long[] a = new long[26];
        long[] b = new long[26];
        for (int i = 0; i < 26; i++) {
            a[i] = 0;
            b[i] = 0;
        }

        for (int i = 0; i < text.length(); i++) {
            a[text.charAt(i) - 'a']++;
        }
        for (int i = 0; i < pattern.length(); i++) {
            b[pattern.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            res += Math.min(a[i], b[i]);
        }
        return res;
    }*/

    
}