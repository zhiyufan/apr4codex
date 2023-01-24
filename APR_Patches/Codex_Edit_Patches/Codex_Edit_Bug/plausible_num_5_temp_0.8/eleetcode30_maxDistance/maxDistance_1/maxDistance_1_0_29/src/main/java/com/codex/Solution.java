package com.codex;

import java.util.*;

public class Solution {
public static int getMax(int[] array) {
    int length = array.length;
    int max = array[0];
    for(int i = 1; i < length; ++i) {
        if (array[i]>max) {
            max = array[i];
        }
    }
    return max;
}

public static int getMin(int[] array) {
    int length = array.length;
    int min = array[0];
    for(int i = 1; i < length; ++i) {
        if (array[i]<min) {
            min = array[i];
        }
    }
    return min;
}

public static void getRange(int[] array, int[] length) {
    int min = getMin(array);
    int max = getMax(array);
    length[0] = max - min;
    length[1] = min;
    length[2] = max;
}
public static int[] getHistogram(int[] array, int[] range) {
    int length = array.length;
    int nbins = range[0] + 1;
    int[] hist = new int[nbins];
    for (int i = 0; i < nbins; i++) {
        hist[i] = 0;
    }

    for (int i = 0; i < length; i++) {
        int index = array[i] - range[1];
        hist[index]++;
    }
    return hist;
}
public static int maxDistance(int[] colors) {
    int[] range = new int[3];
    getRange(colors, range);
    int[] hist = getHistogram(colors, range);
    int[] left = new int[range[0] + 1];
    int[] right = new int[range[0] + 1];
    left[0] = -1;
    right[range[0]] = colors.length;
    for(int i = 1; i <= range[0]; i++) {
        if(hist[i] == 0) {
            left[i] = left[i - 1];
        } else {
            left[i] = -1;
        }
    }
    for(int i = range[0] - 1; i >= 0; i--) {
        if(hist[i] == 0) {
            right[i] = right[i + 1];
        } else {
            right[i] = colors.length;
        }
    }
    int distance = 0;
    for(int i = 0; i <= range[0]; i++) {
        if(hist[i] != 0) {
            distance = Math.max(distance, Math.abs(left[i] - right[i]));
        }
    }
    return distance;
}
}