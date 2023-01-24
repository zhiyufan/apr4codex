package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

    public static String maximumNumber(String num, int[] change) {

        

        StringBuilder res = new StringBuilder(num);
        int[] cnt = new int[10];

        for (int i = 0; i < res.length(); i++) {
            cnt[res.charAt(i) - '0']++;
        }

        for (int i = 0; i < 10; i++) {
            if (cnt[i] > 0) {
                cnt[i]--;
                StringBuilder temp = new StringBuilder();
                for (int j = 9; j >= 0; j--) {
                    while (cnt[j] > 0) {
                        temp.append(j);
                        cnt[j]--;
                    }
                }

                cnt[i]++;
                res = temp.append(i).length() > res.length() ? temp.append(i) : res;
            }
        }

        return res.toString().substring(0,change.length);
    }


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] num = in.nextLine().split(",");
        int[] change = new int[num.length];
        for(int i = 0; i < num.length; i++){
            change[i] = Integer.parseInt(num[i]);
        }
        System.out.println(maximumNumber(num[0], change));
    }
}