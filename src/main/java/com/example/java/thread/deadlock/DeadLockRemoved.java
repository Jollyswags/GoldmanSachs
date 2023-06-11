package com.example.java.thread.deadlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockRemoved {
    private Lock lock1 = new ReentrantLock(true);
    private Lock lock2 = new ReentrantLock(true);

    public static void main(String[] args) {
        DeadLockRemoved deadlock = new DeadLockRemoved();
        new Thread(deadlock::operation1, "T1").start();
        new Thread(deadlock::operation2, "T2").start();
    }

    public void operation1() {
        lock1.lock();
        System.out.println("lock1 acquired, waiting to acquire lock2.");
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        lock2.lock();
        System.out.println("lock2 acquired");

        System.out.println("executing first operation.");

        lock2.unlock();
        lock1.unlock();
    }

    public void operation2() {
        lock1.lock();
        System.out.println("lock1 acquired, waiting to acquire lock2.");
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        lock2.lock();
        System.out.println("lock2 acquired");

        System.out.println("executing first operation.");

        lock2.unlock();
        lock1.unlock();
    }
}
