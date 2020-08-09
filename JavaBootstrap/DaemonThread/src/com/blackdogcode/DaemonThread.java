package com.blackdogcode;

// Java program to demonstrate the usage of
// setDaemon() and isDaemon() method.
public class DaemonThread extends Thread {
    public DaemonThread(String name) {
        super(name);
    }

    public void run() {
        // Checking whether the thread is Daemon or not
        if (Thread.currentThread().isDaemon()) {
            System.out.println(getName() + " is Daemon Thread");
        } else {
            System.out.println(getName() + " is User Thread");
        }
    }

    public static void main(String[] args) {
        DaemonThread thread1 = new DaemonThread("thread1");
        DaemonThread thread2 = new DaemonThread("thread2");
        DaemonThread thread3 = new DaemonThread("thread3");

        // Setting user thread t1 to Daemon
        thread1.setDaemon(true);

        // starting first 2 threads
        thread1.start();
        thread2.start();

        // Setting user thread t3 to Daemon
        thread3.setDaemon(true);
        thread3.start();
    }
}

