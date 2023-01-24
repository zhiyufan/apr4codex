package com.codex;

import java.util.*;

public class Solution {
    public static int minTimeToWriteAllWords(String[] words, int maxCost) {
        

                if (words == null || words.length == 0) {
            return 0;
        }

        int len = words.length;

        Trie root = new Trie();
        for (String word : words) {
            root.insert(word);
        }

        return res;
    }

    
}