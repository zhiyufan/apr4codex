package com.codex;

import java.util.*;

public class Solution {
// N-Ary tree

    public static void main(String[] args) {
        int[][] edges = { { 0, 3 }, { 1, 3 }, { 2, 3 }, { 4, 3 }, { 5, 4 } };
        Solution sol = new Solution();
        Node head = sol.createGraph(edges, 6);
        sol.printGraph(head);
        // Node newNode = new Node(6, null);
        // head.children.add(newNode);
        // sol.printGraph(head);
        sol.printGraphIterative(head);
        sol.printGraphIterativeLevelOrder(head);
    }

    static class Node {
        int val;
        List<Node> children;

        Node() {
        }

        Node(int val) {
            this.val = val;
        }

        Node(int val, List<Node> children) {
            this.val = val;
            this.children = children;
        }
    }

    static class Solution {
        public void printGraphIterativeLevelOrder(Node head) {
            if (head == null)
                return;
            Queue<Node> que = new LinkedList<>();
            que.add(head);
            while (!que.isEmpty()) {
                int size = que.size();
                for (int i = 0; i < size; i++) {
                    Node node = que.poll();
                    System.out.print(node.val + " ");
                    for (Node child : node.children) {
                        que.add(child);
                    }
                }
                System.out.println();
            }
        }

        public void printGraphIterative(Node head) {
            if (head == null)
                return;
            Stack<Node> st = new Stack<>();
            st.push(head);
            while (!st.isEmpty()) {
                Node node = st.pop();
                System.out.print(node.val + " ");
                List<Node> children = node.children;
                for (int i = children.size() - 1; i >= 0; i--) {
                    st.push(children.get(i));
                }
            }
            System.out.println();
        }

        public void printGraph(Node head) {
            if (head == null)
                return;
            System.out.print(head.val + " ");
            for (Node child : head.children)
                printGraph(child);
            System.out.println();
        }

        public Node createGraph(int[][] edges, int n) {
            Node[] nodes = new Node[n];
            for (int i = 0; i < n; i++)
                nodes[i] = new Node(i);
            for (int[] edge : edges) {
                nodes[edge[0]].children.add(nodes[edge[1]]);
            }
            return nodes[0];
        }
    }













































    public static int maxDistance(int[] colors) {
        
        int n = colors.length;
        int[][] range = new int[3][2];
        for (int i = 0; i < 3; i++) {
            range[i] = new int[]{n, -1};
        }
        for (int i = 0; i < n; i++) {
            range[colors[i]][0] = Math.min(range[colors[i]][0], i);
            range[colors[i]][1] = Math.max(range[colors[i]][1], i);
        }
        int minDis = n - 1;
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                minDis = Math.min(minDis, Math.abs(range[i][0] - range[j][1]));
                minDis = Math.min(minDis, Math.abs(range[j][0] - range[i][1]));
            }
        }
        return minDis;
    }
}