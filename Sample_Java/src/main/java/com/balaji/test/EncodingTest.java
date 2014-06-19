package com.balaji.test;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.*;

import javax.xml.bind.DatatypeConverter;


public class EncodingTest {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = "Balaji";
		
		//Try ASCII, UTF8, Base64
		byte[] bytes = s.getBytes("UTF-32");
		System.out.println(Arrays.toString(bytes));
		System.out.println(new String(bytes, "UTF-32"));
		
		//Base 64 encode
		String printBase64Binary = DatatypeConverter.printBase64Binary(s.getBytes("UTF-8")); 
		System.out.println(printBase64Binary);
		
		//Base 64 Decode
		System.out.println(new String(DatatypeConverter.parseBase64Binary(printBase64Binary)));
		
		//URL Encoding
		String url = "http://www.test.com?m=hello,ganesan&amt=$25.00";
		String enc = URLEncoder.encode(url, "UTF-8");
		System.out.println(enc);

		System.out.println(URLDecoder.decode(enc,"UTF-8"));

	}

	

}
