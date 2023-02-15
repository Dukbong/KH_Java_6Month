package com.jsh.abstractinterface.run;

import com.jsh.abstractinterface.model.vo.Marin;
import com.jsh.abstractinterface.model.vo.Scv;
import com.jsh.abstractinterface.model.vo.Tank;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marin m = new Marin("marin", 50, 50, 5, "스팀팩");
		Tank t = new Tank("tank", 2000, 200, 50, "시저모드");
		m.skill();
		t.skill();
		System.out.println(m.getName() + " [50 / " + m.getHp() + "]");
		System.out.println(t.getName() + " [200 / " + t.getHp() + "]");
		
		Scv s = new Scv();
		s.skill(m);
		
		System.out.println(m.getName() + " [50 / " + m.getHp() + "]");
//		s.skill(t);
		System.out.println(t.getName() + " [200 / " + t.getHp() + "]");
	}

}
