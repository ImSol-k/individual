package com.sori.sol01;

public class HayYo {
	
	public static void main(String[] args) {
		
		String player = "자바";
		String monster = "커피";
		float monHp = 30.5f;
		int att = 10;
		
		System.out.println("플레이어 " + player + "등장!!");
		System.out.println("야생의 " + monster + "가 나타났다~! *hp:" + monHp);
		System.out.println("공격x1 남은hp:" + monHp);
		
		monHp = monHp - att;
		System.out.println("공격x1 남은hp:" + monHp);
		
		monHp = monHp - att;
		System.out.println("죽었나? : " + (1 > monHp));
		
		monHp = monHp - att * 2;
		System.out.println("공격x2 남은hp:" + monHp);
		
		System.out.println("죽었나? : " + (1 > monHp));
		
		System.out.println(monHp);
		
		int hp = (int)monHp;
		System.out.println(hp);
		System.out.println(-hp);
		System.out.println(+hp);
		
	}

}
