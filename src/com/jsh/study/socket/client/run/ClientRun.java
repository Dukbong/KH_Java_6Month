package com.jsh.study.socket.client.run;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.time.LocalTime;
import java.util.Scanner;

public class ClientRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Socket clientSocket = null;
		int port = 3000;
		String Host = "192.168.50.36";

		clientSocket = new Socket();
		BufferedReader br = null;
		BufferedWriter bw = null;
		LocalTime lt = null;
		StringBuffer sb = null;
		try {
			lt = LocalTime.now();
			clientSocket.connect(new InetSocketAddress(Host, port));
			br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));

			while (true) {
				sb = new StringBuffer();
				System.out.println("보낼 메시지를 작성하세요 [최대 5줄 까지 가능]");
				String sendMsg = lt + "\n";
				for (int i = 0; i < 5; i++) {
					System.out.print((i + 1) + "번째 줄 : ");
					sendMsg += sc.nextLine() + "\n";
				}
				bw.write(sendMsg + "\n");
				bw.flush();

				String result = "";

				for (int i = 0; i < 6; i++) {
					if (i != 5) {
						sb.append(br.readLine() + "\n");
					} else {
						sb.append(br.readLine());
					}
				}

				result += sb.toString();
				System.out.println("서버에서 보내온 메시지 입니다.");
				System.out.println(result);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				clientSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		sc.close();
	}

}
