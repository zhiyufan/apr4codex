package com.codex;

import java.util.*;

public class Solution {
    public boolean judgeCircle(String moves) {
        int move_x = 0;
        int move_y = 0;
        for (int i = 0; i < moves.length(); i++) {
            char player = moves.charAt(i);
            if (player == 'U') {
                move_y--;
            } else if (player == 'D') {
                move_y++;
            } else if (player == 'L') {
                move_x--;
            } else if (player == 'R') {
                move_x++;
            } 
        }
        return move_x == 0 && move_y == 0;
    }
}