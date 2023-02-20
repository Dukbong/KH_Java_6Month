package com.jsh.study.stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadStream2 {
	public long char2(int i) throws Exception {
		long s = System.nanoTime();
		BufferedReader br = new BufferedReader(new FileReader("src/com/jsh/study/H_Bfs.java"));
		BufferedWriter out2 = new BufferedWriter(new FileWriter("src/com/jsh/study/stream/show/Test" + i + ".txt"));
		
		String line = null;
		while((line = br.readLine()) != null) {
			out2.write(line);
			out2.write("\n");
		}
		br.close();
		out2.close();
		long e = System.nanoTime();
		
		return e-s;
	}
}