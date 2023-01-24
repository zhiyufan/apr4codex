package com.codex;

import java.util.*;

public class Solution {
package com.company;

public class Main {

    public static void main(String[] args) {
        

        System.out.println(minTimeToType(System.in.readLine()));
    }

    public static int minTimeToType(String word) {

        List<Character> letters = new ArrayList<>(Arrays.asList('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm'));
        int counter = 0;
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            int index = letters.indexOf(letter);
            int distance = index - letters.indexOf('a');
            if (distance < 0){
                distance += 26;
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