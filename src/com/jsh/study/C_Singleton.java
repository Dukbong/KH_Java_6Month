package com.jsh.study;

public class C_Singleton {
	private String name;
	private int number;
	private int count;
	
	private static C_Singleton s = new C_Singleton("Duckbong", 20230207);
	
	private C_Singleton(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	public static C_Singleton getInstance() {
		if(s == null) {
			s = new C_Singleton("Duckbong", 20230207);
		}
		return s;
	}
	
	public void getInfo() {
		System.out.println(s.name);
		System.out.println(s.number);
	}
	
	public void call(String commit) {
		count++;
		System.out.println(count + "번째 Commit을 완료했습니다.");
		System.out.println("===> Commit 내용 : " + commit);
	}
}
