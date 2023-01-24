package com.codex;

import java.util.*;

public class Solution {
import java.util.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = pivotArray(new int[] {3,3,1,2,2,2,3}, 3);
        System.out.println(Arrays.toString(array));
    }

    public static int[] pivotArray(int[] arr, int p) {
        int[] res = new int[arr.length];
        int left = 0, right = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < p) {
                res[left++] = arr[i];
            } else if (arr[i] == p) {
                res[right--] = arr[i];
            }
        }
        for (int i = left; i < right; i++) {
            res[left++] = p;
        }
        for (int i = right; i < arr.length; i++) {
            res[right--] = arr[i];
        }
        return res;
    }

}
}