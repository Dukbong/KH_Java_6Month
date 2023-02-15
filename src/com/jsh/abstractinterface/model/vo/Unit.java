package com.jsh.abstractinterface.model.vo;

public class Unit {
	private String name;
	private int hp;
	private int fullHp;
	private int hit;

	public Unit() {
		
	}
	
	public Unit(String name, int hp,int fullHp, int hit){
		this.name = name;
		this.hp = hp;
		this.hit = hit;
		this.fullHp = fullHp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getFullHp() {
		return fullHp;
	}

	public void setFullHp(int fullHp) {
		this.fullHp = fullHp;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	
	
}
