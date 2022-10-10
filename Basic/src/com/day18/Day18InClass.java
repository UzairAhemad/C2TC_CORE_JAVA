package com.day18;

public class Day18InClass {

	public static void main(String[] args) {
		
		// Multi-threading
		
		/* There are two way to create threads
		    1. Extending the Thread class 
		    2. Implementing the Runnable Interface
		 */
		
		MyThread obj = new MyThread(); // Calling the MyThread 
		obj.start();
		
		System.out.println("Main thread is: " + Thread.currentThread().getName());
		Thread t1 = new Thread(new Day18InClass().new NewThread());
        t1.start();
		
		
		

	}

}

	// creating thread using extends thread class.

class MyThread extends Thread{
	public void run() {
		System.out.println("This is MyThread");
	}
}

	// creating thread using implements Runnable

class NewThread implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getName() + "executing run() method!");
	}
}