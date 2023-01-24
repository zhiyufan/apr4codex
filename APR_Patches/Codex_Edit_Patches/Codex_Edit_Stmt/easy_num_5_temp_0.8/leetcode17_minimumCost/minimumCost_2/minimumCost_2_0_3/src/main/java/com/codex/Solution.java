package com.codex;

import java.util.*;

public class Solution {
    public static int minimumCost(int[] cost) {
        
        Arrays.sort(cost);//排序(int[] cost默认就是升序)
        int sum = 0;//定义一个初始值
        for (int i = 0; i < cost.length; i++) {//遍历所有
            if (i % 3 == 2) {//如果刚好是第三个，那么就执行continue跳过这个数组，转下一个数组
                continue;//跳过，直接执行下一个
            } 
            sum += cost[i];//因为是升序，所以从0开始算，加上每个值
        }
        return sum; 
    }//返回值是sum

    
}