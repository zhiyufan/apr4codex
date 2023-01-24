package com.codex;

import java.util.*;

public class Solution {
public static int minBitFlips(int start, int goal) {
    int bitM = start ^ goal;
    int one = 0;
    int count = 0;
    for (int i = 0; i < 31; i++) {
        if ((bitM & (1 << i)) > 0) {
            one++;
            if ((start & (1 << i)) > 0) {
                count++;
            }
        }
    }
    return one == count ? one : -1;
}


// public static int minBitFlips(int start, int goal) {
        
//     int flips = 0;
//     int M = start ^ goal;
//     int left = 0;
//     while (M > 0) {
//         if ((M & 1) == 1) {
//             flips++;
//         }
//         left++;
//         M >>= 1;
//     }
//     return flips + left - 1;
// }
}