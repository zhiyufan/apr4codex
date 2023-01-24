package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public double findMedianSortedArrays(int A[], int B[]) {
        int m = A.length;
        int n = B.length;
        if ((m + n) % 2 != 0) {
            return (double) findKth(A, 0, m - 1, B, 0, n - 1, (m + n) / 2);
        } else {
            return (findKth(A, 0, m - 1, B, 0, n - 1, (m + n) / 2) + findKth(A, 0, m - 1, B, 0, n - 1, (m + n) / 2 - 1)) * 0.5;
        }
    }

    public int findKth(int A[], int astart, int aend, int B[], int bstart, int bend, int k) {
        int m = aend - astart + 1;
        int n = bend - bstart + 1;

        if (m > n) {
            return findKth(B, bstart, bend, A, astart, aend, k);
        }
        if (m == 0) {
            return B[bstart + k];
        }
        if (k == 0) {
            return A[astart] < B[bstart] ? A[astart] : B[bstart];
        }

        int partA = Math.min(k / 2, m);
        int partB = k - partA;

        if (A[astart + partA - 1] < B[bstart + partB - 1]) {
            return findKth(A, astart + partA, aend, B, bstart, bend, k - partA);
        } else if (A[astart + partA - 1] > B[bstart + partB - 1]) {
            return findKth(A, astart, aend, B, bstart + partB, bend, k - partB);
        } else {
            return A[astart + partA - 1];
            }
        }
    }
}