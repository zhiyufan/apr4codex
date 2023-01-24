package com.codex;

import java.util.*;

public class Solution {
    /*
    leetcode 860. 柠檬水找零
    在柠檬水摊上，每一杯柠檬水的售价为 5 美元。

    顾客排队购买你的产品，（按账单 bills 支付的顺序）一次购买一杯。

    每位顾客只买一杯柠檬水，然后向你付 5 美元、10 美元或 20 美元。你必须给每个顾客正确找零，也就是说净交易是每位顾客向你支付 5 美元。

    注意，一开始你手头没有任何零钱。

    如果你能给每位顾客正确找零，返回 true ，否则返回 false 。
    */
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        int twenty = 0;
        
        for(int bill : bills) {
            if(bill == 5) {
                five++;
            } else if(bill == 10) {
                if(five == 0) {
                    return false;
                }
                five--;
                ten++;
            } else if(bill == 20) {
                if(ten > 0 && five > 0) {
                    ten--;
                    five--;
                    twenty++;
                } else if(ten == 0 && five >= 3) {
                    five -= 3;
                    twenty++;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    /*
    leetcode 986. 区间列表的交集
    给定两个由一些 闭区间 组成的列表，每个区间列表都是成对不相交的，并且已经排序。

    返回这两个区间列表的交集。
    */
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        int ci = 0, cj = 0;
        List<int[]> res = new ArrayList<>();
        
        while(ci < A.length && cj < B.length) {
            int start = Math.max(A[ci][0], B[cj][0]);
            int end = Math.min(A[ci][1], B[cj][1]);
            if(start <= end) {
                res.add(new int[]{start, end});
            }
            if (A[ci][1] < B[cj][1]) {
                ci++;
            } else {
                cj++;
            }
        }
        return res.toArray(new int[res.size()][2]);
    }

    /*
    leetcode 919. 完全二叉树插入器
    考虑一个二叉树上有以下几个方法：

    insert(int val): 将一个值插入到二叉树中
    get_root(): 返回根节点
    完全二叉树的定义如下：在完全二叉树中，除了最底层节点可能没填满外，
    其余每层节点数都达到最大值，并且最下面一层的节点都集中在该层最左边的若干位置。
    若最底层为第 h 层，则该层包含 1~ 2h 个节点。
    */
    public class CBTInserter {
        
        private TreeNode root;
        private TreeNode parent;
        private int index = 0;
        
        public CBTInserter(TreeNode root) {
            this.root = root;
        }
        
        public int insert(int v) {
            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);
            while(!q.isEmpty()) {
                int size = q.size();
                while(size-- > 0) {
                    TreeNode cur = q.poll();
                    if(cur.left != null) {
                        q.offer(cur.left);
                    } else {
                        cur.left = new TreeNode(v);
                        return cur.val;
                    }
                    if(cur.right != null) {
                        q.offer(cur.right);
                    } else {
                        cur.right = new TreeNode(v);
                        return cur.val;
                    }
                }
            }
            return -1;
        }
        
        public TreeNode get_root() {
            return root;
        }
    }

    /*
    lintcode 1427. 查找最小的K个数
    给出一个整数数组，找出最小的k个数。
    */
    public int[] kSmallestNumbers(int[] nums, int k) {
        Queue<Integer> maxHeap = new PriorityQueue<>(k, new Comparator<Integer>(){
            @Override
            public int compare(Integer a, Integer b) {
                return b - a;
            }
        });
        for(int num : nums) {
            if(maxHeap.size() < k) {
                maxHeap.add(num);
            } else {
                if(maxHeap.peek() > num) {
                    maxHeap.poll();
                    maxHeap.add(num);
                }
            }
        }
        int[] res = new int[k];
        int i = 0;
        while(!maxHeap.isEmpty()) {
            res[i++] = maxHeap.poll();
        }
        return res;
    }

    /*
    lintcode 1428. 做作业 
    你的 N 名学生的作业写了错误，请你帮助他们修改错误。
    */
    public static long minimalKSum(int[] nums, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : nums) {
            pq.add(num);
        }
        for(int i = 1; i <= k; i++) {
            if(pq.peek() < i) {
                pq.add(i);
            }
        }
        long sum = 0;
        while(!pq.isEmpty()) {
            sum += pq.poll();
        }
        return sum;
    }

    
}