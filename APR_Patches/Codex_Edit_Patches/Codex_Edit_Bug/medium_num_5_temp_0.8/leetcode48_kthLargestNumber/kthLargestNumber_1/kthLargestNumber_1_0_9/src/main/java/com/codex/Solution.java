package com.codex;

import java.util.*;

public class Solution {
public static String kthLargestNumber(int[] nums, int k) {
    if (nums.length == 0 || k == 0) {
        return "";
    }
    //创建一个优先队列，为了满足最小堆，实现方法为lambda表达式
    PriorityQueue<String> minHeap = new PriorityQueue<>((a, b) -> (a + b).compareTo(b + a));
    for (int num : nums) {
        String s = String.valueOf(num);
        minHeap.offer(s);
        if (minHeap.size() > k) {
            minHeap.poll();
        }
    }
    StringBuilder sb = new StringBuilder();
    while (!minHeap.isEmpty()) {
        sb.append(minHeap.poll());
    }
    //返回值是sb.reverse()，这里优先队列创建的时候，是按照字典序由大到小的顺序进行排列的，也就是说PriorityQueue中的数字的顺序是由大到小的顺序。
    //那么在出队的时候就是从第一个出队，然后再依次向后出队，所以每一次出队就是从队列的第一个依次的出队，这样的话，出队的顺序就是从最大到最小的顺序。
    //而StringBuilder的append方法是从后往前添加，所以最后出队的时候，第一个就是最后添加到StringBuilder中，就是从小到大添加到StringBuilder中。
    //所以，StringBuilder最后输出来的字符串，就是从小到大的。
    //所以，这里需要使用reverse，反转一下StringBuilder中的字符串，就会变成从大到小的顺序了，所以就是最终的结果。
    return sb.reverse().toString();
}

 //heap的解法
    public static String kthLargestNumber(int[] nums, int k) {
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(k, new Comparator<Integer>(){
            public int compare(Integer o1, Integer o2) {
                String o1String = o1 + "" + o2;
                String o2String = o2 + "" + o1;
                return o1String.compareTo(o2String);
            }
        });
        for (int num : nums) {
            minHeap.offer(num);  //往堆里面添加元素
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!minHeap.isEmpty()) {
            sb.append(minHeap.poll());
        }
        return sb.reverse().toString();
    }

    
}