package com.codex;

import java.util.*;

public class Solution {
    public static int[] findOriginalArray(int[] changed) {
        /** An integer array original is transformed into a doubled array changed by appending twice the value of every element in original, and then randomly shuffling the resulting array.
         * Given an array changed, return original if changed is a doubled array. If changed is not a doubled array, return an empty array. The elements in original may be returned in any order.
         */

        var doubledArray = new int[changed.length / 2];

        if (changed.length % 2 != 0) {
            return new int[]{};
        }

        for (int i = 0; i < changed.length; i++) {
            int num = changed[i];
            var originalNumPosition = getOriginalNumberPosition(doubledArray, num);
            if (originalNumPosition >= 0 && originalNumPosition < doubledArray.length) {
                doubledArray[originalNumPosition] = num;
            }
        }
        return doubledArray;
    }

    private static int getOriginalNumberPosition(int[] doubledArray, int num) {
        for (int i = 0; i < doubledArray.length; i++) {
            if (doubledArray[i] == num / 2) {
                return i;
            }
        }
        return -1;
    }

    }