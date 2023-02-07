package com.jsh.run;

import com.jsh.study.A_TicTacToe;
import com.jsh.study.B_ArrayStudy;

public class Run {
	public static void main(String[] args) {
		// TicTacToe Game Start
		try {
			A_TicTacToe.GameStart();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		// ArrayStudy
		B_ArrayStudy b = new B_ArrayStudy();
		b.study01();
	}
}
