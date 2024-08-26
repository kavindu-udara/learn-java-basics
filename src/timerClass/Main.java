package timerClass;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            int counter = 10;
            @Override
            public void run() {
                // TODO Auto-generated method stub
                if(counter > 0){
                    System.out.println(counter + " seconds");
                    counter--;
                }else{
                    System.out.println("HAPPY NEW YEAR!");
                    timer.cancel();
                }
            }

        };

        // // add a date
        // Calendar date = Calendar.getInstance();
        // date.set(Calendar.YEAR, 2020);
        // date.set(Calendar.MONTH, Calendar.JUNE);
        // date.set(Calendar.DAY_OF_MONTH, 20);
        // date.set(Calendar.HOUR_OF_DAY, 0);
        // date.set(Calendar.MINUTE, 0);
        // date.set(Calendar.SECOND, 0);
        // date.set(Calendar.MILLISECOND, 0);
        // // add to timer
        // //  this will run the task that day at time
        // timer.schedule(task, date.getTime());

        // timer.schedule(task, 3000);

        // repeat task
        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}
