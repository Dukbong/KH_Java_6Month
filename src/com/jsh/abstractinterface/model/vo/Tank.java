package com.jsh.abstractinterface.model.vo;

public class Tank extends Unit2	{
	private String skillName;

	public Tank() {
		super();
	}

	public Tank(String name, int hp,int fullHp ,int hit, String skillName) {
		super(name, hp, fullHp ,hit);
		this.skillName = skillName;
	}


	public void skill() {
		System.out.println(skillName + " 사용");
		this.setHp(this.getHp()- 20);
		this.setHit(this.getHit() + 5);
	}
}