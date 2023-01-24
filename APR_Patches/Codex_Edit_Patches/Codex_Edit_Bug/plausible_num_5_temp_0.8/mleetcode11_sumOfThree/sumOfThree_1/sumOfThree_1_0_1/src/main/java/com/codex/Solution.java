package com.codex;

import java.util.*;

public class Solution {
public static long[] sumOfThree(long num) {

  List<Long> result = new ArrayList<>();
  if (num < 3) {
      return new long[0];
  }
  long low = 1;
  long high = 2;

  long sum = 3;

  while (high < num) {
      if (sum < num) {
          high++;
          sum += high;
      } else if (sum > num) {
          sum -= low;
          low++;
      } else {
          for (long i = low; i <= high; i++) {
              result.add(i);
          }
          break;
      }
  }
  if (!result.isEmpty()) {
      return result.stream().mapToLong(i -> i).toArray();
  }

  return new long[0];
}

// this solution is just one of the possible solution
// write your own so you don't forget.

// Review this solution if you want to see another way of doing it.

// Notice that the way the algorithm is set up, you can never have
// sum > num. This has to be the case since when you subtract from the
// sum and add to the sum. You increment and decrement the numbers
// by 1. This is the condition for the solution to work.

// public static long[] sumOfThree(long num) {
//     long sum = 0;
//     List<Long> result = new ArrayList<>();
//     for (long n = 1; n <= num && sum <= num; n++) {
//         sum += n;
//         result.add(n);
//     }
//     if (sum == num) {
//         return result.stream().mapToLong(i -> i).toArray();
//     } else {
//         return new long[0];
//     }
// }

// This is another solution you can try
// public static long[] sumOfThree(long num) {
//     List<Long> result = new ArrayList<>();
//     if (num < 3) {
//         return new long[0];
//     }
//     long low = 1;
//     long high = 2;

//     long sum = 3;

//     while (high < num) {
//         if (sum < num) {
//             high++;
//             sum += high;
//         } else if (sum > num) {
//             sum -= low;
//             low++;
//         } else {
//             for (long i = low; i <= high; i++) {
//                 result.add(i);
//             }
//             break;
//         }
//     }
//     if (result.size() == 0) {
//         return new long[0];
//     } else {
//         return result.stream().mapToLong(i -> i).toArray();
//     }

// }

// public static long[] sumOfThree(long num) {
//     long sum = 3;
//     int right = 2;
//     int left = 1;
//     List<Long> result = new ArrayList<>();
//     while (sum != num) {
//         if (sum < num) {
//             right++;
//             sum += right;
//             if (sum > num) {
//                 sum -= left;
//                 left++;
//             }
//         } else if (sum > num) {
//             sum -= left;
//             left++;
//         }
//     }
//     for (long i = left; i <= right; i++) {
//         result.add(i);
//     }
//     if (result.size() == 0) {
//         return new long[0];
//     } else {
//         return result.stream().mapToLong(i -> i).toArray();
//     }

// }

public static void main(String[] args) {
    for (long i : sumOfThree(6)) {
        System.out.print(i + " ");
    }

    System.out.println("\n");

    for (long i : sumOfThree(9)) {
        System.out.print(i + " ");
    }

    System.out.println("\n");

    for (long i : sumOfThree(12)) {
        System.out.print(i + " ");
    }

    System.out.println("\n");

    for (long i : sumOfThree(15)) {
        System.out.print(i + " ");
    }

    System.out.println("\n");

    for (long i : sumOfThree(25)) {
        System.out.print(i + " ");
    }

    System.out.println("\n");

    for (long i : sumOfThree(3)) {
        System.out.print(i + " ");
    }
}

// The main method just prints out the results of the program.

// public static void main(String[] args) {
//     for (long i : sumOfThree(6)) {
//         System.out.print(i + " ");
//     }

//     System.out.println("\n");

//     for (long i : sumOfThree(9)) {
//         System.out.print(i + " ");
//     }

//     System.out.println("\n");

//     for (long i : sumOfThree(12)) {
//         System.out.print(i + " ");
//     }

//     System.out.println("\n");

//     for (long i : sumOfThree(15)) {
//         System.out.print(i + " ");
//     }

//     System.out.println("\n");

//     for (long i : sumOfThree(25)) {
//         System.out.print(i + " ");
//     }

//     System.out.println("\n");

//     for (long i : sumOfThree(3)) {
//         System.out.print(i + " ");
//     }
// }


































































































































































        }
        long low = 1;
        long high = 2;

        long sum = 3;

        while (high < num) {
            if (sum < num) {
                high++;
                sum += high;
            } else if (sum > num) {
                sum -= low;
                low++;
            } else {
                for (long i = low; i <= high; i++) {
                    result.add(i);
                }
                break;
            }
        }

        return result.stream().mapToLong(i -> i).toArray();
    }

    
}