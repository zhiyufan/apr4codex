package com.codex;

import java.util.*;

public class Solution {
    public static String makeFancyString(String s) {
        

        StringBuilder sb = new StringBuilder(s);

        for (int i = 2; i < sb.length(); i++) {
            if (sb.charAt(i) == sb.charAt(i - 1) && sb.charAt(i) == sb.charAt(i - 2)) {
                sb.deleteCharAt(i);


import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userInput;
        System.out.println("Enter a sentence or phrase:");
        userInput = scnr.nextLine();

        System.out.println("You entered: " + userInput);
        System.out.println(""); // Blank line for readability

        System.out.println("# of non-whitespace characters: "
                + nonWhitespace(userInput));
        System.out.println("First word in single quotes: '"
                + firstWord("single", userInput) + "'");
        System.out.println("Index of second word: "
                + secondWord("sentence", userInput));
        System.out.println("Third word in quotes: \"" + thirdWord(userInput) + "\"");
        System.out.println("Your sentence backwards: " + backwards(userInput));
        System.out.println(""); // Blank line for readability
        System.out.print("Your sentence with two spaces between each word: ");
        twoSpaces(userInput);
        System.out.println(""); // Blank line for readability
        System.out.println("Your sentence with the third word removed: " + noThirdWord(userInput));
        System.out.println("Your sentence with the first word removed: " + noFirstWord(userInput));
        System.out.println(""); // Blank line for readability
        System.out.println("Every second character of your sentence: " + secondChar(userInput));
        System.out.println(""); // Blank line for readability
    }

    public static int nonWhitespace(String userInput) {
        int i = 0;
        int whitespace = 0;
        while (i < userInput.length()) {
            if (userInput.charAt(i) == ' ') { // Checks for whitespace
                whitespace++;
            }
            i++;
        }
        return userInput.length() - whitespace;
    }

    public static String firstWord(String first, String userInput) {
        int i = 0;

        while (i < userInput.length()) {
            if (userInput.charAt(i) == ' ') {
                i++;
                return userInput.substring(0, i);
            }
            i++;
        }
        return userInput;
    }

    public static int secondWord(String second, String userInput) {
        if (userInput.contains(" ")) { // Checks if there's whitespace
            return userInput.indexOf(" ");
        } else {
            return -1;
        }
    }

    public static String thirdWord(String userInput) {
        int i = 0;
        int j = 0;
        String thirdWord = "";
        String firstWord = "";
        String secondWord = "";

        while (i < userInput.length()) {
            if (userInput.charAt(i) == ' ') { // Gets first word
                firstWord = userInput.substring(0, i);
                j = i + 1;
                while (j < userInput.length()) {
                    if (userInput.charAt(j) == ' ') { // Gets second word
                        secondWord = userInput.substring(i + 1, j);
                        thirdWord = userInput.substring(j + 1); // Gets third word
                        break;
                    }
                    j++;
                }
                break;
            }
            i++;
        }
        if (!thirdWord.contains(" ")) { // Checks if there is a third word
            return thirdWord; // Returns third word if there is one
        } else {
            return ""; // Returns nothing if there is no third word
        }
    }

    public static String backwards(String userInput) {
        StringBuilder sb = new StringBuilder(userInput);
        return sb.reverse().toString();
    }

    public static void twoSpaces(String userInput) {
        int i = 0;
        while (i < userInput.length()) {
            if (userInput.charAt(i) == ' ') { // Checks for whitespace
                System.out.print(userInput.charAt(i)); // Prints first space
                System.out.print(userInput.charAt(i)); // Prints second space
            } else {
                System.out.print(userInput.charAt(i)); // Prints character
            }
            i++;
        }
    }

    public static String noThirdWord(String userInput) {
        int i = 0;
        int j = 0;
        String thirdWord = "";
        String firstWord = "";
        String secondWord = "";

        while (i < userInput.length()) {
            if (userInput.charAt(i) == ' ') { // Gets first word
                firstWord = userInput.substring(0, i + 1);
                j = i + 1;
                while (j < userInput.length()) {
                    if (userInput.charAt(j) == ' ') { // Gets second word
                        secondWord = userInput.substring(i + 1, j + 1);
                        thirdWord = userInput.substring(j + 1); // Gets third word
                        break;
                    }
                    j++;
                }
                break;
            }
            i++;
        }
        if (!thirdWord.contains(" ")) { // Checks if there is a third word
            return firstWord + secondWord; // Returns sentence with third word removed
        } else {
            return userInput; // Returns sentence if there is no third word
        }
    }

    public static String noFirstWord(String userInput) {
        int i = 0;

        while (i < userInput.length()) {
            if (userInput.charAt(i) == ' ') { // Checks for whitespace
                i++;
                return userInput.substring(i); // Returns sentence with first word removed
            }
            i++;
        }
        return userInput;
    }

    public static String secondChar(String userInput) {
        StringBuilder sb = new StringBuilder(userInput);
        int i = 0;

        while (i < userInput.length()) {
            if (i % 2 == 0) { // Checks if i is an even number
                sb.deleteCharAt(i); // Deletes the character at that index
            }
            i++;
        }
        return sb.toString(); // Returns remaining characters
    }

}


                i -= 2;
            }
        }

        return sb.toString();
    }

    
}