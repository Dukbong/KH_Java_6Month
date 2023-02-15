package com.jsh.study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;



public class J_Collection {
	
	public static void main(String[] args) {
		Test();
	}
	
	public static void Test() {
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 200);
		map.put("B", 100);
		map.put("C", 300);
		ArrayList<Integer> arraylist = new ArrayList<>(map.values());
		Collections.sort(arraylist);
		ListIterator<Integer> it = arraylist.listIterator();
		// list의 경우  그냥 Iterator를 사용하면 하위 버전이기 때문에 경고문이 뜬다.
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
