package net.antra.multithread.interrupt;

import net.antra.multithread.ThreadWithInterface;

public class TestInterrupt {
	public static void main(String[] args) {
		System.out.println("Main thread is running");
		Thread thread1 = new Thread(new ThreadWithInterface());
		ThreadWithClass thread2 = new ThreadWithClass();
		thread1.start();
		thread2.start();
		thread2.interrupt();
		System.out.println("Main thread is done");
	}
}
