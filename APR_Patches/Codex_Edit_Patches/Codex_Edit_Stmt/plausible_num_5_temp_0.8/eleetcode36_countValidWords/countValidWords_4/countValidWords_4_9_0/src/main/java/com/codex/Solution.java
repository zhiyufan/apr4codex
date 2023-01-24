package com.codex;

import java.util.*;

public class Solution {
package hello;


import java.util.HashSet;
import java.util.Set;

public class Hello {
    static final int N = 20000;

    public static void main(String[] args) {
	
	String[] res = CountValidWords("This is a sample text, showing off the functionality of this program!");
	for (int i = 0; i < res.length; i++){
		System.out.println(res[i]);
	}
    }

    public static int countValidWords(String sentence) {
        
        int count = 0;
        String[] tokens = sentence.split(" ");
        for (String token : tokens) {
            if (isValid(token)) count++;
        }
        return count;
    }

    private static boolean isValid(String token) {
        int hasPunctuation = 0;
        int hasHyphen = 0;
        if (token.length() > 1) {
            for (int i = 0; i < token.length() - 1; i++) {
                if (!Character.isAlphabetic(token.charAt(i))) {
                    if (token.charAt(i) == '-') {
                        if (!Character.isAlphabetic(token.charAt(i - 1)) || !Character.isAlphabetic(token.charAt(i + 1))) {
                            return false;
                        }
                        hasHyphen = 1;
                    } else if (token.charAt(i) != ',' && token.charAt(i) != '!') {
                        return false;
                    }
                }
            }
            if (Character.isAlphabetic(token.charAt(token.length() - 1))) {
                return true;
            } else if (token.charAt(token.length() - 1) == ',' || token.charAt(token.length() - 1) == '!') {
                hasPunctuation = 1;
            }
            if (hasHyphen + hasPunctuation <= 1) {
                return true;
            } else {
                return false;
            }
        } else if (token.length() == 1) {
            if (Character.isAlphabetic(token.charAt(0))) {
                return true;
            } else if (token.charAt(0) == '.' || token.charAt(0) == ',' || token.charAt(0) == '!') {
                return true;
            }
        }
        return false;
    }
    public static String[] CountValidWords(String sentence) {
        int n = countValidWords(sentence);
        int[] counts = new int[n];
        String[] words = new String[n];
        String[] tokens = sentence.split(" ");
        int k = 0;

        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i].toLowerCase();
            if (wordsContains(words, token, k)) {
                counts[find(words, token, k)]++;
            } else {
                words[k] = token;
                counts[k] = 1;
                k++;
            }
        }
        sort(words, counts, n);
        String[] res = new String[n];
        for (int i = 0; i < N; i++) {
            if (counts[i] == 0) break;
            res[i] = words[i] + "=" + counts[i];
        }
        return res;
    }
    
    private static boolean wordsContains(String[] words, String word, int k) {
        for (int i = 0; i < k; i++) {
            if (words[i].equals(word)) return true;
        }
        return false;
    }
    
    private static int find(String[] words, String word, int k) {
        for (int i = 0; i < k; i++) {
            if (words[i].equals(word)) return i;
        }
        return -1;
    }
    
    private static void sort(String[] arr, int[] counts, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                if (counts[j] > counts[j - 1]) {
                    String t = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = t;
    
                    int tmp = counts[j];
                    counts[j] = counts[j - 1];
                    counts[j - 1] = tmp;
                }
            }
        }
    }
    
    
}
    
}