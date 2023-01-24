package com.codex;

import java.util.*;

public class Solution {
public static int[][] findFarmland(int[][] land) {
    
    if (land == null || land.length < 1) return new int[][]{};
    Queue<Integer[]> queue = new LinkedList<>();
    boolean[][] visited = new boolean[land.length][land[0].length];
    List<int[]> ls = new ArrayList<>();
    for (int i = 0; i < land.length; i++) {
        for (int j = 0; j < land[i].length; j++) {
            if (visited[i][j]) continue;
            int minI = land.length;
            int minJ = land[0].length;
            int maxI = 0;
            int maxJ = 0;
            queue.offer(new Integer[]{i, j});
            while (!queue.isEmpty()) {
                Integer[] curr = queue.poll();
                if (land[curr[0]][curr[1]] != 1 || visited[curr[0]][curr[1]]) continue;
                visited[curr[0]][curr[1]] = true;
                minI = Math.min(minI, curr[0]);
                minJ = Math.min(minJ, curr[1]);
                maxI = Math.max(maxI, curr[0]);
                maxJ = Math.max(maxJ, curr[1]);
                if (curr[0] - 1 >= 0 && !visited[curr[0] - 1][curr[1]]) {
                    queue.offer(new Integer[]{curr[0] - 1, curr[1]});
                }
                if (curr[1] - 1 >= 0 && !visited[curr[0]][curr[1] - 1]) {
                    queue.offer(new Integer[]{curr[0], curr[1] - 1});
                }
                if (curr[0] + 1 < land.length && !visited[curr[0] + 1][curr[1]]) {
                    queue.offer(new Integer[]{curr[0] + 1, curr[1]});
                }
                if (curr[1] + 1 < land[curr[0]].length && !visited[curr[0]][curr[1] + 1]) {
                    queue.offer(new Integer[]{curr[0], curr[1] + 1});
                }
            }
            if (maxI - minI > 0 || maxJ - minJ > 0) {
                ls.add(new int[]{minI, minJ, maxI, maxJ});
            }
        }
    }
    return ls.toArray(new int[0][0]);
}


//minimum rectangle

int[] array =new int[]{1,2,3,4,5,6,7,8,9,10};
int[] result = new int[array.length - k + 1];
int left = 0;
int right = 0;
int min = array[0];
for (int i = 0; i < k; i++) {
    min = Math.min(min, array[i]);
}

result[left++] = min;
while (right < array.length - k) {
    if (array[right+1] < min) {
        min = array[right+1];
    }
    result[left++] = min;
    if (array[right - k + 1] == min) {
        min = array[right - k + 1];
        for (int i = right - k + 2; i <= right; i++) {
            min = Math.min(min, array[i]);
                }
            }
        }
        right++;
    }

}

return result;
}