package com.codex;

import java.util.*;

public class Solution {
    public static int numberOfWeakCharacters(int[][] properties) {
        /** You are playing a game that contains multiple characters, and each of the characters has two main properties: attack and defense. You are given a 2D integer array properties where properties[i] = [attacki, defensei] represents the properties of the ith character in the game.
         * A character is said to be weak if any other character has both attack and defense levels strictly greater than this character's attack and defense levels. More formally, a character i is said to be weak if there exists another character j where attackj > attacki and defensej > defensei.
         * Return the number of weak characters.
         */
        int numberOfWeakCharacters = 0;

        for (int i = 0; i < properties.length; i++) {
            int[] property = properties[i];
            int attack = property[0];
            int defense = property[1];
            for (int j = 0; j < properties.length; j++) {
                if (j != i) {
                    int[] property2 = properties[j];
                    int attack2 = property2[0];
                    int defense2 = property2[1];
                    if (attack2 > attack && defense2 > defense) {
                        numberOfWeakCharacters++;
                        break;
                    }
                }
            }
        }

        return numberOfWeakCharacters;
    }

    }