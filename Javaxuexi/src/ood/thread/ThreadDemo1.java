package ood.thread;

public class ThreadDemo1 extends Thread {
	
	public void run(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ThreadDemo程序正在运行");
		
	}

}
