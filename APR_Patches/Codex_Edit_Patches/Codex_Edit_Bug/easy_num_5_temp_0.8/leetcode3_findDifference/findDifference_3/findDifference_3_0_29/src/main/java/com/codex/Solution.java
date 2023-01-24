package com.codex;

import java.util.*;

public class Solution {
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
public class Test {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] arr2  = {3,4,5};
        int[] list = new int[arr.length+arr2.length];
        int arr1Index = 0;
        int arr2Index = 0;
        int get = 0;
        while (arr1Index < arr.length && arr2Index < arr2.length){
            if (arr[arr1Index] < arr2[arr2Index]){
                list[get] = arr[arr1Index];
                System.out.println(list[get]);
                arr1Index++;
                get++;
            }else {
                list[get] = arr2[arr2Index];
                System.out.println(list[get]);
                arr2Index++;
                get++;
            }
        }
        if(arr1Index >= arr.length){
            for (int i = arr2Index; i < arr2.length;i++){
                list[get] = arr2[i];
                System.out.println(list[get]);
                get++;
            }
        }
        for (int i : nums1) {
            if (!set2.contains(i)) {
                list1.add(i);
            }
        }
        for (int i : nums2) {
            if (!set1.contains(i)) {
                list2.add(i);
            }
        }
        result.add(list1);
        result.add(list2);
        return result;
    }
}