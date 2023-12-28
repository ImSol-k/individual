package com.javaex.repetition;

public class Ex03 {

	public static void main(String[] args) {
		
		int num = 5;
		
		for(int i = 0; i < num; i++) {
			for(int j = 0;j < num ; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
		System.out.println("==============");
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
		System.out.println("==============");
	}

}
