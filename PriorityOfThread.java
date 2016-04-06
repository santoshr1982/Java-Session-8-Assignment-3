package com.Thread.classes;

public class PriorityOfThread implements Runnable {

	@Override
	public void run() {
	
		System.out.println(" Thread Name is " + Thread.currentThread().getName() + " and the priority is " + Thread.currentThread().getPriority()+ "." );  //Displays the thread Name and its priority.
		
		
	}

}
