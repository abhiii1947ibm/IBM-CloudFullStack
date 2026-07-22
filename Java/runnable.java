

class z {

}

// if we want to extend this class 
// class A extends z, Thread // this is not allowed in java(multiple inheritance)

class A implements Runnable{  // Runnable has run method
    public void run(){   // in every thread you need to have a run method
        for(int i=0;i<10;i++){
            System.out.println("hi abhishek");
            try {
                Thread.sleep(10);  // we can set the sleep duration of thread
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {
    public void run(){
        for(int i=0;i<10;i++){
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

        A obj1 = new A();
        B obj2 = new B();

        obj1.start();  // it shoud be start().  when it executes that's mean the run method will execute.

        // System.out.println(obj1.getPriority());   // to get the priority of the thread  (range of priority is: 1 to 10,  1-lew, 10-high, 5=normal)

        // obj2.setPriority(Thread.MAX_PRIORITY);  // to set the priority of htread,   MAX_PRIORITY = 10
        // we can only suggest the priority to the scheduler, it depends on the algorithm of the scheduler like how it treat the suggestion

        try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        obj2.start();

    }
}
