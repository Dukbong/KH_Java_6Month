package com.jsh.study.stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadStream3 {
	public long char3(int i) throws Exception {
		long s = System.nanoTime();
		BufferedReader br = new BufferedReader(new FileReader("src/com/jsh/study/H_Bfs.java"));
		BufferedWriter out2 = new BufferedWriter(new FileWriter("src/com/jsh/study/stream/show/Test" + i + ".txt"));
		
		StringBuffer st = new StringBuffer();
		
		String str = null;
		
		while((str = br.readLine()) != null) {
			st.append(str);
		}
		out2.write(st.toString());
		
		br.close();
		out2.close();
		long e = System.nanoTime();
		
		return e-s;
	}
}