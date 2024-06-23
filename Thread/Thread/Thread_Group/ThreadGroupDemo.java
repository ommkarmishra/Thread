/**
 * ThreadGroupDemo
 */
public class ThreadGroupDemo {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        ThreadGroup g1=new ThreadGroup("First group");
        System.out.println(g1.getParent().getName());
        System.out.println(g1.getName());
    }
}