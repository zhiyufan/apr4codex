package com.codex;

import java.util.*;

public class Solution {
public static int[] mergeSort(int[] array) {
    if (array.length <= 1) {
        return array;
    }
    int mid = array.length / 2;
    int[] left = Arrays.copyOfRange(array, 0, mid);
    int[] right = Arrays.copyOfRange(array, mid, array.length);
    return merge(mergeSort(left), mergeSort(right));
}
public static int[] merge(int[] left, int[] right) { // merge two sorted lists
    int[] result = new int[left.length + right.length];
    for (int i = 0, j = 0, k = 0; k < result.length; k++) {
        if (i == left.length) {
            result[k] = right[j++];
        } else if (j == right.length) {
            result[k] = left[i++];
        } else {
            result[k] = left[i] < right[j] ? left[i++] : right[j++];
            }
        }
    return result;
    }

}
```
}