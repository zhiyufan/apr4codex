package com.codex;

import java.util.*;

public class Solution {
import java.util.HashSet
import java.util.Set;
import java.util.HashSet;
import java.util.List;

class Solution {
    public int[] loudAndRich(int[][] richer, int[] quiet) {
        int[] answer = new int[quiet.length];
        HashSet<Integer> richerSet = new HashSet<>();
        Arrays.fill(answer, -1); // if -1 means no one is louder

        for (int i = 0; i < richer.length; i++) {
            int[] pair = richer[i];
            richerSet.add(pair[1]); // add the rich person
        }

        for (int i = 0; i < quiet.length; i++) {
            if (!richerSet.contains(i)) { // if not rich, it is rich
                answer[i] = i; // the person himself
            }
        }

        for (int i = 0; i < richer.length; i++) {
            update(answer, richer[i][1], richer[i][0], quiet);
        }

        return answer;
    }

    public void update(int[] answer, int target, int source, int[] quiet) {
        if (answer[target] == -1) {
            answer[target] = source;
            return;
        }

        if (quiet[answer[target]] > quiet[source]) {
            answer[target] = source;
        }
        return;
    }
}

    public int[] loudAndRich(int[][] richer, int[] quiet) {
        Map<Integer, List<Integer>> richerMap = new HashMap<Integer, List<Integer>>();
        for (int[] rich : richer) {
            int poor = rich[1];
            int rich = rich[0];

            if (!richerMap.containsKey(poor)) {
                richerMap.put(poor, new ArrayList<Integer>());
            }
            richerMap.get(poor).add(rich);
        }

        int[] answer = new int[quiet.length];
        boolean[] visited = new boolean[quiet.length];
        for (int i = 0; i < quiet.length; i++) {
            answer[i] = -1;
        }

        for (int i = 0; i < quiet.length; i++) {
            if (!visited[i]) {
                dfs(i, answer, quiet, visited, richerMap);
            }
            if (targetFriend < 0) {
                answer[i] = i;
            }
        }
        return answer;
    }


    public void dfs(int person, int[] answer, int[] quiet, boolean[] visited, Map<Integer, List<Integer>> richerMap) {
        if (visited[person]) {
            return;
        }
        visited[person] = true;

        if (richerMap.containsKey(person)) {
            for (int rich : richerMap.get(person)) {
                if (answer[rich] == -1 || quiet[answer[rich]] > quiet[person]) {
                    answer[rich] = person;
                }
                dfs(rich, answer, quiet, visited, richerMap);
            }
        }
    }
}