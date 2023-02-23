package com.jsh.study.socket.server.run;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalTime;
import java.util.Scanner;

public class ServerRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ServerSocket serverSocket = null;
		Socket socket = null;

		int port = 3000;
		String Host = "192.168.50.36";

		BufferedReader br = null;
		BufferedWriter bw = null;

		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress(Host, port));
			System.out.println("[연결 대기중]");
			socket = serverSocket.accept();
			System.out.println("[연결 완료] >> " + socket.getInetAddress().getHostAddress());
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			LocalTime lt = null;
			StringBuffer sb = null;
			while (true) {
				lt = LocalTime.now();
				sb = new StringBuffer();
				
				String msg = "";
				while(!(msg = br.readLine()).equals("")) { 
					sb.append(msg + "\n");
				}
//				br.readLine()이 null을 만나려면 보내고 있는 스트림이 끝나야한다!!!!!
				// 이거 때문에 2틀을 고생했다.ㅋㅇ
				
				System.out.println("Client가 보낸 메시지 입니다.");
				System.out.print(sb.toString()); // client send msg

				System.out.println("보낼 메시지를 작성하세요 [최대 5줄 까지 가능]");
				String sendMsg = lt + "\n";
				for (int i = 0; i < 5; i++) {
					System.out.print((i + 1) + "번째 줄 : ");
					sendMsg += sc.nextLine() + "\n";
				}
				bw.write(sendMsg);
				bw.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				br.close();
				socket.close();
				serverSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		sc.close();
	}
}