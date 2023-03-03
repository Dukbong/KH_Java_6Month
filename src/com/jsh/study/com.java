package com.jsh.study;

import java.util.Scanner;

public class com {
	public static void main(String[] args) {
		int num = 0; 
		System.out.println("*을 출력할 라인의 수를 입력하세요>");
		Scanner scanner =  new Scanner(System.in);
		String str = scanner.nextLine(); //화면에 입력받은 수는 string 타입
		num = Integer.parseInt(str);
		
		String star = "*";
		for(int i = 0 ; i < num ; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(star);
			}
			System.out.println();
		}
		
		scanner.close();
	}
}
