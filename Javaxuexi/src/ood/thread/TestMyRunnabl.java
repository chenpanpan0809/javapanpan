package ood.thread;

public class TestMyRunnabl {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyRunnabl myRunnabl = new MyRunnabl();
		Thread thread = new Thread(myRunnabl);
		System.out.println("输出当前线程的名字:"+thread.getName());
		thread.setDaemon(true);//设置为守护进程后后台进程
		thread.setName("the");
		System.out.println("输出当前线程的名字为:"+thread.getName());//更改当前线程的名字
		thread.isAlive();
		System.out.println("判断当前线程是否是活的:"+thread.isAlive());
		thread.start();
		System.out.println("判断当前线程是否是活的:"+thread.isAlive());//启动之后
		//thread.sleep(1);
		
	}

}
