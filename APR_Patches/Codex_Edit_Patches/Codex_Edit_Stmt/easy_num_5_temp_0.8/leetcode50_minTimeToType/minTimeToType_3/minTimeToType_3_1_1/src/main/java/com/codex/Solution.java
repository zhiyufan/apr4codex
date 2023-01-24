package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public int minTimeToType(String sentence, int rows, int cols) {
        int ans = 0;
        HashMap<Character, int[]> pos = new HashMap();
        char[][] board = new char[rows][cols];
        int i = 0, j = 0;
        while(i < rows){
            while(j < cols){
                board[i][j] = (char)('a' + (i * cols + j));
                pos.put(board[i][j], new int[]{i, j});
                j++;
            }
            j = 0;
            i++;
        }
        i = 0;
        j = 0;
        int start = 0;
        while(start < sentence.length()){
            ans += Math.abs(i - pos.get(sentence.charAt(start))[0]) + Math.abs(j - pos.get(sentence.charAt(start))[1]);
            i = pos.get(sentence.charAt(start))[0];
            j = pos.get(sentence.charAt(start))[1];
            start++;
        }
        return ans + rows;
    }

}
}