package com.jsh.study;

import java.util.Arrays;

public class D_ArrayStudy2 {
	
	public void Study() {
		int[] arr1 = {1,2,3,4,5,6,7};
		int[] arr2 = arr1; // 얕은 복사 >> 데이터를 복사하는 것이 아닌 주소를 복사한다.
		int[] arr3 = arr1.clone(); // 깊은 복사 >> 똑같은 길이와 데이터를 복사해온다.
		int[] arr4 = Arrays.copyOf(arr1, 8); // 깊은 복사 >> 원본보다 큰 길이로 만들 경우 외쪽부터 원본데이터를 복사한 후 나머지는 0으로 채운다.
		int[] arr5 = new int[10];
		System.arraycopy(arr1, 0, arr5, 3, arr5.length - 3); // 깊은 복사 >> 자유롭게 원본데이터를 복사해 올 수 있다.
		
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);
		System.out.println(arr4);
		System.out.println(arr5);
		// 얕은 복사시 주소 값이 같지만, 깊은 복사시 다른 주소값이 나온다.
	}
}
