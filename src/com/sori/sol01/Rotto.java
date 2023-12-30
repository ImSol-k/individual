package com.sori.sol01;

public class Rotto {

	public static void main(String[] args) {
		
		int[] rotto = new int[6];
		int temp;
		
		for (int i = 0; i < rotto.length; i++) {
			rotto[i] = (int)(Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if(rotto[i] == rotto[j]) {
					i--;
				}
			}
		}
		
		System.out.println("==================");
		
		for (int i = 0; i < rotto.length; i++) {
			System.out.print(rotto[i] + " ");
		}
		
		System.out.println();
		System.out.println("==================");
		
		
		for (int i = 0; i < rotto.length; i++) {
			
			for (int j = 0; j < i; j++) {
				
				if(rotto[i] < rotto[j]) {
					temp = rotto[i];
					rotto[i] = rotto[j];
					rotto[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < rotto.length; i++) {
			System.out.print(rotto[i] + " ");
		}
		System.out.println();
		System.out.println("==================");
		
	}

}
