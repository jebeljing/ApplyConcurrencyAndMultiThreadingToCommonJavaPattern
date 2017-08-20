package org.paumard.runnable;

/**
 * Created by jingshanyin on 8/19/17.
 */
public class FirstRunnable {

    public static void main(String[] args) {

        Runnable runnable = () -> {
          System.out.println("I am running in " + Thread.currentThread().getName());
        };

        Thread t = new Thread(runnable);
        t.setName("My thread");
        t.start();
//        t.run();  // NO. This will not be running on another thread
    }

}
