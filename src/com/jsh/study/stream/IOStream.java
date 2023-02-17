package com.jsh.study.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOStream {
	public long byte1(int i) throws Exception{
		long s = System.nanoTime();
		FileInputStream fis = new FileInputStream(new File("src/com/jsh/study/H_Bfs.java"));
		FileOutputStream fo = new FileOutputStream(new File("src/com/jsh/study/stream/show/Test" + i + ".txt"));
		
		int readCount = -1;
		
		while((readCount = fis.read()) != -1) {
			fo.write(readCount);
		}
		
		fis.close();
		fo.close();
		long e = System.nanoTime();
		
		
		return e-s;
	}

}