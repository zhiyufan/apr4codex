package com.codex;

import java.util.*;

public class Solution {
  public static int[] findOriginalArray(int[] changed) {
        int oddElementPos = 0;
        int evenElementPos = 0;
        int[] original = new int[changed.length];
        int[] evenElement = new int[changed.length / 2];
        int[] oddElement = new int[changed.length / 2];


        for (int i = 0; i < changed.length; i++) {
            if (changed[i] % 2 != 0) {
                oddElement[oddElementPos] = changed[i];
                oddElementPos++;
            } else {
                evenElement[evenElementPos] = changed[i];
                evenElementPos++;
            }
        }

        for (int i = 0; i < oddElementPos; i++) {
            original[2 * i] = oddElement[i];
        }

        for (int i = 0; i < evenElementPos; i++) {
            original[2 * i + 1] = evenElement[i];
        }

        return original;
  }


}