package ood.thread;

import java.io.PrintStream;

public class TestThreadDemo1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		PrintStream out = System.out;
		ThreadDemo1 threadDemo = new ThreadDemo1();
		threadDemo.start();
		
		out.println("得到当前运行线程的名字:"+threadDemo.getName());
		out.println("优先级："+threadDemo.getPriority());
		out.println("得到该线程的标示符："+threadDemo.getId());
		
		//Thread.sleep(3000);
		
	}   

}
