package com.codex;

import java.util.*;

public class Solution {
public static boolean isBitSet(int n, int bitIndex) {
        int mask = 1 << bitIndex;
        int nAndMask = n & mask;
        int bit = nAndMask >> bitIndex;
        return bit == 1;
    }

    public static int findBitIndex(int n, int bitIndex) {
        while (bitIndex >= 0) {
            if (isBitSet(n, bitIndex)) {
                return bitIndex;
            }
            bitIndex--;
        }
        return -1;
    }


    public static int makeIntegerFromBits(boolean[] b) {
        int result = 0;
        int size = b.length;
        for (int i = 0; i < b.length; i++) {
            int bit = b[i] ? 1 : 0;
            int mask = bit << (size - i - 1);
            result |= mask;
        }

        return result;
    }
}