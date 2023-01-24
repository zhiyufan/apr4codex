package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;

public class NthLargestElement {
    public static void main(String[] args) {
        int[] array = { 1, 5, 2, 6, 4, 8, 9 };
        int n = 2;
        System.out.println(NthLargestElement(array, n));
    }


    public static int NthLargestElement(int[] array, int n) {
        Arrays.sort(array);
        return array[array.length - n];
    }
}
}