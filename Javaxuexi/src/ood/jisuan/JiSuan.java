package ood.jisuan;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class JiSuan {
	
	public static void Cale(int num1, int num2) {
		ArrayList<Integer> numset = new ArrayList<Integer>();
		// TreeSet<Integer> numset = new TreeSet<Integer>();
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
		System.out.println("一共有" + numset.size() + "结果");
		System.out.println("最大值" + numset.get(numset.size() - 1));
		System.out.println("最小值" + numset.get(0));

		/*
		 * System.out.println("最大值为" + numset.last()); System.out.println("最小值为"
		 * + numset.first());
		 */
		System.out.println("总和的平均值为" + avg);
	}

	public static void main(String[] args) {

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
