package com.codex;

import java.util.*;

public class Solution {
package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DemoApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] array = s.split(" ");
        int[] nums1 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            nums1[i] = Integer.parseInt(array[i]);
        }
        String s1 = scanner.nextLine();
        String[] array1 = s1.split(" ");
        int[] nums2 = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            nums2[i] = Integer.parseInt(array1[i]);
        }
        String s2 = scanner.nextLine();
        String[] array2 = s2.split(" ");
        int[] nums3 = new int[array2.length];
        for (int i = 0; i < array2.length; i++) {
            nums3[i] = Integer.parseInt(array2[i]);
        }
        List<Integer> result = twoOutOfThree(nums1, nums2, nums3);
        System.out.println(result);
    }

    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3){
        
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Arrays.sort(nums3);
        for (int i = 0; i < nums1.length; i++){
            for (int j = 0; j < nums2.length; j++){
                if (nums1[i] == nums2[j]){
                    if (nums1[i] == 0){
                        continue;
                    } else {
                        result.add(nums1[i]);
                        nums1[i] = 0;
                        nums2[j] = 0;
                        break;
                    }
                }
            }
            for (int j = 0; j < nums3.length; j++) {
                if (nums1[i] == nums3[j]) {
                    if (nums1[i] == 0) {
                        continue;
                    } else {
                        result.add(nums1[i]);
                        nums1[i] = 0;
                        nums3[j] = 0;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums3.length; j++) {
                if (nums2[i] == nums3[j]) {
                    if (nums2[i] == 0) {
                        continue;
                    } else {
                        result.add(nums2[i]);
                        nums2[i] = 0;
                        nums3[j] = 0;
                        break;
                    }
                }
            }
        }
        return result;
    }

    
}