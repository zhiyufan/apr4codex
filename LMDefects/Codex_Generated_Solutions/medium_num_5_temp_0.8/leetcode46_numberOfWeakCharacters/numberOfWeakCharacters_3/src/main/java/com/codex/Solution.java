package com.codex;

import java.util.*;

public class Solution {
    public static int numberOfWeakCharacters(int[][] properties) {
        /** You are playing a game that contains multiple characters, and each of the characters has two main properties: attack and defense. You are given a 2D integer array properties where properties[i] = [attacki, defensei] represents the properties of the ith character in the game.
         * A character is said to be weak if any other character has both attack and defense levels strictly greater than this character's attack and defense levels. More formally, a character i is said to be weak if there exists another character j where attackj > attacki and defensej > defensei.
         * Return the number of weak characters.
         */
        int count = 0;

        for (int i = 0; i < properties.length; i++) {
            for (int j = 0; j < properties.length; j++) {
                if (i == j) continue;
                if (properties[j][0] > properties[i][0] && properties[j][1] > properties[i][1]) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }

    }