package net.antra.multithread.join;

import net.antra.multithread.ThreadWithClass;
import net.antra.multithread.ThreadWithInterface;

public class TestJoin {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main thread is running");
		Thread thread1 = new Thread(new ThreadWithInterface());
		ThreadWithClass thread2 = new ThreadWithClass();
		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();
		System.out.println("Main thread is done");
	}
}
