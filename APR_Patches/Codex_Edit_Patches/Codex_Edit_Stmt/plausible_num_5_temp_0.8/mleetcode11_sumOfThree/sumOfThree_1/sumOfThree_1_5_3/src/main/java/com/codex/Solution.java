package com.codex;

import java.util.*;

public class Solution {
    public static long[] sumOfThree(long num) {
        
        List<Long> result = new ArrayList<>();
        if (num < 3) {
            return new long[0];
        }
        long low = 1;
        long high = 2;

        long sum = 3;

        while (high < num) {
            if (sum < num) {
                high++;
                sum += high;
            } else if (sum > num) {
                sum -= low;
                low++;
            } else {
                for (long i = low; i <= high; i++) {
                    result.add(i);
                }
                break;
            }
        }

        return result.stream().mapToLong(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] a = new int[] { 1, 3, 2, 3, 4, 5 };
        int x = 3;
        int[] b = beforeAndAfterPuzzles(a);
        // int c = cal(a, 0, a.length-1, x);
        Arrays.stream(b).forEach(System.out::println);

    }

    public static int[] beforeAndAfterPuzzles(int[] a) {
        List<Integer> result = new ArrayList();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {

                if (i != j && a[i] < a[j]) {

                    if (a[i] * 2 == a[j]) {
                        result.add(a[i]);
                        result.add(a[j]);
                    }

                    if (a[j] * 2 == a[i]) {
                        result.add(a[j]);
                        result.add(a[i]);
                    }
                    if (a[i] % 3 == 0) {
                        if (a[j] * 3 == a[i]) {
                            result.add(a[j]);
                            result.add(a[i]);
                        }
                    }
                    if (a[j] % 3 == 0) {
                        if (a[i] * 3 == a[j]) {
                            result.add(a[i]);
                            result.add(a[j]);
                        }
                    }

                }
            }
        }
        return result.stream().mapToInt(c -> c).toArray();
    }
}