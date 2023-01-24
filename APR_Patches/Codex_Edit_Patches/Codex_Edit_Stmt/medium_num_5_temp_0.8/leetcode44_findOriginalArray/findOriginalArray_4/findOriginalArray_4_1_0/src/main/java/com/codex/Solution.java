package com.codex;

import java.util.*;

public class Solution {
int[] findOriginalArray(int[] changed) {
    int[] original = new int[changed.length / 2];
    HashSet<Integer> set = new HashSet<>();
    for (int aChanged : changed) {
        if (aChanged % 2 != 0) {
            return new int[0];
        }
        int curr = aChanged / 2;
        if (set.contains(curr)) {
            set.remove(curr);
        } else {
            set.add(curr);
        }
    }
    if (!set.isEmpty()) {
        return new int[0];
    }
    int k = 0;
    for (int aChanged : changed) {
        if (aChanged % 2 == 0) {
            original[k] = aChanged / 2;
            k++;
        }
    }
    return original;
}



public static int[] findOriginalArray(int[] changed) {

    int[] original = new int[changed.length / 2];
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < changed.length; i++) {
        if (changed[i] % 2 != 0) {
            return new int[0];
        }
        if (set.contains(changed[i] / 2)) {
            set.remove(changed[i] / 2);
        } else {
            set.add(changed[i] / 2);
        }
    }
    if (!set.isEmpty()) {
        return new int[0];
    }
    int k = 0;
    for (int i = 0; i < changed.length; i++) {
        if (changed[i] % 2 == 0) {
            original[k] = changed[i] / 2;
            k++;
        }
    }
    return original;
}





int[] findOriginalArray(int[] changed) {
    int[] original = new int[changed.length / 2];
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < changed.length; i++) {
        if (changed[i] % 2 != 0) {
            return new int[0];
        }
        if (set.contains(changed[i] / 2)) {
            set.remove(changed[i] / 2);
        } else {
            set.add(changed[i] / 2);
        }
    }
    if (!set.isEmpty()) {
        return new int[0];
    }
    int k = 0;
    for (int i = 0; i < changed.length; i++) {
        if (changed[i] % 2 == 0) {
            original[k] = changed[i] / 2;
            k++;
        }
    }
    return original;
}










public static int[] findOriginalArray(int[] changed) {

    int[] original = new int[changed.length / 2];
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < changed.length; i++) {
        if (changed[i] % 2 != 0) {
            return new int[0];
        }
        if (set.contains(changed[i] / 2)) {
            set.remove(changed[i] / 2);
        } else {
            set.add(changed[i] / 2);
        }
    }
    if (!set.isEmpty()) {
        return new int[0];
    }
    int k = 0;
    for (int i = 0; i < changed.length; i++) {
        if (changed[i] % 2 == 0) {
            original[k] = changed[i] / 2;
            k++;
        }
    }
    return original;
}



            }
        }
        if (!set.isEmpty()) {
            return new int[]{};
        }
        int k = 0;
        for (int i = 0; i < changed.length; i++) {
            if (changed[i] % 2 == 0) {
                original[k] = changed[i]/2;
                k++;
            }
        }
        return original;


}