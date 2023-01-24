package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

public class TimeRequiredToBuy {

  public static int timeRequiredToBuy(int[] tickets, int k) {
    int ticketCount = 0;
    Queue<Integer> queue = new LinkedList<>();
    for (int i = 0; i < tickets.length; i++) {
      queue.add(tickets[i]);
      ticketCount += tickets[i];
    }
    int seconds = 0;
    while (!queue.isEmpty()) {
      int person = queue.remove();
      if (person == 0)
        continue;
      if (k == 0) {
        seconds += person;
        queue.add(person);
        k = queue.size() - 1;
      } else {
        queue.add(person - 1);
        seconds++;
        k--;
      }
    }
    if (ticketCount == 0) {
      return seconds - 1;
    } else {
      return seconds;
    }
  }
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    for (int i = 0; i < t; i++) {
      int n = scanner.nextInt();
      int k = scanner.nextInt();
      int[] tickets = new int[n];
      for (int j = 0; j < n; j++) {
        tickets[j] = scanner.nextInt();
      }
      int time = timeRequiredToBuy(tickets, k);
      System.out.println(time);
      if (scanner.hasNext()) {
        scanner.nextLine();
        }
      if (scanner.hasNextLine()) {
        scanner.nextLine();
      }
    }

  }
}
}