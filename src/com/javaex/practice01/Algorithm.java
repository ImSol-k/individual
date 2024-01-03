package com.javaex.practice01;


public class Algorithm {
	
	private int[] rotto = new int[6];
	private String line = "====================";
	
	//로또번호 생성
	public void setRotto() {
		for(int i = 0; i < rotto.length; i++) {
			this.rotto[i] = (int)(Math.random() * 45) + 1;
			for(int j = 0; j < i; j++) {
				//중복검사
				if(rotto[i] == rotto[j]) {
					i--;
				}
			}
		}
	}
	
	//로또번호 출력
	public void showRotto() {
		setRotto();
		System.out.println(line);
		System.out.println("로또번호 출력");
		System.out.print("> ");
		for (int i = 0; i < rotto.length; i++) {
			System.out.print(rotto[i] + " ");
		}
		System.out.println();
	}
	
	//번호순으로 정렬
	public void sortingNumber() {
		int temp = 0;
		for (int i = 0; i < rotto.length; i++) {
			for (int j = 0; j < i; j++) {
				if(rotto[i] < rotto[j]) {
					temp = rotto[i];
					rotto[i] = rotto[j];
					rotto[j] = temp;
				}
			}
		}
	}
	
	public void showSorting() {
		sortingNumber();
		System.out.println(line);
		System.out.println("정렬 출력");
		System.out.print("> ");
		for (int i = 0; i < rotto.length; i++) {
			System.out.print(rotto[i] + " ");
		}
		System.out.println();
		System.out.println(line);
	}

}
