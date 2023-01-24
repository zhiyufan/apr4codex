package com.codex;

import java.util.*;

public class Solution {
    public int minMoves(int target, int maxStep) {
        int count = 0;

        while (target != 0) {
            target = target % 2 == 0 ? target / 2 : target - 1;
            count++;
            maxStep = target == 0 ? maxStep : maxStep - 1;
            if (maxStep == 0)
                return -1;
        }     

        return count;
    }
}