package threadJava;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println();
        // how meny thread are currently active
        // System.out.println(Thread.activeCount());

        // change thread name
        // Thread.currentThread().setName("MAIN");

        // get current thrad name
        // System.out.println(Thread.currentThread().getName());

        // change priority 
        // 0 -lowest
        // 10 - highest
        // Thread.currentThread().setPriority(10);

        // check thread priority
        // System.out.println(Thread.currentThread().getPriority());

        // check is thread alive
        // System.out.println(Thread.currentThread().isAlive());

        // for(int i=3; i > 0; i--){
        //     System.out.println(i);
        //     Thread.sleep(1000);
        // }

        // System.out.println("You are done");

        MyThread thread2 = new MyThread();

        // deamon thread - low priority thread that runs in the background likes a garbage collector
        // JVM terminates when all deamon threads are dead
        // set deamon thread
        thread2.setDaemon(false);
        System.out.println(thread2.isDaemon());

        // start thread2
        thread2.start();
        System.out.println(thread2.isAlive());
        // change name
        thread2.setName("2nd thread");
        System.out.println(thread2.getName());
        // set priority
        thread2.setPriority(1);
        System.out.println(thread2.getPriority());

        System.out.println(Thread.activeCount());
    }
}
