package com.codex;

import java.util.*;

public class Solution {
    public static int numberOfArrays(int[] differences, int lower, int upper) {
        
        int mod = 1000000007;
        int n = differences.length;
        long[] dp = new long[n + 1];
        dp[n] = 1;
        for (int i = n - 1; i >= 0; i--) {
            long sum = 0;
            for (int j = i; j < n; j++) {
                sum += differences[j];
                if (sum >= lower && sum <= upper) {
                    dp[i] = (dp[i] + dp[j + 1]) % mod;
                }
                if (sum > upper) break;
            }
        }
        return (int)dp[0];
    }


        public static List<List<String>> findItinerary(String[][] tickets) {
            if (tickets == null) return new LinkedList<>();
            List<List<String>> res = new LinkedList<>();
            Map<String, PriorityQueue<String>> graph = new HashMap<>();
            for (String[] ticket : tickets) {
                String start = ticket[0];
                String dest = ticket[1];

                if (!graph.containsKey(start)) {
                    graph.put(start, new PriorityQueue<>());
                }
                graph.get(start).offer(dest);
            }
            backtrack("JFK", res, new LinkedList<>(), graph);
            return res;
        }

        private static void backtrack(String start, List<List<String>> res, LinkedList<String> path,
                Map<String, PriorityQueue<String>> graph) {
            if (path.size() == graph.size()) {
                res.add(new LinkedList<>(path));
                return;
            }

            if (graph.containsKey(start) && !graph.get(start).isEmpty()) {
                PriorityQueue<String> neighbors = graph.get(start);
                while (!neighbors.isEmpty()) {
                    String dest = neighbors.poll();
                    path.add(dest);
                    backtrack(dest, res, path, graph);
                    path.removeLast();
                }
                return;
            }
            path.add(start);
            res.add(new LinkedList<>(path));
        }



    public class RandomizedSet {
        private final HashMap<Integer, Integer> map;
        private final List<Integer> list;
        private final Random rand;

        /** Initialize your data structure here. */
        public RandomizedSet() {
            map = new HashMap<>();
            list = new ArrayList<>();
            rand = new Random();
        }

        /**
         * Inserts a value to the set. Returns true if the set did not already contain
         * the specified element.
         */
        public boolean insert(int val) {
            boolean alreadyExists = map.containsKey(val);
            if (alreadyExists)
                return false;

            map.put(val, list.size());
            list.add(list.size(), val);
            return true;
        }

        /**
         * Removes a value from the set. Returns true if the set contained the specified
         * element.
         */
        public boolean remove(int val) {
            boolean alreadyExists = map.containsKey(val);
            if (!alreadyExists)
                return false;

            int index = map.get(val);
            if (index < list.size() - 1) { // not the last one than swap the last one with this val
                int lastone = list.get(list.size() - 1);
                list.set(index, lastone);
                map.put(lastone, index);
            }
            map.remove(val);
            list.remove(list.size() - 1);
            return true;
        }

        /** Get a random element from the set. */
        public int getRandom() {
            int length = list.size();
            int randomIndex = rand.nextInt(length);
            return list.get(randomIndex);
        }
    }
    
    
}