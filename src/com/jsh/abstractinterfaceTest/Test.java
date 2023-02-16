package com.jsh.abstractinterfaceTest;


public abstract class Test implements TestInter{
	public static void main(String[] args) {
		TestInter t = (x,y)-> x<y?x:y;
		
		System.out.println(t);
	}
}