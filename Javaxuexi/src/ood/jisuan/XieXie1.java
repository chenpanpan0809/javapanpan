package ood.jisuan;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class XieXie1 extends Thread {

	public static void main(String[] args) throws Exception, SecurityException {
		// TODO Auto-generated method stub
		XieXie1 dXie1=new XieXie1();
		Thread rThread=new Thread(dXie1);
		rThread.start();
	}

		public void run() {
			try {
				Class<?> demo = null;
				demo = Class.forName("ood.jisuan.JiSuan2");
				Method method =demo.getDeclaredMethod("dothis", null);
				method.invoke(demo.newInstance());
			} 
			catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	

}
