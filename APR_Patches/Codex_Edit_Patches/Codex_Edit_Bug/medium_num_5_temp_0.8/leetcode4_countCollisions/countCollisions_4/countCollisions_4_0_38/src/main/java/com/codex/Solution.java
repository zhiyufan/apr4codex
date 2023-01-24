package com.codex;

import java.util.*;

public class Solution {
public static int countCollisions(String directions) {

  int collisions = 0;
  
  char[] dirs = directions.toCharArray();
  int left = 0;
  int right = 0;
  int up = 0;
  int down = 0;
  
  for (int i = 0; i < dirs.length; i++) {
    if (dirs[i] == 'L') {
      left++;
    }
    if (dirs[i] == 'R') {
      right++;
    }
    if (dirs[i] == 'U') {
      up++;
    }
    if (dirs[i] == 'D') {
      down++;
    }
  }
  
  int lr = left > right ? right : left;
  int ud = up > down ? down : up;
  collisions = lr * 2 + ud * 2;
  
  int leftUp = left > right ? right : left;
  int rightDown = right > up ? up : right;
  if (leftUp < rightDown) {
    collisions += leftUp * 2;
  } else {
    collisions += rightDown * 2;
  }
  
  return collisions;
}

public static int countCollisions1(String directions) {

  int totalCollision = 0;

  char[] dirs = directions.toCharArray();
  for (int i = 0; i < dirs.length; i++) {
    for (int j = i+1; j < dirs.length; j++) {
      if (dirs[i] == dirs[j]) {
        break;
      } else {
        if (dirs[i] != 'S' && dirs[j] != 'S') {
          totalCollision += 2;
          dirs[i] = 'S';
          dirs[j] = 'S';
        } else {
          totalCollision += 1;
          if (dirs[i] != 'S') {
            dirs[i] = 'S';
          }
          if (dirs[j] != 'S') {
            dirs[j] = 'S';
          }
        }
      }
      break;

        return totalCollision;
    }

    }
  }

  return totalCollision;
}
}