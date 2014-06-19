package com.balaji.test;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashingSample {

	public static void main(String[] args) throws UnsupportedEncodingException {

		String ean = "123456";
//		System.out.println(ean.hashCode());
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("SHA-256");
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		md.reset();
		md.update(ean.getBytes("UTF-8"));
		byte[] bytes = md.digest();
		StringBuilder sb = new StringBuilder();
		for(byte b:bytes){
			sb.append(Integer.toHexString(0xff & b));
		}
		
		System.out.println(sb.toString());
		
//		for (int i = 1;i<=100;i++) {
//			System.out.println(i*hash(ean));
//		}
	}

//	public static int hash (String id)
//	{
//		int h = 0;
//		int len = id.length();
//		for (int i = 0; i < len; i++ )
//		{
//			byte c = (byte) id.charAt(i);
//			h = (h << 2) ^ (h >> 2) ^ c;
//		}
//		return h;
//	}
}
