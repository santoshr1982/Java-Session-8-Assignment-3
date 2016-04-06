package com.Thread.classes;
//This program has been written to display the working of threads in Java.
public class MainClass extends Thread{

	public static void main(String[] args) {
		
		//Creating the object for the Priority class which implements the runnable interface.
		PriorityOfThread objThread1 = new PriorityOfThread();
		
		//Creating the object for new threads and passing the parameter of the object of the class.
		Thread T1 = new Thread(objThread1);
		Thread T2 = new Thread(objThread1);
		Thread T3 = new Thread(objThread1);
		
		//Setting the priority of the threads.
		T1.setPriority(MAX_PRIORITY);
		T2.setPriority(NORM_PRIORITY);
		T3.setPriority(MIN_PRIORITY);

		
		//Starting all the threads.
		T1.start();
		T2.start();
		T3.start();
		
	}
	
}
