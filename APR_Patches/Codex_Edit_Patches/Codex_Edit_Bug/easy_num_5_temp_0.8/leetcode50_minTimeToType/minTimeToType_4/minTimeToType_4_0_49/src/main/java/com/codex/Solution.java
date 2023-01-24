package com.codex;

import java.util.*;

public class Solution {
public class Main {

    public static void main(String []args) {
        String word = "abc";
        System.out.print(minTimeToType(word));
    }

    public static int minTimeToType(String word){
        

        List<char> letters = new ArrayList<>(Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'));
        int totalDistance = 0;
        for (int j= 0; j < word.size(); j++){
            char current = word.charAt(j);
            char next = word.charAt(j+1);
            int currentIndex = letters.indexOf(current);
            int nextIndex = letters.indexOf(next);
            int distance = Math.abs(currentIndex - nextIndex);
            if (distance > 13){
                distance = 26 - distance;
            }
            totalDistance += distance;
        }
        return totalDistance;
    }
}