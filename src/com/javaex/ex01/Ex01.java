package com.javaex.ex01;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		
		Set<Point> pSet = new HashSet<Point>();
		Point p1 = new Point(1, 1);
		Point p2 = new Point(2, 2);
		Point p3 = new Point(3, 3);
		Point p4 = new Point(2, 2);
		Point p5 = p1;
		pSet.add(p1);
		pSet.add(p2);
		pSet.add(p3);
		pSet.add(p4);
		pSet.add(p5);
		
		for(Point po : pSet) {
			System.out.println(po.toString());
		}
		
		
	}

}
