package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long num) {
        
        String s = String.valueOf(num);
        char[] c = s.toCharArray();
        Arrays.sort(c);
        String newS = new String(c);
        if (newS.charAt(0) == '0') {
            boolean firstNotZero = false;
            int i = 0;
            while (!firstNotZero) {
                if (newS.charAt(i) != '0') {
                    firstNotZero = true;
                    char temp = newS.charAt(0);
                    newS = newS.substring(0, i) + temp + newS.substring(i + 1);
                    newS = newS.substring(1);
                } else {
                    i++;
                }
            }
        }
        return Long.parseLong(newS);
    }
        
        
        
        final int N = 1000;
    final int D = 1000000;
    final int STEPS = 200;
    private Reader r;
    private Writer w;


    public Solver(Reader r, Writer w) {
        this.r = r;
        this.w = w;
    }
    
    public void solve() throws IOException {
        int elements = r.nextInt();
        int steps = r.nextInt();

        // initialize result
        long[][] res = new long[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                res[i][j] = 0;
            }
        }
        // read data
        for (int i = 0; i < elements; i++) {
            int x = r.nextInt();
            int y = r.nextInt();
            res[x - 1][y - 1] = r.nextLong();
        }
        // execute steps
        for (int step = 0; step < steps; step++) {
            long[][] res1 = new long[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    res1[i][j] = 0;
                }
            }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    for (int di = -1; di <= 1; di++) {
                        for (int dj = -1; dj <= 1; dj++) {
                            if (di != 0 || dj != 0) {
                                long val = (res[i][j] * 25) % D;
                                res1[(i + di + N) % N][(j + dj + N) % N] = (res1[(i + di + N) % N][(j + dj + N) % N] + val);
                            }
                        }
                    }
                }
            }
            res = res1;
        }
        // write results
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j > 0) w.write(' ');
                w.write(res[i][j]);
            }
            w.write('\n');
        }
        w.flush();
    }

    public static void main(String[] args) throws IOException {
        solve(args.length == 0 ? 0 : Integer.parseInt(args[0]));
    }

    public static void solve(int testNumber) throws IOException {
        String in = String.format("res/sample%d.in", testNumber);
        String out = String.format("res/sample%d.out", testNumber);
        Reader r = new Reader(in);
        Writer w = new Writer(out);
        new Solver(r, w).solve();
        r.close();
        w.close();
    }

    static class Reader {
        BufferedInputStream in;

        final int bufSize = 1 << 16;
        final byte b[] = new byte[bufSize];

        Reader( String fileName ) throws FileNotFoundException {
            in = new BufferedInputStream(new FileInputStream(fileName));
        }

        int nextInt() throws IOException {
            int c;
            while ((c = nextChar()) <= 32)
                ;
            int x = 0, sign = 1;
            if (c == '-') {
                sign = -1;
                c = nextChar();
            }
            while (c >= '0') {
                x = x * 10 + (c - '0');
                c = nextChar();
            }
            return x * sign;
        }

        StringBuilder _buf = new StringBuilder();

        String nextWord() throws IOException {
            int c;
            _buf.setLength(0);
            while ((c = nextChar()) <= 32 && c != -1)
                ;
            if (c == -1)
                return null;
            while (c > 32) {
                _buf.append((char)c);
                c = nextChar();
            }
            return _buf.toString();
        }

        int bn = bufSize, k = bufSize;

        int nextChar() throws IOException {
            if (bn == k) {
                k = in.read(b, 0, bufSize);
                bn = 0;
            }
            return bn >= k ? -1 : b[bn++];
        }

        int nextNotSpace() throws IOException {
            int ch;
            while ((ch = nextChar()) <= 32 && ch != -1)
                ;
            return ch;
        }

        void skipLine() throws IOException {
            while (nextNotSpace() != '\n')
                ;
        }

        String nextLine() throws IOException {
            int c;
            _buf.setLength(0);
            while ((c = nextChar()) != '\n' && c != -1) {
                if (c != '\r') _buf.append((char)c);
            }
            return _buf.toString();
        }

        long nextLong() throws IOException {
            int c;
            while ((c = nextChar()) <= 32)
                ;
            long x = 0;
            boolean minus = false;
            if (c == '-') {
                minus = true;
                c = nextChar();
            }
            while (c >= '0') {
                x = 10 * x + (c - '0');
                c = nextChar();
            }
            return minus ? -x : x;
        }

        double nextDouble() throws IOException {
            return Double.parseDouble(nextWord());
        }

        void close() throws IOException {
            in.close();
        }
    }

    static class Writer {
        BufferedOutputStream out;

        final int bufSize = 1 << 16;
        int n;
        byte b[] = new byte[bufSize];

        Writer( String fileName ) throws FileNotFoundException {
            out = new BufferedOutputStream(new FileOutputStream(fileName));
        }

        byte c[] = new byte[20];
        void print( int x ) throws IOException {
            int cn = 0;
            if (n + 20 >= bufSize)
                flush();
            if (x < 0) {
                b[n++] = (byte)('-');
                x = -x;
            }
            while (cn == 0 || x != 0) {
                c[cn++] = (byte)(x % 10 + '0');
                x /= 10;
            }
            while (cn-- > 0)
                b[n++] = c[cn];
        }

        void print( char x ) throws IOException {
            if (n == bufSize)
                flush();
            b[n++] = (byte)x;
        }

        void print( String s ) throws IOException {
            for (int i = 0; i < s.length(); i++)
                print(s.charAt(i));
        }
        void println( String s ) throws IOException {
            print(s);
            println();
        }

        static final String newLine = System.getProperty("line.separator");
        void println() throws IOException {
            print(newLine);
       

    
}