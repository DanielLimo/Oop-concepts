package limo;


public class MyThread implements Runnable {
	 
    public void run()
    {
        System.out.println(Thread.currentThread().getName()
                         + ", executing run() method!");
    }
}
