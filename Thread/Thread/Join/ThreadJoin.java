package Join;
class MyThread extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Child thread");
        }
    }
}
public class ThreadJoin {
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.start();
        try{
            t.join();
        }
     catch (InterruptedException e) {}
        for(int i=0;i<5;i++){
            System.out.println("Main thread");
        }
    }
}

