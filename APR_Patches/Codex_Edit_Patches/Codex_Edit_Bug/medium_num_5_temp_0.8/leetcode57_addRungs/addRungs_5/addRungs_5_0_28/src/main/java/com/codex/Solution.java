package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

public class Solution {

    public static int addRungs(int[] rungs, int dist) {
        int count = 1;
        int last = rungs[0];
        for (int i=1; i<rungs.length; i++) {
            if (rungs[i] > last) {
                int diff = rungs[i] - last;
                count += diff / dist;
                if (diff % dist > 0)
                    count++;
                last += dist;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int n = scan.nextInt();
        int[] rungs = new int[n];
        for (int i=0; i<n; i++) {
            rungs[i] = scan.nextInt();
        }
        System.out.println(addRungs(rungs, s));
    }
}
}