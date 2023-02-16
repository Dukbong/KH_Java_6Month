package com.jsh.study.q;
// Question
public class test {
	public static void main(String[] args) {

			double[] arr = new double[3]; 
			//arr[0] = new double[] {1,2,3};
			arr[0] = new Double(3); // 자동 형변환
			// 안되는 이유는 현재 arr의 index 번호에는 double이 들어가야하는데 new double[]{}시 객체가 만들어진다.
			// 이는 double 자리에 double[]을 넣는거다.
			
			double[][] arr2 = new double[3][];
			arr2[0] = new double[] {1,2,3,4};
			// 이게 되는 이유는 arr2[index]은 double[]값이 들어가는거고 알맞게 넣었기 때문이다.
			double d = 1.53;
			Double[] arr3 = new Double[3];
			arr3[0] = d; // 오토박싱으로 가능하다.
			
			// WraperClass 와 primitive(원시) 타입의 관계
			// jdk1.5부터 자동으로 서로 형변환을 해준다.
			Double wraple = new Double(3);
			System.out.println("Wrapper = " + wraple);
			
			double pri = wraple.intValue();
			System.out.println("pri = " + pri);
			double pri2 = wraple;
			System.out.println("pri2 = " + pri2);
	}
}