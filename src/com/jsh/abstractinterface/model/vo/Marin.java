package com.jsh.abstractinterface.model.vo;

import com.jsh.abstractinterface.model.invo.Pack;

public class Marin extends Unit implements Pack	{
	private String skillName;

	public Marin() {
		super();
	}

	public Marin(String name, int hp,int fullHp ,int hit, String skillName) {
		super(name, hp, fullHp ,hit);
		// TODO Auto-generated constructor stub
		this.skillName = skillName;
	}


	public void skill() {
		System.out.println(skillName + " 사용");
		this.setHp(this.getHp()- 20);
		this.setHit(this.getHit() + 5);
	}
	
	
	
	
	

	
}
