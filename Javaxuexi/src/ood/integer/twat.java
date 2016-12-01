package ood.integer;
import java.util.Calendar;

public class twat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c1 = Calendar.getInstance();
		System.out.println(c1.get(Calendar.YEAR));
		System.out.println(c1.get(Calendar.MONTH));
		System.out.println(c1.get(Calendar.DATE));
		c1.set(2009, 6-1, 12);
		System.out.println("------------------------------------------------");
		System.out.println(c1.get(Calendar.YEAR));
		System.out.println(c1.get(Calendar.MONTH));
		System.out.println(c1.get(Calendar.DATE));
	}

}
