package com.jsh.randomchet.Server;
// ip와 port를 랜덤으로 받아 메시지 하나를 전송하고 나가버리는 이상한거 만들기
// 접속이 가능했다면 map에 저장 후 마지막에 확인
// Buffer랑 String을 비교하려고 했는데 그냥 문자열만 주구장창 더해주는건 Buffer가 성능이 좋지만
// 일반적으로 그냥 일정한 값을 줄때는 무의미한 속도차이 이다.
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ServerRun2 {
	public static Map<String, Integer> map = new HashMap<>();

	public static void main(String[] args) {
		String ads = "192.168.50.";
		int randPort = 0;
		String randIp = null;
		int i = 0;
		StringBuffer sb = new StringBuffer();
		
		long start = System.nanoTime();
		while (i < 500) {
			System.out.print("Buffer : ");
			randPort = (int) (Math.random() * 3000) + 2001;
			randIp = (int) (Math.random() * 50) + 30 + "";
			switch (randIp.length()) {
			case 1:
				show(sb.append(ads+"00"+randIp)/*.append("00"+randIp).append(randIp)*/.toString(), randPort);
				break;
			case 2:
				show(sb.append(ads+"0"+randIp)/*.append("0"+randIp).append(randIp)*/.toString(), randPort);
				break;
			case 3:
				show(sb.append(ads+randIp)/*.append(randIp)*/.toString(), randPort);
			}
			sb.delete(0, sb.length());
			i++;
		}
		long end = System.nanoTime();
		System.out.println("String으로 만드는거랑 Buffer로 만드는 거 차이 알아보기");
		i = 0;
		long start2 = System.nanoTime();
		while (i < 500) {
			System.out.print("String : ");
			randPort = (int) (Math.random() * 3000) + 2001;
			randIp = (int) (Math.random() * 50) + 30 + "";
			String result = ""; // 지속적으로 초기화 해줘야한다.
			switch (randIp.length()) {
			case 1:
				result = ads + "00" + randIp;
				show(result, randPort);
				break;
			case 2:
				result = ads + "0" + randIp;
				show(result, randPort);
				break;
			case 3:
				result = ads + randIp;
				show(result, randPort);
			}
			sb.delete(0, sb.length());
			i++;
		}
		long end2 = System.nanoTime();

		System.out.println("Buffer 최 종 시 간 : " + (end-start));
		System.out.println("String 최 종 시 간 : " + (end2-start2));
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it = set.iterator();
		System.out.println("================");
		System.out.println("접속 가능했던 ip, port");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public static void show(String ads, int i) {
		Socket socket = null;
		PrintWriter pw = null;
		try {
			socket = new Socket();
			socket.connect(new InetSocketAddress(ads, i), 5);
			pw = new PrintWriter(socket.getOutputStream());
			pw.write("깜짝 방문!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			pw.flush();
			map.put(ads, i);
		} catch (Exception e) {
			System.out.println("ip : " + ads + ", port : " + i + " Sever is close");
		} finally {
			try {
				if(pw != null) {
					pw.close();
				}
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}