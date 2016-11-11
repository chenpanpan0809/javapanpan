package ood.thread;

import java.io.PrintStream;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		PrintStream out = System.out;
		Thread thread = Thread.currentThread();// 该方法返回对当前正在执行的线程对象的引用
		out.println("得到当前正在运行的线程名：" + thread.getName());
		out.println("得到当前正在运行的线程标示符：" + thread.getId());
		out.println("得到当前正在运行的线程优先级：" + thread.getPriority());
		out.println("得到当前正在运行的线程的当前状态：" + thread.getState());
		out.println("当前时间是：" + System.currentTimeMillis());
		thread.sleep(3000);
		out.println("睡眠后的时间是：" + System.currentTimeMillis());
		thread.checkAccess();
		out.println("得到当前正在运行的线程中活动线程的数目：" + thread.activeCount());

	}

}
