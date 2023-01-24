package com.codex;

import java.util.*;

public class Solution {
    public static int smallestChair(int[][] times, int targetFriend) {
        


        int[] arr = new int[times.length];
        for (int i = 0; i < times.length; i++) {
            int arrival = times[i][0];
            int leaving = times[i][1];
            arr[arrival]++;
            arr[leaving]--;
        }

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            cnt += arr[i];
            if (cnt - 1 == targetFriend)
                return i;
        }

        return 0;
    }
#include <stdio.h>
#include <stdlib.h>
typedef struct {
  int chair;
  int cnt;
} chair_info;

int compare(const void *lhs, const void *rhs) {
  int result = 0;
  chair_info *l = *(chair_info **)lhs;
  chair_info *r = *(chair_info **)rhs;
  result = l->cnt - r->cnt;
  if (result == 0)
    result = l->chair - r->chair;
  return result;
}

int main() {
  int N;
  int T;
  scanf("%d%d", &N, &T);
  int i;
  chair_info *chairs[N];
  for (i = 0; i < N; ++i) {
    chair_info *current_chair = (chair_info *)malloc(sizeof(chair_info));
    current_chair->chair = i + 1;
    current_chair->cnt = 0;
    chairs[i] = current_chair;
  }
  for (i = 0; i < T; ++i) {
    int k;
    scanf("%d", &k);
    int j;
    for (j = 0; j < k; ++j) {
      int arrival;
      scanf("%d", &arrival);
      arrival--;
      chairs[arrival]->cnt++;
    }
  }
  qsort((void *)chairs, N, sizeof(chair_info *), compare);
  printf("%d\n", chairs[0]->chair);
  return 0;
}
}