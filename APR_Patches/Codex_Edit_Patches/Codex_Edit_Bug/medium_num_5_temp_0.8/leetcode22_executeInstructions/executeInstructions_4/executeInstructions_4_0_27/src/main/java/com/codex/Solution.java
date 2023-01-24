package com.codex;

import java.util.*;

public class Solution {
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

                } else if (dir[j] == 'D') {
                    if (row == n - 1 || grid[row + 1][col] == 1) {
                        canMove = false;
                        break;
                    } else {
                        pos[0]++;
                        grid[row + 1][col] = 1;
                    }
                }
            }
            if (canMove) {
                ans[i] = dir.length;
            }
        }
        return ans;
    }

    
}