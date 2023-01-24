package com.codex;

import java.util.*;

public class Solution {
import java.util.Scanner;
import java.util.HashMap;

class Solution {

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        String str = obj.nextLine();
        String str2 = obj.nextLine();
        String arr[] = str2.split(" ");
        int givenArray[] = new int[n];
        for (int i = 0; i < n; i++) {
            givenArray[i] = Integer.parseInt(arr[i]);
        }
        System.out.println(countElements(givenArray));
    }


    public static int countElements(int arr[]) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            if (hm.containsKey(arr[i])) {
                int value = hm.get(arr[i]);
                hm.put(arr[i], ++value);
            } else {
                hm.put(arr[i], count);
            }
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i] + 1)) {
                count += hm.get(arr[i]);
            }
        }
        return count;
    }
}
}