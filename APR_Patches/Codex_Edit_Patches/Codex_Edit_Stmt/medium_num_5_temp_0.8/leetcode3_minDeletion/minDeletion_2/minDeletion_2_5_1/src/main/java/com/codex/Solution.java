package com.codex;

import java.util.*;

public class Solution {
    public static int numRescueBoats(int[] people, int limit) {
            
            Arrays.sort(people);
            int result = 0;
        

            int head = 0;
            int tail = people.length - 1;
            while (head <= tail) {
                result++;
                if (people[head] + people[tail] <= limit) {
                    head++;
                }
                tail--;
            }
            return result;
        }

        public static int numRescueBoats(int[] people, int limit) {
            
            Arrays.sort(people);
            int result = 0;
        

            int head = 0;
            int tail = people.length - 1;
            while (head <= tail) {
                result++;
                if (people[head] + people[tail] <= limit) {
                    head++;
                }
                tail--;
            }
            return result;
        }

            
    }
}