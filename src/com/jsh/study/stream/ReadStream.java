package com.jsh.study.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class ReadStream {
	public long char1(int i) throws Exception {
		long s = System.nanoTime();
		BufferedReader br = new BufferedReader(new FileReader("src/com/jsh/study/H_Bfs.java"));
		PrintWriter out = new PrintWriter(new FileWriter("src/com/jsh/study/stream/show/Test" + i + ".txt"));
		
		String line = null;
		while((line = br.readLine()) != null) {
			out.println(line);
		}
		br.close();
		out.close();
		long e = System.nanoTime();
		
		return e-s;
	}
}