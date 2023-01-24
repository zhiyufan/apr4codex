package com.codex;

import java.util.*;

public class Solution {
package com.mycompany.myapp;

public class AtomicLongTest {

    public static void main(String[] args) {
        final AtomicLong counter = new AtomicLong(0);
        final AtomicLong counter2 = new AtomicLong(10);

        // Start the threads
        new Thread(new Runnable() {
            public void run() {
                //increment counter in every 100 ms
                while (counter.get() < 10) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                    counter.incrementAndGet();
                }
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                //decrement counter2 in every 100 ms
                while (counter2.get() > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                    counter2.decrementAndGet();
                }
            }
        }).start();

        while (counter.get() > 0 || counter2.get() > 0) {
            System.out.println("counter:" + counter.get() + " counter2:" + counter2.get());
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
}