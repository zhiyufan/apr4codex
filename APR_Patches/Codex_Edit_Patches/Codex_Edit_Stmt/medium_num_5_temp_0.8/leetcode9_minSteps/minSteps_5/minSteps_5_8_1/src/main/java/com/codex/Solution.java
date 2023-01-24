package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int index = 0;
        while (index < bits.length - 1) {
            index += bits[index] + 1;
        }
        return index == bits.length - 1;
    }

}
}