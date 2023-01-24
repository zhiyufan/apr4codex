package com.codex;

import java.util.*;

public class Solution {
    import java.util.ArrayList;
    import java.util.List;
    import java.util.Scanner;

    public class Solution {

    public static List<Integer> goodDaysToRobBank(int[] security, int time) {
        List<Integer> goodDays = new ArrayList<>();


        int low = 0;
        int high = security.length - 1;

        int lowTime = 0;
        int highTime = 0;

        for (int i = 0; i < time; i++) {
            if (security[i] > security[low]) {
                low = i;
                lowTime = 0;
            }
            lowTime++;

            if (security[security.length - 1 - i] > security[high]) {
                high = security.length - 1 - i;
                highTime = 0;
            }
            highTime++;
        }

        if (high - time < low + time) {
            goodDays.add(low);
            return goodDays;
        }


                if (j < low + lowTime) {
                    break;
                }

                if (security[j] < security[low]) {
                    isGoodDay = false;
                    break;
                }

        for (int i = time; i < security.length - time; i++) {
            boolean isGoodDay = true;
            for (int j = i - time; j < i; j++) {
                for (int k = j + 1; k < i; k++) {
                    if (security[j] < security[k]) {
                        isGoodDay = false;
                        break;
                    }
                }

                if (!isGoodDay) {
                    break;
                }
            }

            if (isGoodDay) {
                for (int j = i + 1; j < i + time; j++) {
                    for (int k = j + 1; k < i + time; k++) {
                        if (security[j] > security[k]) {
                            isGoodDay = false;
                            break;
                        }

                        if (k < high - highTime) {
                            break;
                        }

                        if (security[k] < security[high]) {
                            isGoodDay = false;
                            break;
                        }

                    }
                    if (!isGoodDay) {
                        break;
                    }
                }
            }

            if (isGoodDay) {
                goodDays.add(i);
            }
        }

        return goodDays;
    }



    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int T = in.nextInt();
        int[] security = new int[N];

        for (int i = 0; i < N; i++) {
            security[i] = in.nextInt();
        }

        List<Integer> goodDays = goodDaysToRobBank(security, T);
        System.out.println(goodDays.size());
        for (int day : goodDays) {
            System.out.print(day + 1 + " ");
        }
        System.out.println();

        in.close();
    }
}
}