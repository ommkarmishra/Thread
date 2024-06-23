package Sleep;
class MyThread extends Thread {
    public void run() {
        try{
            for(int i=1;i<=10;i++) {
                System.out.println("Child thread");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}

public class Threaddemo {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        for (int i=0;i<10;i++) {
            System.out.println("Main thread");
        }
    }
}


