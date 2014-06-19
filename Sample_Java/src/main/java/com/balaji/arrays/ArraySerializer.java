package com.balaji.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArraySerializer {

	static List<Integer> hashCodes = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Object[] l1 = new Object[13];
		Object[] l2 = new Object[12];
		Object[] l3 = new Object[12];
		Object[] l4 = new Object[12];
		
		for (int i = 1; i<=10 ; i++){
			l1[i-1] = new Float(i);
			l2[i-1] = Boolean.TRUE;//(i * 2);
			l3[i-1] = new Long(i * 3);
			l4[i-1] = new Double(i * 4);
		}
		
		l1[10] = l2;
		l2[10] = l1;
		l1[11] = l3;
		l1[12] = l4;

		l3[10] = l4;
		l4[10] = l1;
		
		serialize(l1);

	}
	
	static void serialize (Object[] in) {
		
		if(in == null || in.length == 0){
			return;
		}
		
		int hashCode = in.hashCode();
		hashCodes.add(hashCode);

		for (Object o : in){
			if(o != null){
				if(o instanceof Object[]){
					if(!hashCodes.contains(o.hashCode())){
						System.out.println();
						serialize((Object[])o);
					}
				}
				else
					System.out.print(String.valueOf(o) + ",");
			}
		}
	}

}
