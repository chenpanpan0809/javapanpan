package ood.jisuan;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Method;

public class XieXie {

	public  static void xie() throws IOException, Exception{
	
		
		Class<?> demo =null;
		demo = Class.forName("ood.jisuan.JiSuan2");
		
	 Method method = demo.getMethod("Cale(int num1, int num2)");
		method.invoke(demo.newInstance());
	}
}
