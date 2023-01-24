package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public static int minTimeToType(String word) {
        if (word == null || word.length() == 0) {
            return 0;
        }
        String alphabet = "qwertyuiopasdfghjklzxcvbnm";
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < alphabet.length(); i++) {
            hm.put(alphabet.charAt(i), i);
        }
        int res = hm.get(word.charAt(0));
        for (int i = 0; i < word.length() - 1; i++) {
            res += Math.min(Math.abs(hm.get(word.charAt(i + 1)) - hm.get(word.charAt(i))),
                            26 - Math.abs(hm.get(word.charAt(i + 1)) - hm.get(word.charAt(i))));
        }
        return res;
    }

}

    public static int minTimeToType(String word) {
        if (word == null || word.length() == 0) {
            return 0;
        }
        String alphabet = "qwertyuiopasdfghjklzxcvbnm";
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < alphabet.length(); i++) {
            hm.put(alphabet.charAt(i), i);
        }
        int res = hm.get(word.charAt(0));
        for (int i = 0; i < word.length() - 1; i++) {
            res += Math.min(Math.abs(hm.get(word.charAt(i + 1)) - hm.get(word.charAt(i))),
                            26 - Math.abs(hm.get(word.charAt(i + 1)) - hm.get(word.charAt(i))));
        }
        return res;
    }

}

    
}