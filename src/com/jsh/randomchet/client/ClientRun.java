package com.jsh.randomchet.client;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket s = null;
		PrintWriter pw = null;
		try {
			s = new Socket();
			s.connect(new InetSocketAddress("192.168.50.36", 5000), 10);
			pw = new PrintWriter(s.getOutputStream());
			pw.write("깜짝 방문");
			pw.flush();
			System.out.println("ㅅㄱ");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				s.close();
				pw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
				
	}

}
