class A extends Thread {
    public void run() {
  //      System.out.println("Child thread name: " + Thread.currentThread().getName());
  System.out.println("Child thread priorty: "+Thread.currentThread().getPriority());
  System.out.println("Child thread priorty: "+Thread.currentThread().getPriority());
  System.out.println("Child thread priorty: "+Thread.currentThread().getPriority());
  System.out.println("Child thread priorty: "+Thread.currentThread().getPriority());
  System.out.println("Child thread priorty: "+Thread.currentThread().getPriority());
        //
    }
}

public class Thread_Priority {
    public static void main(String[] args) {
 //       System.out.println("Main thread name: " + Thread.currentThread().getName());
        A a=new A();
        a.start();
        a.setPriority(9);
  /*      System.out.println("Main thread name: " + Thread.currentThread().getName());
        Thread.currentThread().setName("Roshi");
        System.out.println("Updated thread name: " + Thread.currentThread().getName());   */

        System.out.println("Main thread priorty: "+Thread.currentThread().getPriority());
       // Thread.currentThread().setPriority(9);
    }
}
