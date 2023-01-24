package com.codex;

import java.util.*;

public class Solution {
    public void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int targetFriend = in.nextInt();

        for (int i = 0; i < chairs.length; i++) {
            if (chairs[i]) {
                targetFriend--;
            }
            if (targetFriend < 0) {
                return i;
            }
        }
        return -1;
    }

    
}