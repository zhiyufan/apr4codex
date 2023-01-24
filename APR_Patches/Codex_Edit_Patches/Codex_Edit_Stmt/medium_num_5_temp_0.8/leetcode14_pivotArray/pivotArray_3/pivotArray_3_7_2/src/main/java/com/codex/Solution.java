package com.codex;

import java.util.*;

public class Solution {

    
int[] pivotArray(int[] nums, int pivot) {
    
    int smaller = 0, equal = 0, greater = nums.length;
    while (equal < greater) {
        if (nums[equal] < pivot) {
            swap(nums, smaller++, equal++);
        }
        else if (nums[equal] == pivot) {
            ++equal;
        }
        else {
            swap(nums, equal, --greater);
        }
    }
    return nums;
}
void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
}

void sortColors(int[] nums) {
    
    int zero = 0, two = nums.length - 1; //pointers for 0 and 2
    for (int i = 0; i <= two; i++) { //0 and 2 parts of the array are sorted, 1s are in the middle
        while (nums[i] == 2 && i < two) swap(nums, i, two--);
        while (nums[i] == 0 && i > zero) swap(nums, i, zero++);
    }
}

    
class Solution {
    public int findKthLargest(int[] nums, int k) {
        k = nums.length - k;
        int lo = 0;
        int hi = nums.length - 1;
        while (lo < hi) {
            final int j = partition(nums, lo, hi);
            if(j < k) {
                lo = j + 1;
            } else if (j > k) {
                hi = j - 1;
            } else {
                break;
            }
        }
        return nums[k];
    }

    private int partition(int[] a, int lo, int hi) {

        int i = lo;
        int j = hi + 1;
        while(true) {
            while(i < hi && less(a[++i], a[lo]));
            while(j > lo && less(a[lo], a[--j]));
            if(i >= j) {
                break;
            }
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }

    private void exch(int[] a, int i, int j) {
        final int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    private boolean less(int v, int w) {
        return v < w;
    }

}
}