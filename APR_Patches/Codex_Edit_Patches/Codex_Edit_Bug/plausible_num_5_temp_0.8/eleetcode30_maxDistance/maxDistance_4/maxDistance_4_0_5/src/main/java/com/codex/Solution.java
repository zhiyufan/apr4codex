package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    /**
     * @param colors: A list of integer
     * @param k: An integer
     * @return: nothing
     */
     public void sortColors2(int[] colors, int k) {
         // write your code here
         int left = 0;
         int right = colors.length - 1;
         int min = 1;
         int max = k;
         while (min < max) {
             int l = left;
             int r = right;
             for (int i = l; i <= r; i++) {
                 if (colors[i] == min) {
                     swap(colors, i, l);
                     l++;
                 } else if (colors[i] == max) {
                     swap(colors, i, r);
                     r--;
                     i--;
                 }
             }
             left = l;
             right = r;
             min++;
             max--;
         }
     }
     private void swap(int[] arr, int a, int b) {
         int temp = arr[a];
         arr[a] = arr[b];
         arr[b] = temp;
     }
 }
}