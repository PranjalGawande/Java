// to make class a thread just extend with Thread class
// all thread must have run() it is called by start(); 
// to start thread obj.start() is used

// this way of making thread restricts inheritance as multiple extends not work in java
// class A extends Thread {
//     public void run() {
//         for (int i = 0; i < 100; i++) {
//             System.out.println("hi");
//             try {
//                 Thread.sleep(10);   // used to suspend for given time
//             } catch (InterruptedException e) {
//                 // TODO Auto-generated catch block
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class B extends Thread {
//     public void run() {
//         for (int i = 0; i < 100; i++) {
//             System.out.println("hello");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 // TODO Auto-generated catch block
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class C {

// }

// // Another suitable way of creating thread using Runnable which is a interface
// // in this way we can extend another class also
// class A extends C implements Runnable {
//     public void run() {
//         for (int i = 0; i < 5; i++) {
//             System.out.println("hi");
//             try {
//                 Thread.sleep(10); // used to suspend for given time
//             } catch (InterruptedException e) {
//                 // TODO Auto-generated catch block
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class B implements Runnable {
//     public void run() {
//         for (int i = 0; i < 5; i++) {
//             System.out.println("hello");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 // TODO Auto-generated catch block
//                 e.printStackTrace();
//             }
//         }
//     }
// }

class Counter {
    private int count;
    public synchronized void increment() {
        count++;
    }
    public synchronized int getCount() {
        return count;
    }
}

public class Threads {
    public static void main(String args[]) {

        // when used extends Threads
        // A obj1 = new A();
        // B obj2 = new B();
        // range of priority -> 1 to 10, 5 is default
        // System.out.println(obj1.getPriority());
        // obj1.setPriority(Thread.MAX_PRIORITY); // only suggest scheduler

        // // start is used to start the thread it call the run in thread class
        // obj1.start();
        // try {
        // // thread goes to waiting state
        // Thread.sleep(2); // can be used to alternate b/w both (not sure)
        // } catch (InterruptedException e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }
        // obj2.start();

        // when use implements Runnable
        // Runnable obj1 = new A(); // ref of Runnable and object of A
        // Runnable obj2 = new B();

        // // create Thread object
        // Thread t1 = new Thread(obj1); // thread obj of A
        // Thread t2 = new Thread(obj2); // thread obj of B

        // t1.start();
        // t2.start();

        // lambda expression
        // Runnable obj3 = () -> {
        //     for (int i = 0; i < 5; i++) {
        //         System.out.println("lambda hi");
        //     }
        // };

        // Thread t3 = new Thread(obj3);
        // t3.start();


        // Race Condition => implementing Thread Safe
        Counter c = new Counter();

        Runnable obj1 = () -> {
            for (int i = 0; i < 100; i++) {
                c.increment();
            }
        };
        Runnable obj2 = () -> {
            for (int i = 0; i < 100; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println(c.getCount());
    }
}
