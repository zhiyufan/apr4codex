package com.codex;

import java.util.*;

public class Solution {
public static int addRungs(int[] rungs, int dist) {
    
    int add = 0;
    for (int i = 1; i < rungs.length; ) {
        if (rungs[i] - rungs[i - 1] > dist) {
            add++;
            rungs[i] = rungs[i - 1] + dist;
        } else {
            i++;
        }
    }
    return add;
}

public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int testCases = Integer.parseInt(reader.readLine());
    for (int i = 0; i < testCases; i++) {
    }

}
}