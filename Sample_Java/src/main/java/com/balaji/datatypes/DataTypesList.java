package com.balaji.datatypes;

public enum DataTypesList {
	BYTE ("8 bits, signed, -128 to 128 2^7"),
	SHORT ("16 bits, signed, -32768 to 32767 2^15"),
	INT ("32 bits, signed, -2^31 to 2^31 - 1"),
	LONG ("64 bits, signed, -2^63 to 2^63 - 1"),
	FLOAT ("32 bits, signed, -2^31 to 2^31 - 1"),
	DOUBLE ("64 bits, signed, -2^63 to 2^63 -1"),
	BOOLEAN ("True or false"),
	CHAR ("16 bits");
	
	String size;
	
	private DataTypesList (String size){
		this.size = size;
	}
}
