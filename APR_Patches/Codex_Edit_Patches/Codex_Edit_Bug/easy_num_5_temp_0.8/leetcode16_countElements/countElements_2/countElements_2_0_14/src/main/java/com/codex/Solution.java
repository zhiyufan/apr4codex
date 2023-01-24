package com.codex;

import java.util.*;

public class Solution {
public static int countElements(int[] arr) {
        int count = 0;
        boolean loop = false;
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i] + 1) {
                    count++;
                    
                } 
            }
        }
        return count;
    }



    public static int countElements(int[] arr) {
        int count = 0;
        int num = 0;
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i] + 1) {
                    count++;
                    num = arr[j];
                    break;
                } 
            }
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == num) {
                    arr[j] = -1;
                }
            }
        }
        return count;
    }









    public static int countElements1(int[] arr) {
        int count = 0;
        int num = 0;
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i] + 1) {
                    count++;
                    num = arr[j];
                    break;
                } 
            }
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == num) {
                    arr[j] = -1;
                }
            }
        }
        return count;
    }

}