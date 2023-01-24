package com.codex;

import java.util.*;

public class Solution {
#include <stdio.h>
#include <stdlib.h>

//Please complete the given function to return the smallest number which is greater than N with the same digits.
//
int smallestNumber(int N) {
    int nums[11] = {0};
    int n = 0;
    while (N > 0) {
        nums[N % 10]++;
        N = N / 10;
        n++;
    }
    for (int i = 1; i < 10; i++) {
        if (nums[i] > 0) {
            nums[i]--;
            break;
        }
    }
    int num = 0;
    for (int i = 0; i < 10; i++) {
        if (nums[i] > 0) {
            num = num * 10 + i;
            nums[i]--;
            break;
        }
    }
    for (int i = 0; i < 10; i++) {
        while (nums[i] > 0) {
            num = num * 10 + i;
            nums[i]--;
        }
    }
    return num;
}

int main() {
        
    int N = 100;
    printf("%d", smallestNumber(N));
    return 0;
}
}