package com.jang.test;

public class test {
	void show(final String[] ma) {
		for(int i = 0; i < ma.length; i++) {
			for(int j = 0; j < ma[i].length(); j++) {
				System.out.println(ma[j].charAt(i) + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		final String[] ma = {"123","456","789"};
		
		test t = new test();
		t.show(ma);
	}
}
