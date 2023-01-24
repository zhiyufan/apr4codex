package com.codex;

import java.util.*;

public class Solution {
    public static int minTimeToType(String word) {
        

//        
        List<Character> letters = new ArrayList<>(Arrays.asList('q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m'));
        int counter = 0;
        for (int j = 1; j < word.length(); j++){
            char current = word.charAt(j-1);
            char next = word.charAt(j);
            int distance = letters.indexOf(next)-letters.indexOf(current);
            if(distance < 0){
                counter += Math.abs(distance)+2;
            }else{
                counter += distance + 2;
            }
        }

//     public static int minTimeToType(String word) {
        

//         List<Character> letters = new ArrayList<>(Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'));
//         int counter = 0;
//         for (int i = 0; i < word.length(); i++){
//             char letter = word.charAt(i);
//             int index = letters.indexOf(letter);
//             int distance = index - letters.indexOf('a');
//             if (distance < 0){
//                 distance += 26;
//             }
//             if (distance > 13) {
//                 counter += Math.min(26 - distance, distance);
//             }else{
//                 counter += distance;
//             }
//         }
//         return counter;
//     }
        return counter;
    }
}