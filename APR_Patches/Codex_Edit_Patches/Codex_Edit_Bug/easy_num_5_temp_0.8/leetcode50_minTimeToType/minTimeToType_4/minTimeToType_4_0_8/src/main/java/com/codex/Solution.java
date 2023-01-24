package com.codex;

import java.util.*;

public class Solution {
public static int minTimeToType(String word) {
        

        int[] map = new int[26];
        int i = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            map[c - 'a'] = i;
            i++;
        }
        int res = 0;
        i = 0;
        while (i < word.length()) {
            int idx = map[word.charAt(i) - 'a'];
            res = res + Math.min(idx, 26 - idx);
            i++;
        }
        return res;
    }


//  List<Character> letters = new ArrayList<>(Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'));
//        int counter = 0;
//        for (int i = 0; i < word.length(); i++){
//            char letter = word.charAt(i);
//            int index = letters.indexOf(letter);
//            int distance = index - letters.indexOf('a');
//            if (distance < 0){
//                distance += 26;
//            }
//            if (distance > 13) {
//                counter += Math.min(26 - distance, distance);
//            }else{
//                counter += distance;
//            }
//        }
//        return counter;

//    public static int minTimeToType(String word) {
//        List<Character> letters = new ArrayList<>(Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'));
//        int counter = 0;
//        for (int i = 0; i < word.length(); i++){
//            char letter = word.charAt(i);
//            int index = letters.indexOf(letter);
//            int distance = index - letters.indexOf('a');
//            if (distance < 0){
//                distance += 26;
//            }
//            if (distance > 13) {
//                counter += Math.min(26 - distance, distance);
//            }else{
//                counter += distance;
//            }
//        }
//        return counter;
//    }

    public class Solution {
    public int minTimeToType(String keyboard, String word) {
        int curIndex = 0;
        int res = 0;
        for(int i = 0 ; i < word.length() ; i++) {
            int index = keyboard.indexOf(word.charAt(i));
            res += Math.abs(index - curIndex);
            curIndex = index;
        }
        return res;
    }
}



public class Solution {
    public int minTimeToType(String keyboard, String word) {
        int curIndex = 0;
        int res = 0;
        for(int i = 0 ; i < word.length() ; i++) {
            int index = keyboard.indexOf(word.charAt(i));
            res += Math.abs(index - curIndex);
            curIndex = index;
        }
        return res;
    }
}


public static int minTimeToType(String word) {
        int[] map = new int[26];
        int i = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            map[c - 'a'] = i;
            i++;
        }
        int res = 0;
        i = 0;
        while (i < word.length()) {
            int idx = map[word.charAt(i) - 'a'];
            res = res + Math.min(idx, 26 - idx);
            i++;
        }
        return res;
    }




//    public static int minTimeToType(String word) {
//        int[] map = new int[26];
//        int i = 0;
//        for (char c = 'a'; c <= 'z'; c++) {
//            map[c - 'a'] = i;
//            i++;
//        }
//        int res = 0;
//        i = 0;
//        while (i < word.length()) {
//            int idx = map[word.charAt(i) - 'a'];
//            res = res + Math.min(idx, 26 - idx);
//            i++;
//        }
//        return res;
//    }


//    public static int minTimeToType(String word) {
//        int[] map = new int[26];
//        int i = 0;
//        for (char c = 'a'; c <= 'z'; c++) {
//            map[c - 'a'] = i;
//            i++;
//        }
//        int res = 0;
//        i = 0;
//        while (i < word.length()) {
//            int idx = map[word.charAt(i) - 'a'];
//            res = res + Math.min(idx, 26 - idx);
//            i++;
//        }
//        return res;
//    }



//    public static int minTimeToType(String word) {
//        int[] map = new int[26];
//        int i = 0;
//        for (char c = 'a'; c <= 'z'; c++) {
//            map[c - 'a'] = i;
//            i++;
//        }
//        int res = 0;
//        i = 0;
//        while (i < word.length()) {
//            int idx = map[word.charAt(i) - 'a'];
//            res = res + Math.min(idx, 26 - idx);
//            i++;
//        }
//        return res;
//    }

public static int minTimeToType(String word) {
        int[] map = new int[26];
        int i = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            map[c - 'a'] = i;
            i++;
        }
        int res = 0;
        i = 0;
        while (i < word.length()) {
            int idx = map[word.charAt(i) - 'a'];
            res = res + Math.min(idx, 26 - idx);
            i++;
        }
        return res;
    }


for (char c = 'a'; c <= 'z'; c++) {
            map[c - 'a'] = i;
            i++;
            }
            if (distance > 13) {
                counter += Math.min(26 - distance, distance);
            }else{
                counter += distance;
            }
        }
        return counter;
    }
}