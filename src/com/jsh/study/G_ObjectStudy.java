package com.jsh.study;

public class G_ObjectStudy {
	
	public static int check = 100; // staic 변수의 경우 모든 인스턴스들이 공유할 수있다.
	// 이유는 프로그램 시작과 동시에 메모리에 가장 먼저 할당 받기 때문이다. (static 변수, static 메서드)
	
	static int x = 10; // 1
	
	int y = 10; // 3
	
	{
		y = 30; // 4
	}
	
	static { // 2
		x = 40;
	}
	
	public G_ObjectStudy(){
		y = 20; // 5
	}
	
	public void show() {
		System.out.println("x = " + x + " y = " + y); // 예상) x = 40, y = 20
	}
	// 초기화 순서 : static 변수 초기화 후 instance 변수 초기화 실행
	// 변수 초기화 : 자동 초기화 (기본값) 후 명시적 초기화(int x = 10;) 후 초기화 블록({}, static{}) 후 생성자 초기화를 한다.
	
	public static void chang(String str) {
		str += "456";
	}
	
	public static void origin() {
		String str = "ABC123";
		System.out.println(str);
		chang(str);
		System.out.println("After str = " + str); // 결과 값은 ABC123
		// 이유는 String의 경우 불변이기때문에 change메서드에서 저렇게 변경을 하면 ABC123456이라는 문자열을 가르키는 주소값이 생기고 그게 메서드안에 있는 str변수에 저장된다.
		// 따라서 origin메서드안에 있는 str의 값은 그대로 ABC123이다.
	}
	
	// 모든 클래스의 생성자는 필수로 첫줄에서 this() or super()을 해야한다. 꼭꼭 필수
}