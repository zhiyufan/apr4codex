package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

public class Solution {
    public static int minMoves(int target, int maxDoubles) {

      int moves = 0;
      while (target > 0) {
          if (target % 2 == 0 && maxDoubles > 0) {
              target /= 2;
              maxDoubles--;
          } else {
              target -= 1;
          }
          moves++;
      }
      return moves;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int target = in.nextInt();
    int maxDoubles = in.nextInt();

    int result = minMoves(target, maxDoubles);
    System.out.println(result);
  }
}




/*

  class Solution {
  public static int minMoves(int target, int maxDoubles) {
    if (target % 2 == 1) {

      int moves = 0;
      while (target > 0) {
        if (target % 2 == 0 && maxDoubles > 0) {

          target /= 2;
          maxDoubles--;
        } else {
          target -= 1;
        }
        moves++;
      }
      return moves;
    } else {
      int moves = 0;
      while (target > 0) {
        if (target % 2 == 0 && maxDoubles > 0) {

          target /= 2;
          maxDoubles--;
        } else {
          target -= 1;
        }
        moves++;
      }
      return moves;

    }

  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int target = in.nextInt();
    int maxDoubles = in.nextInt();

    int result = minMoves(target, maxDoubles);
    System.out.println(result);
  }
}
*/
}