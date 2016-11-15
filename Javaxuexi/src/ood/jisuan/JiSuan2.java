package ood.jisuan;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

import lombok.val;

public class JiSuan2 {
	
	public static void Cale(int num1, int num2) throws Exception {
		ArrayList<Integer> numset = new ArrayList<Integer>();
		File file = new File("d:\\demo1\\2.txt");
		File parentpath = file.getParentFile();
		if (!parentpath.exists()) {
			System.out.println("创建父路径"+parentpath.mkdirs());
		}
		if (!file.exists()) {
			System.out.println("创建文件"+file.createNewFile());
		}
		OutputStream file1 = new FileOutputStream(file, false);
		java.io.Writer writer = new OutputStreamWriter(file1, "GBK");
		String title1 = "题目：计算XX数以内所有能被7整除的数的和及平均数";
		String title2 = "\r\n先通过File类创建一个文件";
		String title3 = "\r\n使用Scanner提供的方法，从键盘中输入数据。采用if条件语句来判断输入的参数是否合法";
		String title4 = "\r\n把键盘输入的两个参数分别赋值给两个变量，计算表达试中的常量参数用两个变量来代替，这样可以改变代码的灵活性";
		String title5 = "\r\n定义一个Arraylist的容器，用来接收计算所得的结果";
		writer.write(title1);
		writer.write(title2);
		writer.write(title3);
		writer.write(title4);
		writer.write(title5);
		
		int sum = 0;
		double avg;
		if (num1 <= 0) {
			System.err.println("整除的值不能小于等于0");
			return;
		} else if (num2 <= 0) {
			System.err.println("整除的范围不能小于等于0");
			return;
		}
		for (int a = 1; a < num2; a++) {
			if (a % num1 == 0) {
				numset.add(a);
				sum += a;
			}
		}
		avg = sum / numset.size();
		
		System.out.println("计算结果得到" + numset.size() + "个值");
		System.out.println("所有值的和:" + sum);
		System.out.println("输出每一个数的值");
		System.out.println(numset);
		
		
		System.out.println("最大值" + numset.get(numset.size() - 1));
		System.out.println("最小值" + numset.get(0));
		System.out.println("总和的平均值为" + avg);
		writer.write("\r\n得到"+numset.size()+"个结果");
		writer.write("\r\n所有值的和:" + sum);
		writer.write("\r\n输出每一个数的值:"+numset);
		writer.write("\r\n最大值:" + numset.get(numset.size() - 1));
		writer.write("\r\n最小值:" + numset.get(0));
		writer.write("\r\n总和的平均值为:" + avg);
		writer.close();
	}
	public static void main(String[] args) throws IOException {
		dothis();
	}
	public static void dothis(){
		Scanner scanner = new Scanner(System.in);
		int num1;
		int num2;

		try {
			System.out.println("请输入要整除的值");
			num1 = Integer.valueOf(scanner.next());
			System.out.println("请输入要整除的范围");
			num2 = Integer.valueOf(scanner.next());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.err.println("输入的值不合法");
			return;
		}
		try {
			Cale(num1, num2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("输入的范围小于整除的范围");
			return;
		}
	}
	
}
