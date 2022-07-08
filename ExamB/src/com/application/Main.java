package com.application;

public class Main {
	
	static String generateVector(int Addr,int Data){

		int a, b, count = 0, count2 = 0;
		String c = Integer.toBinaryString(Addr);
		String d = Integer.toBinaryString(Data);
		char[] e = c.toCharArray();
		char[] f = d.toCharArray();

		for(int i = 0; i < e.length; i++){
			if(e[i] == '1'){ count += 1; }
		}

		if(count % 2 == 0){ a = 0; }else{ a = 1; }

		for(int j = 0; j < f.length; j++){
			if(f[j] == '1'){ count2 += 1; }
		}

		if(count2 % 2 == 0){ b = 0; }else{ b = 1; }

		return "1101 " + c + " " + a + " 101 " + d + " " + b + " 1101";
	}

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO 判断Data的奇偶性，如果1的个数为1，符号CD为1，否则为0；
		System.out.println(generateVector(0xC 0xAB));
	}

}
