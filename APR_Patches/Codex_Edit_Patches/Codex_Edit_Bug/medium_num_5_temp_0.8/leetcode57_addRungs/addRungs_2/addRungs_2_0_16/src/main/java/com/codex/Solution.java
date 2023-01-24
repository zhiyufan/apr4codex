package com.codex;

import java.util.*;

public class Solution {

        int len = in.nextInt();
        int dist = in.nextInt();

        int[] rungs = new int[len];
        for (int i = 0; i < len; i++) {
            rungs[i] = in.nextInt();
        }

        int minAdd = addRungs(rungs, dist);
        System.out.println(minAdd);

        in.close();
    }

    public static int addRungs(int[] rungs, int dist) {
        int add = 0;
        Arrays.sort(rungs);
        for (int i = 1; i < rungs.length; ) {
            if (rungs[i] - rungs[i - 1] > dist) {
                add++;
                rungs[i] = rungs[i - 1] + dist;
            } else {
                i++;
            }
        }
        return (add);
    }
}