package com.codex;

import java.util.*;

public class Solution {
public static int smallestChair(int[][] times, int targetFriend) {



    int[] arr = new int[times.length];
    for (int i = 0; i < times.length; i++) {
        int arrival = times[i][0];
        int leaving = times[i][1];
        arr[arrival]++;
        arr[leaving]--;
    }

    int curr = 0;
    for (int i = 0; i < arr.length; i++) {
        curr += arr[i];
        if (curr - 1 == targetFriend)
            return i;
    }

    return 0;
}

public static int smallestChair(int[][] times, int targetFriend) {
    int[] range = new int[times.length];
    for (int i = 0; i < times.length; i++) {
        range[i] = times[i][0];
    }
    Arrays.sort(range);


    int[] cnt = new int[range.length + 1];
    for (int i = 0; i < times.length; i++) {
        int arrival = times[i][0];
        int leaving = times[i][1];

        int a = Arrays.binarySearch(range, arrival);
        if (a < 0) {
            a = -a - 1;
        }


        int l = Arrays.binarySearch(range, leaving);
        if (l < 0) {
            l = -l - 1;
            cnt[l]--;

        } else {
            cnt[l + 1]--;

        }

    }

    int cnt = 0;
    int index = 0;
    for (int i = 0; i < cnt.length; i++) {
        cnt = cnt + cnt[i];
        if (cnt - 1 == targetFriend) {
            index = i;
            break;
        }
    }

    return range[index];
}
}