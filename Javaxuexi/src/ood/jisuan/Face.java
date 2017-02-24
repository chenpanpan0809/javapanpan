package ood.jisuan;

import lombok.Data;

@Data
public class Face {
	
	String aa;
	Integer bb;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer b,c,d;
		Face face = new Face();
		/*String [] as = new String[]{"1","2"};*/
		Integer a = new Integer(1);
		b=a;
		c=b;
		d=c;
		System.out.println();
		System.out.println(d);
		/*for (String string : as) {
			System.out.println();
		}*/

	}

}
