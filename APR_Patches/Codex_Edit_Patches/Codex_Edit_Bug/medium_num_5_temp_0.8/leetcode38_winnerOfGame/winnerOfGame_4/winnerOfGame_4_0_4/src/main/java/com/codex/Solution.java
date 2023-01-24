package com.codex;

import java.util.*;

public class Solution {
public int findIndex(int[] array, int start, int end, int number) {
        if (start > end) {
            return -1;
        }

        int mid = (start + end) / 2;

        if (array[mid] == number) {
            return mid;
        }

        int leftHalf = findIndex(array, start, mid - 1, number);
        if (leftHalf != -1) {
            return leftHalf;
        }

        int rightHalf = findIndex(array, mid + 1, end, number);
        return rightHalf;
    }
}