package Yield;

class ThreadDemo extends Thread {
    public void run() {
        for (int i=0;i<10;i++) {
            System.out.println("Child thread");
            Thread.yield();
        }
    }
}

public class ThreadYield {
    public static void main(String[] args) {
        ThreadDemo t = new ThreadDemo();
        t.start();
        for (int i=0;i<10;i++) {
            System.out.println("Main thread");
        }
    }
}


