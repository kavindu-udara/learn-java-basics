package multiThreading;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // 1 method
        MyThread thread = new MyThread();
        
        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);

        // thread.setDaemon(true);
        // thread2.setDaemon(true);

        thread.start();
        // ones thread 1 is finished thread 2 will start
        thread.join();
        // thread 2 will start only after thread 1 is finished and it will wait for 3 seconds
        thread.join(3000);
        thread2.start();

        // 
        // System.out.println(1/0);

    }
}
