package com.threads;

public class Thread1 extends Thread
{
   public void run() 
   {
	System.out.println("Thread is running");
    }
	public static void main(String[] args) {
		Thread t1=new Thread1();
		t1.start();
		 

	}

}
