package com.balaji.security;

import java.util.UUID;

import javax.xml.bind.DatatypeConverter;

public class AuthorizationTest {

	public static void main(String[] args) {
		
		System.out.println(generateToken());

	}
	
	public static String generateToken() {
		UUID guid = UUID.randomUUID();
		byte[] guidByteArray = asByteArray(guid);
		return DatatypeConverter.printBase64Binary(guidByteArray);
	}
	
	private static byte[] asByteArray(UUID uuid) {

		long msb = uuid.getMostSignificantBits();
		long lsb = uuid.getLeastSignificantBits();
		byte[] buffer = new byte[16];

		for (int i = 0; i < 8; i++) {
			buffer[i] = (byte) (msb >>> 8 * (7 - i));
		}
		for (int i = 8; i < 16; i++) {
			buffer[i] = (byte) (lsb >>> 8 * (7 - i));
		}

		return buffer;

	}
}
