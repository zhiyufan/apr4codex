package com.codex;

import java.util.*;

public class Solution {
import java.util.Scanner;
class Main {
    public static int lucky(int k) {
        

        int result = 0;
        for (int i = 0; i <= k; i++) {
            int temp = 0;
            while (result > 0) {
                temp += result % 10;
                result /= 10;
            }
            result = temp;
        }
        return result;
    }

    
}