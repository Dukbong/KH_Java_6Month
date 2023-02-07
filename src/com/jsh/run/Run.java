package com.jsh.run;

import com.jsh.study.A_TicTacToe;
import com.jsh.study.B_ArrayStudy;
import com.jsh.study.C_Singleton;

public class Run {
	public static void main(String[] args) {
		// TicTacToe Game Start
//		try {
//			A_TicTacToe.GameStart();
//		}catch(Exception e) {
//			System.out.println(e);
//		}
		
		// ArrayStudy
//		B_ArrayStudy b = new B_ArrayStudy();
//		b.study01();
		
		C_Singleton s1 = C_Singleton.getInstance();
		C_Singleton s2 = C_Singleton.getInstance();
		s1.call("A_TicTacToe.java");
		s2.call("B_ArrayStudy.java");
	}
}
