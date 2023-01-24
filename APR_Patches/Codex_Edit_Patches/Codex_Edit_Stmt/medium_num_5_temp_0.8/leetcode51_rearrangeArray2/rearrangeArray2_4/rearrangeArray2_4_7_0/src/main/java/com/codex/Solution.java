package com.codex;

import java.util.*;

public class Solution {
    public static int[] rearrangeArray2(int[] nums) {
        
        double avg = aver(nums);
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (num == avg) continue;
            list.add(num);
        }

        int[] ans = new int[nums.length];
        int index = 0;
        int[] a = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            a[i] = list.get(i);
        }
        Arrays.sort(a);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == avg) {
                ans[i] = a[a.length - 1];
                a[a.length - 1] = 0;
            } else {
                ans[i] = a[index++];
            }
        }
        return ans;
    }

    private static double aver(int[] nums) {
        double sum = 0.0;
        for (int num : nums) {
            sum += num;
        }

    
    		HW.Graph graph = new HW.Graph("/Users/apple/Desktop/WX/Algorithm/Algorithm/src/HW/tinyG.txt", " ");
        System.out.println(graph);
        
        System.out.println("********************");
        DepthFirstPaths path = new DepthFirstPaths(graph, 5);
        System.out.println(path.hasPathTo(4));
        for (int w : path.pathTo(4)) {
            System.out.println(w);
        }
        
        System.out.println("********************");
        CC cc = new CC(graph);
        System.out.println(cc.count());
        System.out.println(cc.connected(1,4));
        for (int w : cc.adj(4)) {
            System.out.println(w);
        }
        return sum / nums.length;
    
    }

    
}