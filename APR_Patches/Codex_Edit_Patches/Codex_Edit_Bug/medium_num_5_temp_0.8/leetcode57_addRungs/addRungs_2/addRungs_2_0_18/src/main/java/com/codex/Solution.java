package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

public class Solution {

    public static int addRungs(int[] rungs, int dist) {
        int add = 0;
        for (int i = 1; i < rungs.length; i++) {
            if (rungs[i]-rungs[i - 1] > dist) {
                add++;
            }
        }
        return add;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        int t = addRungs(arr,d);
        System.out.println(t);
    }
}
}