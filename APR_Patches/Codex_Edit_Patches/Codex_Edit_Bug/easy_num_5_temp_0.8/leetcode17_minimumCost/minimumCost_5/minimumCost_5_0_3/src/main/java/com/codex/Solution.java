package com.codex;

import java.util.*;

public class Solution {
public static int missingNo(int[] arr) {
    int n = arr.length + 1;
    int sum = n * (n + 1) / 2;
    int rest = 0;
    for (int i = 0; i < arr.length; i++) {
        rest += arr[i];
    }

    return sum - rest;
}
}