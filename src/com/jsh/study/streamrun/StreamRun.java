package com.jsh.study.streamrun;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.jsh.study.stream.IOStream;
import com.jsh.study.stream.IOStream2;
import com.jsh.study.stream.ReadStream;
import com.jsh.study.stream.ReadStream2;
import com.jsh.study.stream.ReadStream3;

public class StreamRun {

	public static void main(String[] args) {
		int i = 0;
		// TODO Auto-generated method stub
		IOStream io1 = new IOStream(); // 5 1byte씩 가져오기
		IOStream2 io2 = new IOStream2(); // 1 512byte로 가져오기
		ReadStream io3 = new ReadStream(); // 4 println으로 가져오기
		ReadStream2 io4 = new ReadStream2(); // 2 BufferedWrite로 가져오기
		ReadStream3 io5 = new ReadStream3(); // 3 Queue에 넣어서 빼기
		
		Map<String, Long> map = new HashMap<>();
		StringBuffer sb = new StringBuffer();

		try {
//			for(int x = 0; x < 1000; x++) {
				map.put("byte1", io1.byte1(i++)); // 3등 >> 512byte씩 가져와서 1byte를 사용하고 511byte를 삭제하니 시간이 오래걸린다.
				map.put("byte2", io2.byte2(i++)); // 1등 >> 위에 코드의 단점을 보완하고자 byte[512] 배열을 만들어 한번에 최대 512byte를 가져올 수 있게 하여 시간 단축
				map.put("char1", io3.char1(i++)); // 2등 >> char을 읽는거지만 BufferedReader에 있는 readLine()을 통해 한줄씩 읽고 String으로 반환한다.
				// 그러기 때문에 아무리 긴 글도 한번에 String으로 저장후 println()을 통해 작성하며 시간이 오래 걸리지 않는다.
				map.put("char2", io4.char2(i++)); // char1에서 썻던 PrintWriter가 아닌
				map.put("char3", io5.char3(i++)); // 커스텀 해본거
				
				// 뭐가 빠를지 알아보려고 했으나....결론은 1byte씩 가져오는거 빼곤 사실상 무의미 하고 println보다는 BufferedWrite가 빠르다 정도이다.
				
				List<Map.Entry<String,Long>> list = new LinkedList<>(map.entrySet());
				list.sort(Map.Entry.comparingByValue()); // value기준으로 작은거부터 나온다.
				int check = 0;
				for(Map.Entry<String, Long> show : list) { // 그냥 생각해본거 >> Stack에 다 집어넣고 빼면 역순으로 나온다. 근데 굳이 그럴 필요 없다. 그냥 역순으로 정렬하는게 빠르다.
					// 집어넣다 빼면 작업이 하나더 늘어난다.
					// 근데 또 하기 귀찮다......
					System.out.println("Method::" + show.getKey() + ", RunTime::" + show.getValue());
					if(check == 1) {
						sb.append(show.getKey() + ",");
					}
					check++;
				}
				System.out.println("==========================================");
//			}
				// 커스텀이랑 bufferedWrite랑 누가누가 빠른가 알아보려고 ....했는데 그거도 다 비슷함..
			String str = sb.toString();
			String[] arr = str.split(",");
			int[] checkArr = new int[2];
			for(String st : arr) {
				if(st.equals("char3")) {
					checkArr[0] += 1;
				}else if(st.equals("char2")){
					checkArr[1] += 1;
				}
			}
			System.out.println(checkArr[0] > checkArr[1]?"Winner char3":"Winner char2");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}