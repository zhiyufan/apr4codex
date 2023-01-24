package com.codex;

import java.util.*;

public class Solution {
import java.util.concurrent.atomic.AtomicInteger;

public class VolatileDemo {

  static class Counter {
    static int c = 0;
    static AtomicInteger atomicInteger = new AtomicInteger(0);

    public static void add() {
      c++;
    }

    public static void addAtomic() {
      atomicInteger.getAndIncrement();
    }

    public static int get() {
      return c;
    }

    public static int getAtomic() {
      return atomicInteger.get();
    }
  }

  static class CounterThread implements Runnable {

    static boolean run = true;

    @Override
    public void run() {
      while (run) {
        Counter.addAtomic();
      }
    }
  }

  public static void main(String[] args) throws InterruptedException {

    System.out.println(Counter.getAtomic());
    Thread thread1 = new Thread(new CounterThread());
    thread1.start();
    Thread.sleep(1000);
    CounterThread.run = false;
    thread1.join();
    System.out.println(Counter.getAtomic());
  }
}

    
}