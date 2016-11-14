package ood.jisuan;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class XieXie {

	public  static void xie() throws IOException{
	
	File file = new File("d:\\demo1\\2.txt");
	File parentpath = file.getParentFile();
	if (!parentpath.exists()) {
		System.out.println("创建父路径"+parentpath.mkdirs());
	}
	if (!file.exists()) {
		System.out.println("创建文件"+file.createNewFile());
	}
	OutputStream file1 = new FileOutputStream(file, true);
	java.io.Writer writer = new OutputStreamWriter(file1, "GBK");
	writer.write("黄鹏");
	writer.close();
	
	}
}
