package threadJava;

public class MyThread extends Thread {
    @Override
    public void run(){
        if(this.isDaemon()){
            System.out.println("this is a demon thread");
        }else{
            System.out.println("this is a user thread that is running");
        }
    }
}
