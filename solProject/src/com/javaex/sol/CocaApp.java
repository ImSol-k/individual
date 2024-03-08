package com.javaex.sol;

public class CocaApp {

	public static void main(String[] args) {
		
		Coca co1 = new Coca();
		co1.setX(0);
		co1.setY(0);
		co1.show();
		
		System.out.println(co1.line);
		System.out.println("총 이동 : " + (co1.getX() + co1.getY()));
		System.out.println(co1.line);
	}

}
