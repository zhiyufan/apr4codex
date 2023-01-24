package com.codex;

import java.util.*;

public class Solution {
import java.io.*;


public class Solution {

    public static void main(String[] args) {
        String[] bank = {"101", "1110", "000"};
        int res = numberOfBeams(bank);
        System.out.println(res);
    }

    public static int numberOfBeams(String[] bank) { 

        int res = 0;
        for (int i = 0; i < bank.length; i++) {
            int num = Integer.parseInt(bank[i], 2);
            for (int j = 0; j < bank.length; j++) {
                int tmp = Integer.parseInt(bank[j], 2);
                if (i != j && (tmp & num) == 0) {
                    res += Integer.bitCount(num);
                    break;
                }
            }
        }
        return  res;
    }

}
}