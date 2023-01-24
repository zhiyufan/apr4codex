package com.codex;

import java.util.*;

public class Solution {
    public static int minMoves(int target, int maxDoubles) {
        

        Set<Long> visited = new HashSet<>();
        Queue<Long> q = new LinkedList<>();
        int numMoves = 0;
        q.offer(1L);
        while (!q.isEmpty()) {
            int qSize = q.size();
            for (int i = 0; i < qSize; i++) {
                long cur = q.poll();
                if (cur == target) {
                    return numMoves;
                }
                if (!visited.contains(cur + 1) && (cur + 1) <= target) {
                    visited.add(cur + 1);
                    q.offer(cur + 1);
                }
                if (numMoves < maxDoubles && !visited.contains(cur * 2) && (cur * 2) <= target) {
                    visited.add(cur * 2);
                    q.offer(cur * 2);
                }
            }
            numMoves++;
        }
        return -1;
    }
    
    public int maxPossibleValue(String s) {
        
        int max=0;
        char []c = s.toCharArray();
        Arrays.sort(c);
        int n = c.length;
        int i;
        for(i=0;i<n;i++)
        {
            if(c[i]!='0')
            {
                break;
            }
        }
        swap(c, i, n-1);
        for(int j=0;j<n;j++)
        {
            max = max*10+c[j]-'0';
        }
        return max;
    }
    public void swap(char []c, int i, int j)
    {
        char temp = c[i];
        c[i]=c[j];
        c[j]=temp;
    }
}