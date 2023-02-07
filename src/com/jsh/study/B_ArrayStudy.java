package com.jsh.study;

import java.util.Scanner;

public class B_ArrayStudy {
	public void study01() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇명 입력하시겠습니까? ");
		int num = sc.nextInt();
		sc.nextLine();
		String[] note = new String[num];
		int count = 0;
		while(true) {
			System.out.println((count+1) + "번째 사람의 주민등록 번호를 입력하세요.");
			String number = sc.nextLine();
			if(number.length() != 14) {
				System.out.println("자릿수를 잘못 입력하셨습니다.");
				continue;
			}else {
				char gender = number.charAt(7);
				if(gender == '1' || gender == '2' || gender == '3' || gender == '4') {
					char[] cArr = number.toCharArray();
					for(int i = 8; i < cArr.length; i++) {
						cArr[i] = '*';
					}
					note[count] = new String(cArr);
					count++;
				}else {
					System.out.println("성별을 잘못 입력하셨습니다.");
				}
			}
			
			if(count == num) {
				break;
			}
		}
		System.out.println("Note에 저장된 주민등록 번호");
		for(int i = 0; i < note.length; i++) {
			System.out.println(note[i]);
		}
		sc.close();
		
	}
}
