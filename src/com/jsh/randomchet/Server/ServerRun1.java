package com.jsh.randomchet.Server;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerRun1 {
	public static void main(String[] args) {
		ServerSocket sever = null;
		Socket s1 = null;
		BufferedReader br = null;
		BufferedReader txtNull = null;
		BufferedWriter bw = null;
		PrintWriter sendMsg = null;		
		String msg = null;
		String Host = "192.168.50.36";
		int port = 5000;
		try {
			sever = new ServerSocket();
			sever.bind(new InetSocketAddress(Host, port));
			System.out.println("랜덤 채팅 [클라이언트 1 대기중]");
			s1 = sever.accept();
			System.out.println("랜덤 채팅 1 입장 완료");
			System.out.println("============");
			System.out.println("당신은 " + s1.getInetAddress().getHostAddress() + "입니다.");
			// 클라이언트 1이 보낸 값을 읽어서 파일에 문자열 형태로 저장한다.
			br = new BufferedReader(new InputStreamReader(s1.getInputStream()));
			// >> 클라이언트가 보낸걸 읽고
			bw = new BufferedWriter(new FileWriter(new File("randMsg.txt")));
			// >> 읽은 값을 파일로 저장하고
			txtNull = new BufferedReader(new FileReader(new File("randMsg.txt")));
			// >> 파일을 읽는다 (비어있다 ? 클라이언트 2가 아직 메시지를 보내지 않았다 : 내용을 클라이언트 1에게 보낸다.)
			sendMsg = new PrintWriter(s1.getOutputStream());
			while(true) {
				if((msg = br.readLine())!=null) {
					bw.write(msg);
					bw.flush();
				}
				String str = "";
				if((str = txtNull.readLine()) != null) { // 파일이 비어있냐
					sendMsg.write(str); // 클라이언트 1에게 보내기.
				}	
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				sendMsg.close();
				txtNull.close();
				bw.close();
				br.close();
				s1.close();
				sever.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}