package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

class Main {

    public static String findDifferentBinaryString(String[] nums) {
        int count = 0;
        for (String n : nums) {
            count |= Integer.parseInt(n, 2);
        }

        return Integer.toBinaryString(Integer.MAX_VALUE - count);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        String[] nums = new String[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextLine().trim();
        }

        String res = findDifferentBinaryString(nums);
        System.out.println(res);
    }

    static class FastScanner {
        public static String debug = null;

        private final InputStream in = System.in;
        private int ptr = 0;
        private int buflen = 0;
        private byte[] buffer = new byte[1024];
        private boolean eos = false;

        private boolean hasNextByte() {
            if (ptr < buflen) {
                return true;
            } else {
                ptr = 0;
                try {
                    if (debug != null) {
                        buflen = debug.length();
                        buffer = debug.getBytes();
                        debug = "";
                        eos = true;
                    } else {
                        buflen = in.read(buffer);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (buflen < 0) {
                    eos = true;
                    return false;
                } else if (buflen == 0) {
                    return false;
                }
            }
            return true;
        }

        private int readByte() {
            if (hasNextByte())
                return buffer[ptr++];
            else
                return -1;
        }

        private static boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        public boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr]))
                ptr++;
            return hasNextByte();
        }

        public String next() {
            if (!hasNext())
                throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        public long nextLong() {
            if (!hasNext())
                throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || '9' < b) {
                throw new NumberFormatException();
            }
            while (true) {
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                } else if (b == -1 || !isPrintableChar(b)) {
                    return minus ? -n : n;
                } else {
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }

        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
                throw new NumberFormatException();
            return (int) nl;
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }

}
}