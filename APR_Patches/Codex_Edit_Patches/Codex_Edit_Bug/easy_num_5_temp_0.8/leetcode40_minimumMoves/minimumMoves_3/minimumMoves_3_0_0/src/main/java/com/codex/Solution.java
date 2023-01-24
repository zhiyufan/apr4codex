package com.codex;

import java.util.*;

public class Solution {
package com.company;

public class Main {

    public static int minimumMoves(String s) {

        int move = 0; // count the number of moves
        while (s.length() > 1) {
            if (s.charAt(0) == 'X' && s.charAt(1) == 'X' && s.charAt(2) == 'X') {
                s = s.replaceFirst("XXX", "OOO"); // remove first three X and replace them with three O.
                move++; // increment the number of moves
            } else if (s.charAt(0) == 'X' && s.charAt(1) == 'X' && s.charAt(2) == 'O') {
                s = s.replaceFirst("XXO", "XXO"); // remove first three X and replace them with three O.
                move++; // increment the number of moves
            } else if (s.charAt(0) == 'X' && s.charAt(1) == 'O' && s.charAt(2) == 'X') {
                s = s.replaceFirst("XOX", "XOX"); // remove first three X and replace them with three O.
                move++; // increment the number of moves
            } else if (s.charAt(0) == 'X' && s.charAt(1) == 'O' && s.charAt(2) == 'O') {
                s = s.replaceFirst("XO", "XO"); // remove first three X and replace them with three O.
                move++; // increment the number of moves
            } else if (s.charAt(0) == 'O' && s.charAt(1) == 'X' && s.charAt(2) == 'X') {
                s = s.replaceFirst("OXX", "OXX"); // remove first three X and replace them with three O.
                move++; // increment the number of moves
            } else if (s.charAt(0) == 'O' && s.charAt(1) == 'X' && s.charAt(2) == 'O') {
                s = s.replaceFirst("OXO", "OXO"); // remove first three X and replace them with three O.
                move++; // increment the number of moves
            } else if (s.charAt(0) == 'O' && s.charAt(1) == 'O' && s.charAt(2) == 'X') {
                s = s.replaceFirst("OOX", "OOX"); // remove first three X and replace them with three O.
                move++; // increment the number of moves
            } else {
                s = s.substring(1); // if the first three characters are not X, remove it.
            }
        }
        return move;
    }
}