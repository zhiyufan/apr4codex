package com.codex;

import java.util.*;

public class Solution {
class Main {
  public static int countCollisions(String directions) {
        int result = 0;
        char[] chars = directions.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            char c = characters[i];
            if (c == 'L' || c == 'R') {
                continue;
            }
            for (int j = i + 1; j < characters.length; j++) {
                if (characters[j] == 'L' || characters[j] == 'R') {
                    continue;
                }
                if (c == characters[j]) {
                    result++;
                } else if (c == 'S' && characters[j] == 'S') {
                    result++;
                }
            }
        }
        return result;
    }
        return result;
    }
}
}