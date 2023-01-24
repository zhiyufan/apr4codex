package com.codex;

import java.util.*;

public class Solution {
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static int[] prefixSum(int[] A, int i) {
        int[] B = new int[A.length];
        if (i == 0) {
            B[0] = A[0];
            return B;
        }
        if (i >= A.length) return null;
        B[0] = A[0];
        for (int j = 1; j < A.length; j++) {
            B[j] = B[j - 1] + A[j];
        }
        return B;
    }

    public static int[] solution(int K, int M, int[] A) {
        // write your code in Java SE 8
        int[] prefix = prefixSum(A, K - 1);
        int[] C = new int[A.length];
        for (int i = 0; i < K; i++) {
            C[i] = prefix[i];
        }
        for (int i = K; i < A.length; i++) {
            C[i] = prefix[i] - prefix[i - K];
        }

        int[] D = new int[A.length];
        for (int i = 0; i < M; i++) {
            D[i] = C[i];
        }
        for (int i = M; i < A.length; i++) {
            D[i] = Math.max(D[i - 1], C[i]);
        }
        int[] E = new int[A.length];
        E[A.length - 1] = D[A.length - 1];
        for (int i = A.length - 2; i >= M - 1; i--) {
            E[i] = Math.max(D[i], E[i + 1]);
        }
        int[] F = new int[A.length];
        for (int i = 0; i < A.length - M + 1; i++) {
            F[i] = Math.max(C[i + M - 1], E[i + M]);
        }

        int[] result = new int[F.length - (K - 1)];
        int j = 0;
        for (int i = 0; i < F.length; i++) {
            if (i >= (K - 1) - 1 && i < F.length - (K - 1)) {
                result[j] = F[i];
                j++;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] A = new int[7];
        A[0] = -1;
        A[1] = -1;
        A[2] = -1;
        A[3] = -1;
        A[4] = -1;
        A[5] = -1;
        A[6] = -1;

        int K = 3;
        int M = 3;
        int[] prefix = prefixSum(A, K - 1);
        for (int i = 0; i < prefix.length; i++) {
            System.out.println(prefix[i]);
        }
    }


}
}