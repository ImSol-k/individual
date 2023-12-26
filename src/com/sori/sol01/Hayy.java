package com.sori.sol01;

public class Hayy {

	public static void main(String[] args) {
		
		int i = 234;
		float f = 34.3f;
		double d = 32424.3;
		
		System.out.println("i = " + i + ", f = " + f + ", d = " + d);
		System.out.println("=================================");	
		System.out.println("i + f = " + (i + f));
		System.out.println("(int)i + f" + (int)(i + f));
		System.out.println("(float)i + f = " + (float)i + f);
		System.out.println("(double)i + f" + (double)i + f);
		System.out.println("=================================");	
		
		
		boolean bo1 = i > f;
		boolean bo2 = i < f;
		boolean bo3 = i == f;
		boolean bo4 = i > d;
		boolean bo5 = i < d;
		boolean bo6 = i == d;
		
		System.out.println("i = " + i + ", f = " + f + ", d = " + d);
		System.out.println("i > f = " + bo1);
		System.out.println("i < f = " + bo2);
		System.out.println("i == f = " + bo3);
		System.out.println("i > d = " + bo4);
		System.out.println("i < d = " + bo5);
		System.out.println("i == d = " + bo6);
		System.out.println("f > d = " + (f > d));
		System.out.println("f < d = " + (f < d));
		System.out.println("f == d = " + (f == d));
		System.out.println("=================================");
				
		int j = 987;
		byte b = (byte)j;
		
		System.out.println(j);
		System.out.println(b);
		
		char ch = '솔';
		
		System.out.println(ch);
		System.out.println("'솔'의 유니코드 : " + (int)ch);
		
		String name = "김소리";
		float age = 25.9f;
		int birth = 1999;
		String day = "5/23";
		
		System.out.println("이름 : " + name + " 나이 : " + age + " 출생 : " + birth);
		System.out.println("생일 : " + day);
	}

}
