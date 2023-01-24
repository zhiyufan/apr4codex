package com.codex;

import java.util.*;

public class Solution {
int* twoSum(int* nums, int numsSize, int target, int* returnSize){
    int* result = (int*)malloc(2*sizeof(int));
    *returnSize = 2;
    int i = 0;
    bool found = false;
    while(i < numsSize && !found) {
        int j = i+1;
        while(j < numsSize && !found) {
            if(nums[i] + nums[j] == target) {
                result[0] = i;
                result[1] = j;
                found = true;
            }
            if (dist[i] == dist[maxIndex] && speed[i] > speed[maxIndex]) {
                maxIndex = i;
            }
        }
        int count = 1;
        for (int i = 0; i < maxIndex; i++) {
            if (dist[i] - dist[maxIndex] <= speed[i] * speed[maxIndex]) {
                count++;
            }
        }
        return count;
    }
    
}