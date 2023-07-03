package limo;

//  import limo.RunnableDemo.RunnableImpl;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// MyThread task=new MyThread();
		System.out.println("Main thread is- "
                + Thread.currentThread().getName());
		MyThread myThread = new MyThread();
		
		Thread t1 = new Thread(new MyThread());
        t1.start();
        
		// Thread t1=new Thread("task");
		
	}}

	


