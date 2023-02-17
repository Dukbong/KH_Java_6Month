package com.jsh.study.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOStream2 {
	public long byte2(int i) throws Exception{
		long s = System.nanoTime();
		FileInputStream fis = new FileInputStream(new File("src/com/jsh/study/H_Bfs.java"));
		FileOutputStream fo = new FileOutputStream(new File("src/com/jsh/study/stream/show/Test" + i + ".txt"));
		
		int readCount = -1;
		byte[] arr = new byte[512];
		
		while((readCount = fis.read(arr)) != -1) {
			fo.write(arr, 0, readCount);
		}
		
		fis.close();
		fo.close();
		long e = System.nanoTime();
		
		
		return e-s; 
	}

}