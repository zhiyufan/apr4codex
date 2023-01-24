package com.codex;

import java.util.*;

public class Solution {
import java.util.Scanner;

public class Vowl {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        System.out.println(countVowelSubstrings(word));
    }

    public static int countVowelSubstrings(String word) {

        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j <= word.length(); j++) {
                String sub = word.substring(i, j);
                if (sub.contains("a") && sub.contains("e") && sub.contains("i") && sub.contains("o") && sub.contains("u")) {
                    count++;
                }
            }
        }
        return count;
    }

}
}