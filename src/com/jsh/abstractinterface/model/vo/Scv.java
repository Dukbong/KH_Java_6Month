package com.jsh.abstractinterface.model.vo;

import com.jsh.abstractinterface.model.invo.Pack;

public class Scv implements Pack {
	public void skill(Pack p) { // 매개변수 p에는 Pack interface를 구현한 객체만 들어올 수 있다.
		if (p instanceof Unit) { // 매개변수 p에 저장된 주소값이 가르키는 실제 객체가 Unit 또는 Unit의 자식이냐
			Unit u2 = (Unit) (p); // <==== 이건 코드상 UpCasting을 했지만 실제로는 DownCasting이 더 많다.
			while (u2.getHp() < u2.getFullHp()) {
				u2.setHp(u2.getHp() + 5);
			}
			if (u2.getHp() != u2.getFullHp()) {
				u2.setHp(u2.getFullHp());
			}
		} else {
			System.out.println("치료 대상이 아닙니다.");
		}
	}
}