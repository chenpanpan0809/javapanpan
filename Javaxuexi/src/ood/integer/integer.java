package ood.integer;

public class integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x ="120";
		int y = 130;
		float mun = Float.parseFloat(x);
		double num = Double.parseDouble(x);
		int m = Integer.parseInt(x);
		Float mun1 = new Float(x);
		String y1 = String.valueOf(y);//将整形数转化为字符串
		
		//System.out.println(mun1.MAX_VALUE);
		System.out.println(mun);
		System.out.println(num);
		System.out.println(m);
		System.out.println(y1);
	}

}
