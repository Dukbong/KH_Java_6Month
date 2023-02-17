package com.jsh.study.stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.Queue;

public class ReadStream3 {
	public long char3(int i) throws Exception {
		long s = System.nanoTime();
		BufferedReader br = new BufferedReader(new FileReader("src/com/jsh/study/H_Bfs.java"));
		BufferedWriter out2 = new BufferedWriter(new FileWriter("src/com/jsh/study/stream/show/Test" + i + ".txt"));
		
		Queue<String> list = new LinkedList<>();
		String str = null;
		
		while((str = br.readLine()) != null) {
			list.add(str);
		}
		while(!list.isEmpty()) {
			out2.write(list.poll());
		}
		
		br.close();
		out2.close();
		long e = System.nanoTime();
		
		return e-s;
	}
}