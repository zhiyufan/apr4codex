package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

public class Main {
  public static void main(String[] args) {
    // Longest: 7156945488
    // Shortest: 1234
    String[] input = new String[] {"715694548", "5016", "43250", "1234", "482", "1"};
    // String[] input = new String[] {"715694548", "5016", "43250", "1234", "482", "1", "7156945488"};

    Queue<String> pq = new PriorityQueue<>(input.length, (a, b) -> (b + a).compareTo(a + b));
    for (String s : input) {
      pq.offer(s);
    }

    System.out.println(pq);

    List<String> res = new ArrayList<>();
    while (!pq.isEmpty()) {
      res.add(pq.poll());
    }
    Collections.reverse(res);
    System.out.println(res);
    System.out.println(String.join("", res));
  }
}
}