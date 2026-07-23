// if we want to extend this class 
// class A extends z, Thread // this is not allowed in java(multiple inheritance)

class A implements Runnable{  // Runnable has run method
    public void run(){   // in every thread you need to have a run method
        for(int i=0;i<5;i++){
            System.out.println("hi abhishek");
            try {
                Thread.sleep(10);  // we can set the sleep duration of thread
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("hello abhishek");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class runnable {
    public static void main(String[] args){
        /* 
        A obj1 = new A();
        B obj2 = new B();

        // obj1.start();  // these will give error, so we need to create thr thread (Thread t1 = new Thread();)
        // obj2.start();

        Thread t1 = new Thread();
        Thread t2 = new Thread();

        t1.start(); // it works but do nothing because it doesn't know about obj1 and obj2
        t2.start();
        */

        Runnable obj1 = new A();
        Runnable obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start(); // it works and print
        t2.start();

    }
}
