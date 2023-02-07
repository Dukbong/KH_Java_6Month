package com.jsh.run;

import com.jsh.study.A_TicTacToe;

public class Run {
	public static void main(String[] args) {
		// TicTacToe Game Start
		try {
			A_TicTacToe.GameStart();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
