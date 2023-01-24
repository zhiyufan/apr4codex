package com.codex;

import java.util.*;

public class Solution {
import java.util.Scanner;

public class CountValidWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(countValidWords(sc.nextLine()));
    }

    public static int countValidWords(String sentence) {

        int count = 0;
        String p = "";
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isAlphabetic(sentence.charAt(i))) {
                p = p + sentence.charAt(i);
            } else if (sentence.charAt(i) == ',' || sentence.charAt(i) == '!') {
                p = p + sentence.charAt(i);
            } else if (sentence.charAt(i) == '-') {
                if (Character.isAlphabetic(sentence.charAt(i - 1)) && Character.isAlphabetic(sentence.charAt(i + 1))) {
                    p = p + sentence.charAt(i);
                } else {
                    String[] tokens = p.split(" ");
                    for (String token : tokens) {
                        if (isValid(token)) count++;
                    }
                    p = "";
                }
            } else if (Character.isSpaceChar(sentence.charAt(i))) {
                String[] tokens = p.split(" ");
                for (String token : tokens) {
                    if (isValid(token)) count++;
                }
                p = "";
            }
        }
        String[] tokens = p.split(" ");
        for (String token : tokens) {
            if (isValid(token)) count++;
        }
        p = "";
        return count;
    }

    private static boolean isValid(String token) {
        int hasHypen = 0;
        if (token.length() != 0) {
            for (int i = 0; i < token.length(); i++) {
                if (token.charAt(i) == ',') hasHypen++;
                else if (token.charAt(i) == '!') hasHypen++;
                else if (token.charAt(i) == '-') hasHypen++;
                else if (!Character.isAlphabetic(token.charAt(i))) return false;
            }
            if (hasHypen <= 1) {
                return true;
            }
        } else {
            return false;
        }
        return false;
    }

}
}