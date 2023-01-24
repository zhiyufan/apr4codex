package com.codex;

import java.util.*;

public class Solution {
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int pivot = arr[0];
        List<Integer> left = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] < pivot) {
                left.add(arr[i]);
            } else if (arr[i] == pivot) {
                equal.add(arr[i]);
            } else {
                right.add(arr[i]);
            }
        }
        for (int i = 0; i < left.size(); i++) {
            System.out.print(left.get(i) + " ");
        }
        for (int i = 0; i < equal.size(); i++) {
            System.out.print(equal.get(i) + " ");
        }
        for (int i = 0; i < right.size(); i++) {
            System.out.print(right.get(i) + " ");
        }
        System.out.println();
    }
}

    
}