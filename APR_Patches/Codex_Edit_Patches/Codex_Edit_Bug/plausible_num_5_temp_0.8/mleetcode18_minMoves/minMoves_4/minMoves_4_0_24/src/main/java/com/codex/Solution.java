package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

import java.util.*;
public class Question {

    public static void main(String[] args) {
        System.out.println(minMoves(63, 3));
    }

        public static int minMoves(int target, int n) {

            Queue<Long> queue = new LinkedList<Long>();
            Set<Long> visited = new HashSet<Long>();
            int step = 0;

            queue.offer((long) 1);
            while (!queue.isEmpty()) {
                int size = queue.size();
                System.out.println(size);
                while (size > 0) {
                    long cur = queue.poll();
                    size--;

                    if (cur == target) {
                        return step;
                    }

                    if (cur * 2 <= target && visited.add(cur * 2)) {
                        queue.offer(cur * 2);
                    }

                    if (cur + 1 <= target && visited.add(cur + 1)) {
                        queue.offer(cur + 1);
                    }
                }
                step++;
            }
            return -1;
        }

    }
}