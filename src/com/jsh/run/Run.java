package com.jsh.run;

import com.jsh.study.A_TicTacToe;



public class Run {
	
	public static void main(String[] args) {
//		H_Bfs h = new H_Bfs();
//		h.solution(new int[5][5]);
//		J_Collection j = new J_Collection();
//		j.Test();
		 // TicTacToe Game Start
		try {
			A_TicTacToe.GameStart();
		}catch(Exception e) {
			System.out.println(e);
		}
//		
//		// ArrayStudy
//		B_ArrayStudy b = new B_ArrayStudy();
//		b.study01();
//		
//		
//		// C_Singleton
//		C_Singleton s1 = C_Singleton.getInstance();
//		C_Singleton s2 = C_Singleton.getInstance();
//		
//		s1.call("A_TicTacToe.java");
//		s2.call("B_ArrayStudy.java");
//		
//		F_TwoDimensionalArray f = new F_TwoDimensionalArray();
//		f.study();
//		
//		G_ObjectStudy g = new G_ObjectStudy();
//		g.show();
	}
}


// 생성자 공부
//class parent{
//	int x;
//	int y;
//	parent(int x, int y){
//		this.x = x;
//		this.y = y;
//	}
//
//}
//
//class child extends parent{
//	int z;
//	child(int x, int y, int z){
//		super(x,y);
//		this.z = z;
//	}
//	child(){
//		
//	}
//	
//	child(int z){
//		this();
//	}
//	
//}
