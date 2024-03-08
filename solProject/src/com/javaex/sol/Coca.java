package com.javaex.sol;

import java.util.Scanner;

public class Coca {
	
	Scanner in = new Scanner(System.in);
	String line = "============================";
	private int x;
	private int y;
	boolean start = true;
	
	public void setX(int x) {
		while (start) {
			System.out.println(line);
			System.out.println("0이상 100이하의 숫자만 입력 가능");
			System.out.print("x : ");
			x = in.nextInt();
			if(x < 0 || x > 100) {
				start = true;
			}
			else {
				this.x = x;
				break;
			}
			
		}
	}
	public void setY(int y) {
		while (start) {
			System.out.println(line);
			
			System.out.println("0이상 100이하의 숫자만 입력 가능");
			System.out.print("y : ");
			y = in.nextInt();
			if(y < 0 || y > 100) {
				start = true;
			}
			else {
				this.y = y;
				start = false;
			}
			
		}
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	public void show() {
		System.out.println(line);
		System.out.println("[x = " + x + ", y = " + y + "]을 그렸습니다");
	}
}
