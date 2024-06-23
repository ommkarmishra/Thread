import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

 class MyThread6 implements Runnable{
   String name;
   public MyThread6(String name){
    this.name=name;
   }
    public void run(){
        System.out.println(name+" starts to execute");
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){ }
        System.out.println(name+" finished execution");
    }

 }
public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService exe= Executors.newFixedThreadPool(4);
        for(int i=0;i<10;i++){
            Runnable r=new MyThread6("Thread "+i);
            exe.execute(r);      
        }
        exe.isShutdown();
    }
}
