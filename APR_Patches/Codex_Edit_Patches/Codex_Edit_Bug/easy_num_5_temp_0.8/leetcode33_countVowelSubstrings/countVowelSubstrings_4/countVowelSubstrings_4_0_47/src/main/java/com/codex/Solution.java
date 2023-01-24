package com.codex;

import java.util.*;

public class Solution {
import java.util.Scanner;

/**
 *
 * @author Deva
 */
public class vowel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        vowel v = new vowel();
        String word;
        
        word = v.getInput();
        System.out.println(v.countVowelSubstrings(word));
    }
    
    public String getInput() {
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }
    
    public static int countVowelSubstrings(String word) {
        
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                String sub = word.substring(i, j + 1);
                if (sub.contains("a") && sub.contains("e") && sub.contains("i") && sub.contains("o") && sub.contains("u")) {
                    count++;
                }
            }
        }
        return count;
    }

    
}

    
}