package ood.fanshe;

import java.io.PrintStream;
import java.lang.reflect.Constructor;

import lombok.Getter;
import lombok.Setter;
@Setter@Getter
class Book{
	private String title;
	private double price;

	public Book(String title, double price) {
		super();
		this.title = title;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "图书名称" + title + ", 图书价格" + price  ;
	}

	public Book(String title) {
		super();
		this.title = title;
	}

}
public class FanSheDemo {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class<?>cls = Class.forName("ood.fanshe.Book");//获取对象
		
		Constructor<?>[] cls1 = cls.getConstructors();//实例化对象第二种方式
		Book book1 =(Book) cls1[0].newInstance("java");
		Book book2 =(Book) cls1[1].newInstance("java1",25);
		
		/*Book book = (Book)cls.newInstance();//实例化对象第一种方式
		book.setTitle("java");
		book.setPrice(25);
		System.out.println(book);*/
		System.out.println(book1);
		System.out.println(book2);
	}


}
