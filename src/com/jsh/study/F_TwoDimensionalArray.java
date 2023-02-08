package com.jsh.study;

import java.util.Arrays;

public class F_TwoDimensionalArray {
	public void study() {
		int[][] arr = new int[2][3]; // 기본값이 들어간다.
		// new int[x][y]에서 x는 필수지만 y는 필수가 아니다!!!
		// y는 가변적이다.
		
		/* 위 2차원 배열을 그림으로 나타낸 경우
		 * arr[0] --> arr[0][0], arr[0][1], arr[0][2]
		 * arr[1] --> arr[1][0], arr[1][1], arr[1][2]
		 * 
		 * */
		
		System.out.println(arr); // 주소값이 [[ 로 시작한다.
		System.out.println(arr[0]); // 주소값이 [ 로 시작한다.
		System.out.println(arr[0][0]); // 값이 나온다.
		
		System.out.println("arr의 길이는 " + arr.length); // 2 --> int[x][y]에서 x의 길이다.
		System.out.println("arr[1]의 길이는 " + arr[1].length); // 3
		
		// 그냥 해보는 본잡한 방법
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(i >= 1) {
					arr[i][j] = arr[i-1][j] + 5;
				}else {
					arr[i][j] = i + j;
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		int[][] arr2 = {{1,2,3},{4,5,6}}; // 선언과 초기화를 같이 해준다.
		System.out.println(Arrays.deepToString(arr2)); // 2차원 배열을 한줄로 표현해 준다.
		
		int[][] arr3 = new int[3][]; 
		System.out.println(arr3); // "[[" 주소
		System.out.println(arr3[0]); // Null
		System.out.println(arr.length); // 3
		
		try {
			System.out.println(arr[0].length); // NullPointerException 발생
		}catch(Exception e) {
			System.out.println(e);
		}
		
		for(int i = 0; i < arr3.length; i++) {
			arr3[i] = new int[i + 1];
			for(int j = 0; j < arr3[i].length; j++) {
				System.out.printf("%-5d", arr3[i][j]);
			}
			System.out.println();
		}
		/* 0
		 * 00
		 * 000
		 * */
		
	}
}