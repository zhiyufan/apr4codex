package com.codex;

import java.util.*;

public class Solution {
    public static int eliminateMaximum(int[] dist, int[] speed) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < dist.length; i++) {
            pq.add(dist[i] * speed[i]);
        }
        int count = 0;
        int charge = 0;
        while (!pq.isEmpty()) {
            charge += pq.poll();
            count++;
            if (charge < 0) {
                break;
            }
        }
        return count;
    }






public static List<String> sequence = new ArrayList<>();

    public static List<String> findPossible(String str, int curr) {
        if (curr == 5) {
            sequence.add(str + "*");
        } else {
            findPossible(str + "0", curr + 1);
            findPossible(str + "1", curr + 1);
        }
        return sequence;
    }

    public static void findSolutions(int[][] nums) {
        List<String> sequences = findPossible("", 0);
        int count = 0;
        for (String str : sequences) {
            Set<Integer> rows = new HashSet<>();
            Set<Integer> cols = new HashSet<>();
            Set<Integer> d1 = new HashSet<>();
            Set<Integer> d2 = new HashSet<>();
            boolean valid = true;

            for (int i = 0; i < 5; i++) {
                if (str.charAt(i) == '1') {
                    if (!rows.add(nums[i][0])) {
                        valid = false;
                        break;
                    }
                    if (!cols.add(nums[i][1])) {
                        valid = false;
                        break;
                    }
                    if (!d1.add(nums[i][0] - nums[i][1])) {
                        valid = false;
                        break;
                    }
                    if (!d2.add(nums[i][0] + nums[i][1])) {
                        valid = false;
                        break;
                    }
                }
            }
            if (valid) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[][] nums = new int[num][2];
        for (int i = 0; i < num; i++) {
            nums[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        findSolutions(nums);
    }

    
}