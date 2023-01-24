package com.codex;

import java.util.*;

public class Solution {
    public static int RotateMinTime(String word){
        List<Character> letters = new ArrayList<>(Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','a'));
        int counter = 0;
        for (int i = 0; i < word.length(); i++){
            char letter = word.charAt(i);
            int index = letters.indexOf(letter);
            counter += Math.min(Math.abs(index + 1 - letters.indexOf('a')), Math.abs(index - 1 - letters.indexOf('a')));
            System.out.println(counter);
        }
    
        return counter;
    }
}