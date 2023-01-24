package com.codex;

import java.util.*;

public class Solution {
package com.job.algorithm.dynamic;

import java.util.ArrayList;
import java.util.List;

/**
 * create with COM.Algorithm.Job.dynamic
 * USER: husterfox
 */
public class BankRob {

    public static List<Integer> goodDaysToRobBank(int[] security, int time) {


        List<Integer> res = new ArrayList<>();
        int[] nonInc = new int[security.length];
        int[] nonDec = new int[security.length];
        int min = security[0];
        int max = security[security.length - 1];
        for (int i = 0; i < security.length; i++) {
            min = Math.min(security[i], min);
            nonInc[i] = min;
        }
        for (int i = security.length - 1; i >= 0; i--) {
            max = Math.max(security[i], max);
            nonDec[i] = max;
        }
        for (int i = 0; i < security.length; i++) {
            if (i >= time && i <= security.length - time - 1 && security[i] >= nonInc[i - time] && security[i] <= nonDec[i + time]) {
                res.add(i);
            }
        }
        return res;
    }


    public static void main(String[] args) {
        int[] security = {2, 3, 4, 3, 6};
        System.out.println(goodDaysToRobBank(security, 2));
    }
}
}