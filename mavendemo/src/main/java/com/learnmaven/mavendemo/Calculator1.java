package com.learnmaven.mavendemo;

public class Calculator1 {
	
	public int add (int a, int b) {
		return a+b;
	}
	public int subtract (int a, int b) {
		return a-b;
	}
	public int multiply (int a, int b) {
		return a*b;
	}
	public double devide (int a, int b) {
		if (b==0) {
		return 0.0;
	}
		return a/b;
	
	}

}
