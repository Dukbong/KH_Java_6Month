package com.jsh.study;

public class G_ObjectStudy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		Car c2 = null;
		Fire f = new Fire();
		c2 = f;
		test(c2);
		SuperCar s = new SuperCar();
		c = s;
		test(c);

	}
	
	static void test(Car c) {
		if(c instanceof Fire) { // A instanceof B --> A가 실제로 가르키는 객체가 B or B의 자식이냐 묻고 맞으면 true 아니면 false 많이 헷갈림
			System.out.println("true");
			
		}else {
			System.out.println("false");
		}
	}

}

class Car{
	void go() {
		System.out.println("brrrr");
	}
}

class Fire extends Car{
	void water() {
		System.out.println("water!!");
	}
}

class SuperCar extends Fire{
	void superr() {
		System.out.println("super!!");
	}
}
