import java.util.concurrent.locks.ReentrantLock;
import javax.swing.TransferHandler;
class ThreadDemo extends Thread{
    String name;
    ReentrantLock l=new ReentrantLock();

    public ThreadDemo(String name) {
        this.name=name;
    }

    public void run(){
        if(l.tryLock()){                                   //(l.tryLock(1000, TimeUnit.MILLISECONDS)) -> also work
            System.out.println(name+" thread get lock");
        try{
            Thread.sleep(2000);                      //Thread.sleep(10000)
        } 
        catch(InterruptedException e){
            System.out.println(name+" thread finished execution and release lock ");
        }
    }
    else{
        System.out.println(name+" tread trying for lock");
    }
    }
}
public class ThreadDemo1 {
    public static void main(String[] args) {

        ThreadDemo t1=new ThreadDemo("First");
        ThreadDemo t2=new ThreadDemo("Second");
        t1.start();
        t2.start();

    }

}