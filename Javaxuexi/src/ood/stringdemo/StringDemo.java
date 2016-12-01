package ood.stringdemo;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "javaweb";
		String str1 = "100#186#1000";
		char[] shuzu = str.toCharArray();
		String[] shuzu1 = str1.split("\\#");
		/*for (char c : shuzu) {
			System.out.print(c+",");
		}*/
		for (String string : shuzu1) {
			System.out.print(string+"\t");
		}
		System.out.println("");
		System.out.println("将字符转化为字符串:"+new String(shuzu));
		System.out.println("将指定字符转化为数组:"+new String(shuzu,4,3));
	}

}
