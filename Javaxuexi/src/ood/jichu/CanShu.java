package ood.jichu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.Scanner;

public class CanShu {

	private static boolean ture;
	private static char[] out;

	public static void main(String[] args) throws IOException {
		/*// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入参数");
		String w =String.format(scanner.next());//加参数方式
		System.out.println(w);*/
		File file = new File("d:\\demo5\\2.txt");
		File parentpath = file.getParentFile();
		if (!parentpath.exists()) {
			System.out.println("创建父路径"+parentpath.mkdirs());
		}
		if (!file.exists()) {
			System.out.println("创建文件"+file.createNewFile());
		}
		//FileInputStream fileInputStream = new FileInputStream(file);
		OutputStream file1 = new FileOutputStream(file, ture);
		Writer writer2 = new OutputStreamWriter(file1, "GBK");
		
		/*
		PrintStream out = System.setOut(out);;
		writer2.write(out);
		*/
	}

}
