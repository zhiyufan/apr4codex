package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public String minNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return "";
        }
        PriorityQueue<Node> minHeap = new PriorityQueue<>(new Comparator<Node>() {
            @Override
            public int compare(Node n1, Node n2) {
                return (n1.value + n1.nextValue) - (n2.value + n2.nextValue);
            }
        });

        for (int num : nums) {
            Node cur = new Node(num, 0);
            if (cur.nextIndex < cur.getLength()) {
                minHeap.offer(cur);
            } else {
                minHeap.offer(new Node(num, 0));
            }
        }
        StringBuilder sbd = new StringBuilder();
        while (!minHeap.isEmpty()) {
            Node cur = minHeap.poll();
            sbd.append(cur.value);
            if (cur.nextIndex < cur.getLength()) {
                minHeap.offer(cur);
            }
        }
        return sbd.toString();
    }
    }


class Node {
    int value;
    int nextIndex;
    int nextValue;

    public Node(int value, int nextIndex) {
        this.value = value;
        this.nextIndex = nextIndex;
        this.nextValue = getNextValue();
    }

    public int getNextValue() {
        String s = String.valueOf(value);
        return (nextIndex >= s.length()) ? -1 : s.charAt(nextIndex) - '0';
    }

    public int getLength() {
        return String.valueOf(value).length();
    }
}
}