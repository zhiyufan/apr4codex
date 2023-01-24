package com.codex;

import java.util.*;

public class Solution {

    // 一个正整数的二进制表示中有多少个1，可以用下面的思路来计算，首先看十进制是多少，
    // 十进制的123 % 10 = 3，123/10 = 12，12 % 10 = 2
    // 12/10 = 1, 1 % 10 = 1，1 / 10 = 0
    // 依次类推，可以看出，十进制每多一位，需要除以10商取整，余数按位相加就是123在十进制下的每一位数字，
    // 也就是3+2+1=6，
    // 对于二进制就是什么意思呢，同样的道理，二进制的123 % 2 = 1，123/2 = 61，61 % 2 = 1，61 / 2 = 30
    // ...
    // 所以二进制和十进制是一样的道理，只不过除数不同而已，这里就简单介绍这两个进制的转换，
    // 十进制转二进制可以用移位操作，二进制转十进制也可以用移位操作，
    // 但是对于大数的运算还是用递归比较方便，这里不多做介绍了，具体看代码，
    // 代码很简单，一共有两种方法，一种是用移位操作，一种是用递归求解


    public int countOne(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    public int countOneBinary(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public int countOneRecursive(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 2 == 0 ? countOneRecursive(n / 2) : 1 + countOneRecursive(n / 2);
    }

    public int countOneBitManipulation(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n = n >> 1;
        }
        return count;
    }

    public int countOneBitManipulationRecursive(int n) {
        if (n == 0) {
            return 0;
        }
        return (n & 1) + countOneBitManipulationRecursive(n >> 1);
    }



    public static String findDifferentBinaryString(String[] nums) {
        
        int[] counts = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            char[] current = nums[i].toCharArray();
            for (int j = 0; j < current.length; j++) {
                if (current[j] == '1') {
                    counts[j]++;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < counts.length; i++) {
            sb.append(counts[i] * 2 > nums.length ? '0' : '1');
        }
        return sb.toString();
    }

    
}