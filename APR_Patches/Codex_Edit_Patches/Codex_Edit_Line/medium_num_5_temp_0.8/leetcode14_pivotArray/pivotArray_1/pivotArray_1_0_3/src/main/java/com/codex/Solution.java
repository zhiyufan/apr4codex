package com.codex;

import java.util.*;

public class Solution {
public static int[] pivotArray(int[] nums, int pivot) {
    
    int i = 0, j = nums.length - 1;
    while (i <= j) {
        while (i <= j && nums[i] < pivot) {
            i++;
        }
        while (i <= j && nums[j] > pivot) {
            j--;
        }
        if (i <= j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
                i++;
            j--;
            }
        }
        return nums;
    }
}

// /@return - The index of the element closest to the value provided.

// This is a binary search method
public static int[] findClosestValueInBst(BST tree, int target) {
    // Write your code here.
    ArrayList<Integer> closest = new ArrayList<>();
    Queue<BST> queue = new LinkedList<>();
    queue.add(tree);

    int minDif = Integer.MAX_VALUE;
    while (!queue.isEmpty()) {
        BST temp = queue.poll();
        int dif = Math.abs(temp.value - target);
        if (dif == 0) {
            closest.add(temp.value);
        }
        if (minDif > dif) {
            minDif = dif;
            closest.clear();
            closest.add(temp.value);
        } else if (minDif == dif) {
            closest.add(temp.value);
        }

        if (temp.left != null) {
            queue.add(temp.left);
        }
        if (temp.right != null) {
            queue.add(temp.right);
        }

        // Integer[] a = closest.toArray(new Integer[closest.size()]); //returns an array with the closest number
        // int[] b = Arrays.stream(a).mapToInt(Integer::intValue).toArray();
        // return b;
    }
    return closest.toArray();
}

public static int[] quickSort(int[] array) {
    // Write your code here.
    quickSortHelper(array, 0, array.length - 1);
    return array;
}

public static void quickSortHelper(int[] array, int startIdx, int endIdx) {
    if (startIdx >= endIdx) {
        return;
    }

    int pivotIdx = startIdx;
    int leftIdx = startIdx + 1;
    int rightIdx = endIdx;
    while (rightIdx >= leftIdx) {
        if (array[leftIdx] > array[pivotIdx] && array[rightIdx] < array[pivotIdx]) {
            swap(leftIdx, rightIdx, array);
        }
        if (array[leftIdx] <= array[pivotIdx]) {
            leftIdx++;
        }
        if (array[rightIdx] >= array[pivotIdx]) {
            rightIdx--;
        }

    }
    swap(pivotIdx, rightIdx, array);
    boolean leftSubarrayIsSmaller = rightIdx - 1 - startIdx < endIdx - (rightIdx + 1);

    if (leftSubarrayIsSmaller) {
        quickSortHelper(array, startIdx, rightIdx - 1);
        quickSortHelper(array, rightIdx + 1, endIdx);
    } else {
        quickSortHelper(array, rightIdx + 1, endIdx);
        quickSortHelper(array, startIdx, rightIdx - 1);
    }
}

public static boolean isPalindrome(String str) {
    int l = 0;
    int r = str.length() - 1;
    while (l < r) {
        if (str.charAt(l) != str.charAt(r)) {
            return false;
        }
        l++;
        r--;
    }
    return true;
}

private static void swap(int i, int j, int[] array) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
}

public static void main(String[] args) {
    int[] a = { 8, 5, 2, 9, 5, 6, 3 };
    quickSort(a);
    for (int i = 0; i < a.length; i++) {
        System.out.println(a[i]);
    }
}
}