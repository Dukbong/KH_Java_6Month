package com.jsh.study;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class I_SHA256 {
	public static void  main(String[] msg) {
		String test = "jang";
		try {
			System.out.println(Test.sha256(test));
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}


class Test{
	public static String sha256(String msg) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.update(msg.getBytes());
		String result = md.digest()+ "";
		return result;
	}
}
