class A {
    synchronized void m1(B b) {                                //this will not be executed as the synchronized  method prevents the it to be excuted
        System.out.println("Thread1 executed m1 method");    //this object(synchronized void m1(B b)) is hold by synchronized void m2(A a)
        try{
            Thread.sleep(2000);
        } 
        catch (InterruptedException e) { }
        System.out.println("Thread1 calls first method in class B");
        b.first();
    }

    synchronized void first() {
        System.out.println("Class A first method");
    }
}

class B {
    synchronized void m2(A a) {                                 //this will not be executed as the synchronized  method prevents the it to be excuted
        System.out.println("Thread executed the m2 method");  //this object(synchronized void m2(A a)) is hold by synchronized void m1(B b)
        try {
            Thread.sleep(2000);
        } 
        catch (InterruptedException e){ }
        System.out.println("Thread calls first method in class A");
        a.first();
    }

    synchronized void first() {                         
        System.out.println("Class B first method");     
    }
}

public class MyThread extends Thread {
    A a=new A();
    B b=new B();

    public void run() {
        b.m2(a);
    }

    void d() {
        this.start();
    }

    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.d();
    }
}
