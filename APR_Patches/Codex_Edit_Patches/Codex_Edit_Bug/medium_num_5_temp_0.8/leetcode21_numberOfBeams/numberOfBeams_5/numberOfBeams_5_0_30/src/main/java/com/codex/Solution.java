package com.codex;

import java.util.*;

public class Solution {
    public static int numberOfBeams(String[] bank) {
        

        int n = bank.length;
        int m = bank[0].length();
        int[] ones = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (bank[i].charAt(j) == '1') {
                    ones[i]++;
                }
            }
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            if (ones[i] > 1) {
                res += ones[i] * (ones[i] - 1) / 2;
            }

            for (int j = i + 1; j < n; j++) {
                if (ones[j] == 0) {
                    res += ones[i];
                }
            }
        }

        return res;










   import java.util.*;

public class Main {
    static class Trie {
        Trie[] next;
        int cnt;

        Trie() {
            next = new Trie[26];
        }

        void add(String s) {
            Trie curr = this;
            for (char ch : s.toCharArray()) {
                if (curr.next[ch - 'a'] == null) {
                    curr.next[ch - 'a'] = new Trie();
                }
                curr = curr.next[ch - 'a'];
            }
            curr.cnt++;
        }

        Trie get(char c) {
            return next[c - 'a'];
        }
    }

    public static int numberOfBeams(String[] bank) {
        Trie trie = new Trie();
        int m = bank[0].length();

        for (String s : bank) {
            trie.add(s);
        }

        int res = 0;
        for (String s : bank) {
            Trie curr = trie;
            int cnt = 0;
            for (int i = 0; i < m; i++) {
                char ch = s.charAt(i);
                if (ch == '1') {
                    res += cnt;
                    if (curr.get(ch) == null || curr.get(ch).cnt == 0) {
                        break;
                    }
                    cnt++;
                    curr = curr.get(ch);
                    curr.cnt--;
                } else {
                    if (curr.get(ch) != null) {
                        curr = curr.get(ch);
                        cnt = 0;
                    }
                }
            }
        }

        return res;
    }

    // DO NOT MODIFY CODE BELOW THIS LINE!
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;
        ArrayList<String> lines = new ArrayList<String>();
        while(!(s = in.nextLine()).equals("")) lines.add(s);
        String[] bank = lines.toArray(new String[0]);
        in.close();

        System.out.println(numberOfBeams(bank));
    }
}
    }


    
}