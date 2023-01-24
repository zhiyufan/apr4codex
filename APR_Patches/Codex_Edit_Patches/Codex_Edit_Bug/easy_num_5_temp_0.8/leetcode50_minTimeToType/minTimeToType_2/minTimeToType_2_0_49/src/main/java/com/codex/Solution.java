package com.codex;

import java.util.*;

public class Solution {
    public static int minTimeToType(String word) {
        

                if (word == null || word.length() == 0) {
            return 0;
        }

        int res = 0, len = word.length();
        int cur = 0;

        for (int i = 0; i < len; i++) {


    public int[] findRedundantConnection(int[][] edges) {
      

        Map<Integer, DSet> map = new HashMap<>();

        for (int i = 0; i < edges.length; i++) {
            int[] edge = edges[i];

            int from = edge[0];
            int to = edge[1];

            if (!map.containsKey(from)) {
                map.put(from, new DSet(from));
            }

            if (!map.containsKey(to)) {
                map.put(to, new DSet(to));
            }

            if (!merge(map.get(from), map.get(to))) {
                return edge;
            }
        }

        return null;
    }

    private boolean merge(DSet d1, DSet d2) {
        DSet root1 = getRoot(d1);
        DSet root2 = getRoot(d2);

        if (root1.val == root2.val) {
            return false;
        }

        if (root1.size > root2.size) {
            root1.size += root2.size;
            root2.parent = root1;
        } else {
            root2.size += root1.size;
            root1.parent = root2;
        }

        return true;
    }

    private DSet getRoot(DSet dset) {
        while (dset.parent != null) {
            dset.parent = dset.parent.parent;
            dset = dset.parent;
        }

        return dset;
    }

    class DSet {
        int val;
        int size;
        DSet parent;

        public DSet(int v) {
            val = v;
            size = 1;
            parent = null;
        }

        @Override
        public String toString() {
            return String.valueOf(val);
        }
    }
            int next = word.charAt(i) - 'a';
            res += Math.min(Math.abs(next - cur), 26 - Math.abs(next - cur));
            cur = next;
        }

        return res;
    }

    
}