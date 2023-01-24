package com.codex;

import java.util.*;

public class Solution {
    public static int[] quickSort(int[] arr) {

       int pivot = arr[arr.length - 1];
       int index = 0;
       for (int i = 0; i < arr.length - 1; i++){
           if (arr[i] < pivot){
               int temp = arr[index];
               arr[index] = arr[i];
               arr[i] = temp;
               index++;
           }
       }
       int temp = arr[index];
       arr[index] = pivot;
       arr[arr.length - 1] = temp;
       if (index == 0){
           return arr;
       }
       else if (index == arr.length - 1){
           return arr;
       }
       else{
           int[] arr1 = Arrays.copyOfRange(arr, 0, index);
           int[] arr2 = Arrays.copyOfRange(arr, index + 1, arr.length);
           quickSort(arr1);
           quickSort(arr2);
       }
       return arr;
    }
}