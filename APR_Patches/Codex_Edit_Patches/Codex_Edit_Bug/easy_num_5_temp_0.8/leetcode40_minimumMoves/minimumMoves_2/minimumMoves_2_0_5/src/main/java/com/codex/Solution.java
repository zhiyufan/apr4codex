package com.codex;

import java.util.*;

public class Solution {
// Given a string s consisting of small English letters, find and return the first instance of a non-repeating character in it. If there is no such character, return '_'.

// Example

// For s = "abacabad", the output should be
// firstNotRepeatingCharacter(s) = 'c'.

// There are 2 non-repeating characters in the string: 'c' and 'd'. Return c since it appears in the string first.

// For s = "abacabaabacaba", the output should be
// firstNotRepeatingCharacter(s) = '_'.

// There are no characters in this string that do not repeat.

public class FirstNotRepeatingCharacter {

    public static void main(String[] args) {
        char letter = firstNotRepeatingCharacter("abacabad");
        System.out.println(letter);
    }

    // public static char firstNotRepeatingCharacter(String s) {
    //     char[] arr = s.toCharArray();
    //     HashMap<Character,Integer> map = new HashMap<>();
    //     for(char c : arr) {
    //         if(map.containsKey(c))
    //         	map.put(c,map.get(c)+1);
    //         else
    //             map.put(c,1);
    //     }

    //     for(char c : arr) {
    //         if(map.get(c) == 1)
    //             return c;
    //     }
    //     return '_';
    // }


    public static char firstNotRepeatingCharacter(String s) {
        char[] arr = s.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : arr) {
            if(map.containsKey(c))
            	map.put(c,map.get(c)+1);
            else
                map.put(c,1);
        }

        for(char c : arr) {
            if(map.get(c) == 1)
                return c;
        }
        return '_';
    }
}


// You are given a string consisting of exactly 2 words separated by a space. Each word consists of lowercase and uppercase Latin letters. Your task is to swap the case of each letter in the first word and then concatenate the two modified words together.
// Example

// For s = "Hello world", the output should be
// swapCase(s) = "hELLO WORLD";
// For s = "Codefights Is Awesome", the output should be
// swapCase(s) = "cODEFIGHTS iS aWESOME".

public class SwapCase {

    public static void main(String[] args) {
        String sentence = swapCase("Hello World");
        System.out.println(sentence);
    }

    public static String swapCase(String s) {
        String[] words = s.split(" ");
        StringBuilder wordOne = new StringBuilder();
        StringBuilder wordTwo = new StringBuilder();

        for(char c : words[0].toCharArray()) {
            if(Character.isLowerCase(c))
                wordOne.append(Character.toUpperCase(c));
            else if(Character.isUpperCase(c))
                wordOne.append(Character.toLowerCase(c));
            else
                wordOne.append(c);
        }

        for(char c : words[1].toCharArray()) {
            if(Character.isLowerCase(c))
                wordTwo.append(Character.toUpperCase(c));
            else if(Character.isUpperCase(c))
                wordTwo.append(Character.toLowerCase(c));
            else
                wordTwo.append(c);
        }

        return wordOne.toString() + " " + wordTwo.toString();
    }

}


// A word is special
// if all of the following conditions are satisfied:

// It consists of exactly 4 characters.
// The first two characters are the same.
// The last two characters are the same.
// For example, "aaaa", "abab", "aabb" and "aacc" are special words, while "abca" is not special, despite the fact that all but one characters are the same.

// A string is special if all of its words are special.

// Given a string, find out if it's special.

// Example

// For inputString = "This is a special string.", the output should be
// specialString(inputString) = true;

public class SpecialString {

    public static void main(String[] args) {
        boolean isSpecial = specialString("This is a special string.");
        System.out.println(isSpecial);
    }

    public static boolean specialString(String inputString) {
        String[] words = inputString.split(" ");
        for(String word : words) {
            if(!isSpecial(word)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSpecial(String word) {
        if(word.length() != 4)
            return false;
        if(word.substring(0,2).equals(word.substring(2,4)))
            return true;

        return false;
    }
}



// NOTE: You will be given one or more strings, one for each test case. Each string will consist of only lower case letters and spaces.

// You need to count the number of words in the given string and print it.

// Example:

// a string is given as "this is a test string", the output should be
// countWord("this is a test string") = 4;

public class CountWord {

    public static void main(String[] args) {
        int count = countWord("We test coders. Give us a try?");
        System.out.println(count);
    }

    public static int countWord(String words) {
        return words.split(" ").length;
    }
}



// You are given a string of length n consisting of the following symbols: '>', '<', and '-'. Your task is to process this string and determine how many symbols must be deleted to get a string consisting of the same symbols, but in correct order.

// Note that you will be given a minimum of 1 and a maximum of 100 test cases, each having a string of length between 1 and 5000.

    public static int minimumMoves(String s) {
        
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i + 1) == s.charAt(i + 2) && s.charAt(i) == 'X') {
                count++;
                i += 2;
            }
        }
        return count;
    }
}
}