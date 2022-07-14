package com.application;

public class Main {
	
	static void generateVector(int Addr,int Data){

		int a, b, count, count2;

		String c = Integer.toBinaryString(Addr);
		String d = Integer.toBinaryString(Data);

		char[] e = c.toCharArray();
		char[] f = d.toCharArray();

		Parity parity = new Parity();

		count = parity.Count(e);
		a = parity.Judge(count);

		count2 = parity.Count(f);
		b = parity.Judge(count2);

		System.out.println("分开时：" + "1101 " + c + " " + a + " 101 " + d + " " + b + " 1101");
		System.out.println("汇总时：" + "1101" + c + a + "101" + d + b + "1101");
	}

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO 判断Data的奇偶性，如果1的个数为1，符号CD为1，否则为0；
		generateVector(0xCC,0xAB);
	}
}
