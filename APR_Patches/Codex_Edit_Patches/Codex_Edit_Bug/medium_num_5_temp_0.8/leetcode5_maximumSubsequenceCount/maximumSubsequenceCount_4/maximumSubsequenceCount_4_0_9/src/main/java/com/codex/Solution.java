package com.codex;

import java.util.*;

public class Solution {
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter File Name");
            String filename = in.nextLine();
            File file = new File(filename);
            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter writer = new PrintWriter(filename);

            String text = "abcedfgijklmnopqrstuvwxyz";//"aaaaaaa";
            String pattern = "abcdef";//"a";
            writer.println("Text : " + text);
            writer.println("Pattern : " + pattern);
            long res = maximumSubsequenceCount(text, pattern);
            writer.println("Result is : " + res); 
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
    }
        }

    public static long maximumSubsequenceCount(String text, String pattern) {

        int res = 0;
        int[] a = new int[26];
        int[] b = new int[26];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            b[ch - 'a']++;
        }
        for (int i = 0; i < pattern.length(); i++) {
            b[pattern.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            res += Math.min(a[i], b[i]);
        }
        return res;
    }

    
}