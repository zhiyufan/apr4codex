package com.codex;

import java.util.*;

public class Solution {
import java.util.Scanner;

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


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Input: ");
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();

        System.out.println("Output: " + countVowelSubstrings(a));
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


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Input: ");
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();

        System.out.println("Output: " + countVowelSubstrings(a));
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