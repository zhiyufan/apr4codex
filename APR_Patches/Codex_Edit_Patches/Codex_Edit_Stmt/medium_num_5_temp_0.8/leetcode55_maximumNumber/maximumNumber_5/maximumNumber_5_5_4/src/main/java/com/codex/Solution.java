package com.codex;

import java.util.*;

public class Solution {
    public static int maximumSum(int[] arr, int k, int[] swaps) {
        int res = 0;
        for (int i : arr) {
            res += i;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int[][] change = new int[arr.length][2];
        for (int[] ch : swaps) {
            change[ch[0]][0] = ch[1];
            change[ch[0]][1] = ch[2];
        }

        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = change[i][0] == 0 ? arr[i] : change[i][1];
        }

        for (int i = 0; i < k; i++) {
            for (int j = i; j < newArr.length; j += k) {
                pq.add(newArr[j]);
                if (pq.size() > k) {
                    pq.poll();
            }
                }

            Iterator<Integer> it = pq.iterator();
            int index = 0;
            while (it.hasNext()) {
                arr[i + index] = it.next();
                index += k;
            }
        }

        return res.toString();
    }

    
}