package com.codex;

import java.util.*;

public class Solution {
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();
        int result = countValidWords(sentence);
        System.out.print(result);
        System.out.println("");
    }

    public static int countValidWords(String sentence) {
        String[] tokens = sentence.split(" ");
        int count = 0;
        for (String token : tokens) {
            if (isValid(token)) {
                count++;
            }
        }
        return count;
    }
    
    private static boolean isValid(String token) {
        int hasPunctuation = 0;
        int hasHyphen = 0;
        if (token.length() > 1) {
            for (int i = 0; i < token.length(); i++) {
                if (!Character.isAlphabetic(token.charAt(i))) {
                    if (token.charAt(i) == '-') {
                        hasHyphen = 1;
                    } else if (token.charAt(i) != '\'') {
                        hasPunctuation = 1;
                    }
                }
            }
            if (hasHyphen + hasPunctuation <= 1) {
                return true;
            }
        } else if (token.length() == 1) {
            if (Character.isAlphabetic(token.charAt(0))) {
                return true;
            }
        }
        return false;
    }
}
    
    
}