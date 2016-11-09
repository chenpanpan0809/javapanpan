	package ood.file;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.InputStream;
	import java.io.InputStreamReader;
	import java.io.OutputStream;
	import java.io.OutputStreamWriter;
	import java.io.PrintStream;
	import java.io.RandomAccessFile;
	import java.io.Reader;
	import java.io.Writer;

	public class FileDemo {
		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			PrintStream out = System.out;
			File file = new File("d:\\demo\\pfs\\exam.txt");
			File parentpath = file.getParentFile();
			if (!parentpath.exists()) {
				out.println("创建父目录:"+parentpath.mkdirs());
			}
			if (!file.exists()) {
				out.println("创建exam.txt文件："+file.createNewFile());
			}	/*else {
				out.println("文件已存在");
			}*/
			
			OutputStream file1 = new FileOutputStream(file, false);
			Writer writer2 = new OutputStreamWriter(file1, "GBK");
			String  title1 = "这是一个java上机题的文档文件\r\n";
			String  title2 = "一个正整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少\r\n";
			String  title3 = "需要的参数如下：通过解析下面的字符串得到需要的参数值\r\n";
			String  title4 = "100#168#1000\n";
			writer2.write( title1);
			writer2.write(title2);
			writer2.write( title3);
			writer2.write(title4);
			writer2.flush();
			
			//RandomAccessFile file2 = new RandomAccessFile(file, "r");
			InputStream in = new FileInputStream(file);
			Reader reader = new InputStreamReader(in, "GBK");
			
			char[]bytes1 =new char[(int)title1.length()];
			char[]bytes2 =new char[(int)title2.length()];
			char[]bytes3 =new char[(int)title3.length()];
			char[]bytes4 =new char[(int)title4.length()];
			reader.read(bytes1);
			out.print("读取当前的内容是："+new String(bytes1));
			reader.read(bytes2);
			out.print("读取当前的内容是："+new String(bytes2));
			reader.read(bytes3);
			out.print("读取当前的内容是："+new String(bytes3));
			reader.read(bytes4);
			out.print("读取当前的内容是："+new String(bytes4));
			
			
			byte[]shuju =new byte[title4.getBytes().length];
			reader.read(bytes4);//读取需要的参数，这里自己看提供的方法，提取需要的数据，排除#号
			String num1,num2;
			num1=new String(bytes4).substring(4, 7);
			num2=new String(bytes4).substring(8, 12);
			out.println("读取当行有需要的参数，参数为："+new String(bytes4).substring(0, 3)+"\t"+num1+" "+num2);
			in.close();
			out.println("不在读取当前文件，读取配置文件的方法退出");
			
			
			out.println();
			out.println("计算x的值过程如程序");
			int m,n;
			for (int x = 0; x <=1000; x++) {
				m = x+100;
				n=m+168;
				if (Math.sqrt(m)==(int)Math.sqrt(m)&&Math.sqrt(n)==(int)Math.sqrt(n)) {
					out.println("输出x的值:"+x);
				}
			}
			
			out.println("向文件中写入分析内容");
			String analyze1 = "1.\r\n先弄明白什么叫完全平方数，并声明三个变量x，n,m后面计算时使用+";
			String analyze2 = "\r\n2.完全平方数的定义：完全平方数能写成一个正整数的平方数";
			String analyze3 = "\r\n3.采用for循环的方式来满足一个数加100后是一个平方数，再加168后又是一个平方数";
			String analyze4 = "\r\n4.即m=x+100,n=m+168";
			String analyze5 ="\r\n5.筛选条件为math.squre(m)==int(math.squre(m))&&math.squre(n)==int(math.squre(n))";
			String analyze6 = "\r\n6.计算过程如程序所示";
			String analyze7 = "\r\n7.输出x的值";
			String analyze8 = "\r\n	x==21";
			String analyze9 = "\r\n	x=261";
			writer2.write(analyze1);
			writer2.write(analyze2);
			writer2.write(analyze3);
			writer2.write(analyze4);
			writer2.write(analyze5);
			writer2.write(analyze6);

			writer2.write(analyze7);
			writer2.write(analyze8);
			writer2.write(analyze9);
			writer2.close();
			
			
		}

	}


