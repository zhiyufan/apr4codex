package com.codex;

import java.util.*;

public class Solution {
    //没有考虑进位的情况，考虑比较粗暴的方式
    public static long numberOfWeeks(int[] milestones) {
        
        Arrays.sort(milestones);
        long ret = 0;
        for (int i = milestones.length - 1; i >= 0; i--) {
            ret += milestones[i] / (milestones.length - i);
            if (milestones[i] % (milestones.length - i) != 0) ret++;
        }
        return ret;
    }

    //这里使用了一个非常有意思的想法，也就是如果一个长的数据里面包含了k个数据，那么如果这个数据是能被除尽的，那么整个数据里面所有的数据都能被尽的啦
    //然后这个数据减去这些长度的数据，那么我们这个数据就又变成一个比较短的数据了，然后我们再去计算这个数据想加没有，然后这样一步一步的加下去，就可以得到一个结果
    public static long numberOfWeeks(int[] milestones) {
        Arrays.sort(milestones);
        long sum = 0;
        for(int m : milestones) sum += m;
        long left = milestones[0];
        long right = sum;
        while(left < right){
            long mid = left + (right - left) / 2;
            if(numberOfWeeks(milestones, mid) <= sum) right = mid;
            else left = mid + 1;
        }
        return left;
    }
    
    private static long numberOfWeeks(int[] milestones, long count){
        long result = 0;
        for(int m : milestones) result += m / count;
        return result;
    }
    
}