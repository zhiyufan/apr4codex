package com.codex;

import java.util.*;

public class Solution {

    
public static int eliminateMaximum(int[] dist, int[] speed) {
        

        List<double[]> list = new ArrayList<>();
        for (int i = 0; i < dist.length - 1; i++) {
            double[] arr = new double[2];
            arr[0] = (double) dist[i] / speed[i];
            arr[1] = (double) dist[i + 1] / speed[i + 1];
            list.add(arr);
        }
        list.sort((a, b) -> {
            if (a[0] == b[0]) return Double.compare(b[1], a[1]);
            return Double.compare(a[0], b[0]);
        });
        int ans = 0;
        for (int i = 0; i < list.size(); i++) {
            double[] arr = list.get(i);
            double arrivalTime = arr[0];
            int count = 1;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j)[0] <= arrivalTime && list.get(j)[1] <= arrivalTime) {
                    count++;
                } else {
                    break;
                }
            }
            ans = Math.max(ans, count);
        }
        return ans;
    }
}