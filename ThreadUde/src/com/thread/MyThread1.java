package com.thread;

public class MyThread1 extends Thread{
	MyData d;
	public MyThread1(MyData d) {
		this.d = d;
	}
	public void run() {
		try {
			d.display("Hello World");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
