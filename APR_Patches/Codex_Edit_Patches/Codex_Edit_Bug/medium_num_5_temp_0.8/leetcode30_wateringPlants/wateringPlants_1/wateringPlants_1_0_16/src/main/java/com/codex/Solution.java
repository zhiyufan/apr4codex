package com.codex;

import java.util.*;

public class Solution {
import java.util.ArrayList;

public class Solution {

    public static int minDominoRotations(int[] A, int[] B) {

        ArrayList<Integer> a = new ArrayList();
        ArrayList<Integer> b = new ArrayList();

        for (int i = 0; i < A.length; i++) {
            if (i == 0) {
                a.add(A[i]);
                b.add(B[i]);
            } else {
                if (A[0] != A[i]) {
                    a.add(A[i]);
                }
                if (B[0] != B[i]) {
                    b.add(B[i]);
                }
            }
        }

        int finalResult = 1000;
        int resultA = 0;
        int resultB = 0;
        boolean flag = false;

        if (a.size() > 0) {
            for (Integer i : a) {
                int count = 0;
                for (int j = 0; j < A.length; j++) {
                    if (A[j] != i) {
                        if (B[j] == i) {
                            count++;
                        } else {
                            count = 0;
                            break;
                        }
                    }
                }
                if (count > 0) {
                    flag = true;
                    resultA = count;
                }
            }
        }

        if (b.size() > 0) {
            for (Integer i : b) {
                int count = 0;
                for (int j = 0; j < B.length; j++) {
                    if (B[j] != i) {
                        if (A[j] == i) {
                            count++;
                        } else {
                            count = 0;
                            break;
                        }
                    }
                }
                if (count > 0) {
                    if (resultA > 0) {
                        resultB = count;
                        flag = true;
                    } else {
                        flag = true;
                        resultB = count;
                    }
                }
            }
        }

        if (flag) {
            if (resultA < resultB) {
                finalResult = resultA;
            } else {
                finalResult = resultB;
            }
        } else {
            finalResult = -1;
        }
        return finalResult;
    }

    public static void main(String[] args) {
        int A[] = {3, 5, 1, 2, 3};
        int B[] = {3, 6, 3, 3, 4};
        int result = minDominoRotations(A, B);
        System.out.println(result);
    }
}
}