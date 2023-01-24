package com.codex;

import java.util.*;

public class Solution {
public class Solution {
  // DO NOT MODIFY THE LIST. IT IS READ ONLY
  public int singleNumber(final List<Integer> A) {
    if (A == null || A.size() == 0) return 0;

    int result = 0;
    for (int index = 0; index < A.size(); index++) {
      result ^= A.get(index);
    }

    return result;
  }
}

public class Solution {
  // DO NOT MODIFY THE LIST. IT IS READ ONLY
  public int singleNumber(final List<Integer> A) {
    if (A == null || A.size() == 0) return 0;

    int result = A.get(0);
    for (int index = 1; index < A.size(); index++) {
      result = result ^ A.get(index);
    }

    return result;
  }
}

public class Solution {
  // DO NOT MODIFY THE LIST. IT IS READ ONLY
  public int singleNumber(final List<Integer> A) {
    if (A == null || A.size() == 0) return 0;

    int result = A.get(0);
    for (int index = 1; index < A.size(); index++) {
      result = result ^ A.get(index);
    }

    return result;
  }
}

public class Solution {
  // DO NOT MODIFY THE LIST. IT IS READ ONLY
  public int singleNumber(final List<Integer> A) {
    if (A == null || A.size() == 0) return 0;

    int result = A.get(0);
    for (int index = 1; index < A.size(); index++) {
      result = result ^ A.get(index);
    }

    return result;
  }
}

public class Solution {
  // DO NOT MODIFY THE LIST. IT IS READ ONLY
  public int singleNumber(final List<Integer> A) {
    if (A == null || A.size() == 0) return 0;

    int result = A.get(0);
    for (int index = 1; index < A.size(); index++) {
      result = result ^ A.get(index);
    }

    return result;
  }
}

public class Solution {
  // DO NOT MODIFY THE LIST. IT IS READ ONLY
  public int singleNumber(final List<Integer> A) {
    if (A == null || A.size() == 0) return 0;

    int result = A.get(0);
    for (int index = 1; index < A.size(); index++) {
      result = result ^ A.get(index);
    }

    return result;
  }
}

public class Solution {
  // DO NOT MODIFY THE LIST. IT IS READ ONLY
  public int singleNumber(final List<Integer> A) {
    if (A == null || A.size() == 0) return 0;

    int result = A.get(0);
    for (int index = 1; index < A.size(); index++) {
      result = result ^ A.get(index);
    }

    return result;
  }
}

public class Solution {
  // DO NOT MODIFY THE LIST. IT IS READ ONLY
  public int singleNumber(final List<Integer> A) {
    if (A == null || A.size() == 0) return 0;

    int result = A.get(0);
    for (int index = 1; index < A.size(); index++) {
      result = result ^ A.get(index);
    }

    return result;
  }
}

public class Solution {
  // DO NOT MODIFY THE LIST. IT IS READ ONLY
  public int singleNumber(final List<Integer> A) {
    if (A == null || A.size() == 0) return 0;

    int result = 0;
    int hasSingle = 0;
    for (int index = 0; index < A.size(); index++) {
      if (result == A.get(index)) {
        hasSingle = 1;
      } else if (hasSingle == 1) {
        result = A.get(index);
        hasSingle = 0;
      }
    }

    return result;
  }
}

public class Solution {
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for (int n: nums1) {
            set1.add(n);
        }
        for (int n: nums2) {
            if (set1.contains(n)) {
                set2.add(n);
            }
        }
        for (int n: nums3) {
            if (set1.contains(n)) {
                set2.add(n);
            }
        }
        
        return new ArrayList<>(set2);
    }
    
    
}