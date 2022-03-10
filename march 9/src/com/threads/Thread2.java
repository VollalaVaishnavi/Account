package com.threads;

public class Thread2 implements Runnable{
	public void run()
	{
		System.out.println("Thread is running");
	}

	public static void main(String[] args) {
		 
 Thread2 t1=new Thread2();
 Thread t=new Thread(t1);
 t.start();
 
	}

}
