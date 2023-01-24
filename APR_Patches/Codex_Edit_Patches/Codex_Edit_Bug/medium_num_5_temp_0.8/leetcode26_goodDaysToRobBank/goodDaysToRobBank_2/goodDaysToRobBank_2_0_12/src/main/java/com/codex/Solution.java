package com.codex;

import java.util.*;

public class Solution {
# Robbing a bank


A bank robbery has been planned and the exact time it will take place is known. The robbers also know how much security is at the bank at each moment in time. However, they want to know exactly when they should *start* to rob the bank to get away with the most amount of money. 

Design a program to figure out the best time slot to rob the bank in each day.

For example, let's say a bank robbery will take exactly 5 minutes and security changes as follows:

| Time (min) | Guard #1 | Guard #2 | Guard #3 | Guard #4 | Guard #5 |
| :--------: | :------: | :------: | :------: | :------: | :------: |
|       0    |    2     |    4     |    3     |    1     |    8     |
|       1    |    2     |    2     |    2     |    2     |    2     |
|       2    |    1     |    4     |    3     |    3     |    7     |
|       3    |    3     |    4     |    3     |    2     |    5     |
|       4    |    2     |    4     |    3     |    3     |    4     |
|       5    |    1     |    4     |    4     |    4     |    3     |

In this case, the best time to rob the bank is at `time = 2`.

| Time (min) | Guard #1 | Guard #2 | Guard #3 | Guard #4 | Guard #5 |
| :--------: | :------: | :------: | :------: | :------: | :------: |
|       0    |    1     |    4     |    3     |    3     |    7     |
|       1    |    1     |    4     |    3     |    3     |    5     |
|       2    |    1     |    4     |    3     |    3     |    4     |
|       3    |    1     |    4     |    3     |    3     |    3     |
|       4    |    1     |    4     |    4     |    4     |    3     |
|       5    |    1     |    4     |    4     |    4     |    3     |
}