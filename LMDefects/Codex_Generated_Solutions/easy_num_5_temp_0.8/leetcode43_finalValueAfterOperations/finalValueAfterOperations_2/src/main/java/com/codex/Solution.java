package com.codex;

import java.util.*;

public class Solution {
    public static int finalValueAfterOperations(String[] operations) {
        /** There is a programming language with only four operations and one variable X:
         * ++X and X++ increments the value of the variable X by 1.
         * --X and X-- decrements the value of the variable X by 1.
         * Initially, the value of X is 0.
         * Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.
         */
        int finalValue = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("++X") || operations[i].equals("X++")) {
                finalValue++;
            }
            if (operations[i].equals("--X") || operations[i].equals("X--")) {
                finalValue--;
            }
        }
        return finalValue;
    }
}}