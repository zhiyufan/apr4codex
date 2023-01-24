package com.codex;

import java.util.*;

public class Solution {
  public static int minimumMoves(String s) {

        int moves = 0;
        while (s.length() > 1) {

            if (s.charAt(0) == 'X' && s.charAt(1) == 'X' && s.charAt(2) == 'X') {
                s = s.replaceFirst("XXX", "OOO");
                moves++;
            } 
			else if (s.charAt(0) == 'X' && s.charAt(1) == 'X' && s.charAt(2) == 'O') {
                s = s.replaceFirst("XX", "X");
                moves++;
            } 
			else if (s.charAt(0) == 'X' && s.charAt(1) == 'O' && s.charAt(2) == 'X') {
                s = s.replaceFirst("X", "XO");
                moves++;
            } 
			else if (s.charAt(0) == 'X' && s.charAt(1) == 'O' && s.charAt(2) == 'O') {
                s = s.replaceFirst("X", "");
                moves++;
            } 
			else if (s.charAt(0) == 'O' && s.charAt(1) == 'X' && s.charAt(2) == 'X') {
                s = s.replaceFirst("OX", "OO");
                moves++;
            } 
			else if (s.charAt(0) == 'O' && s.charAt(1) == 'X' && s.charAt(2) == 'O') {
                s = s.replaceFirst("OX", "O");
                moves++;
            } 
			else if (s.charAt(0) == 'O' && s.charAt(1) == 'O' && s.charAt(2) == 'X') {
                s = s.replaceFirst("OO", "O");
                moves++;
            } 
			else {
                s = s.substring(1);
            }
        }

        return moves;
    }
}