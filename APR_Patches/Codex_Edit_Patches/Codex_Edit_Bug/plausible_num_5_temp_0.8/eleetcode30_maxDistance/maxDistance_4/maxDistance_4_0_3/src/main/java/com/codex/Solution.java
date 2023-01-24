package com.codex;

import java.util.*;

public class Solution {
    private ArrayList<String> readWords(String filename) {
        ArrayList<String> words = new ArrayList<String>();
        try {
            Scanner sc = new Scanner(new File(filename));
            while (sc.hasNext()) {
                words.add(sc.next());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
        return words;
    }
}