package io.abhijith.javaspecific;

import io.abhijith.commons.Utilities;

public class LearnThreads {

    static double a = 10;
    static double b;

    public static void main(String[] args) {

        /*
        Thread.join operation blocks the execution until the thread is completed.
         */
        Utilities.printHeading("Thread join blocks the execution");
        Runnable runnable = () -> {
          for(int i = 0; i < 5; i++) {
              System.out.println(Thread.currentThread().getName() + " - " + (i + 1));
          }
        };

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);

        t1.start();
        t2.start();

        try {
            t2.join();
            System.out.println("Will print-1 work before completing Thread-1 execution? No");
        } catch (InterruptedException e) {
            System.out.println(e.getLocalizedMessage());
        }
        System.out.println("Will print-2 work before completing Thread-1 execution? No");
        t3.start();
        try {
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Utilities.printEndLine();



        /*
        If multiple threads act on same variable, data race condition occurs
         */
        Utilities.printHeading("Race condition");
        Runnable r1 = () -> {
          if(a == 10)  {
              try {
                  Thread.sleep(500);
                  b = a / 2;
                  System.out.println("Value of b = " + b);
              } catch (InterruptedException e) {
                  System.out.println(e.getLocalizedMessage());
              }
          }
        };

        Runnable r2 = () -> {
          a = 12;
        };

        Thread t4 = new Thread(r1, "t1");
        Thread t5 = new Thread(r2, "t2");
        t4.start();
        t5.start();
        Utilities.printEndLine();



    }

}
