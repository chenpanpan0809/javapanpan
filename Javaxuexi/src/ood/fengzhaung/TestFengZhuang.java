package ood.fengzhaung;

import java.lang.reflect.Field;

public class TestFengZhuang {


	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException {
		// TODO Auto-generated method stub
		Class<?>demo = Class.forName("ood.fengzhaung.FenZhuang");
		
		Object demo1 = demo.newInstance();
		
		Field field = demo.getDeclaredField("name");
		Field field1 = demo.getDeclaredField("age");
		
		field.setAccessible(true);//有多少属性就要打开打开多少次
		field.set(demo1, "pp");
		field1.setAccessible(true);
		field1.set(demo1, 12);
		
		System.out.println(field.get(demo1));
		System.out.println(field1.get(demo1));
		
		
		
		
		//第二种方式
		//FenZhuang fenZhuang = new FenZhuang();
		/*fenZhuang.setName("panpan");
		fenZhuang.setAge(12);
		fenZhuang.say();
		System.out.println(fenZhuang.getAge());*/

	}

}
