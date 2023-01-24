package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long num) {
        
        int[] res = new int[10];
        while (num > 0) {
            res[(int)(num % 10)]++;
            num /= 10;
        }
        int index = 0;
        for (int i = 1; i < 10; i++) {
            if (res[i] > 0) {
                index = i;
                res[i]--;
                break;
            }
        }
        long min = index;
        for (index = 0; index < 10; index++) {
            while (res[index]-- > 0) {
                min = min * 10 + index;
            }
        }
        return min;
    }
    
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

int main(int argc, char *args[]) {
    int nums[10];
    int i, j;
    char *res = (char *)malloc(sizeof(char) * (argc - 1));
    memset(nums, 0, sizeof(nums));
    for (i = 1; i < argc; i++){
        nums[args[i][0] - '0']++;
        nums[args[i][1] - '0']++;
    }
    for (i = 1, j = 0; i <= 9; i++){
        if (nums[i] == 1){
            res[j++] = i + '0';
        }
    }
    for (i = 0; i < j; i++){
        printf("Bigger number is %c%c", res[i], res[(i+1) % j]);
    }
    return 0;
}
}