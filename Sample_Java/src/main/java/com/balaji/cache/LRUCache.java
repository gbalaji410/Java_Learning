package com.balaji.cache;

import java.util.LinkedHashMap;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {
	
	private int maxEntries = 100;
	
	private LRUCache (int max){
		super(max, 1.0f, true);
		this.maxEntries = max;
	}
	
	@Override
	protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
		return size() > maxEntries;
	}
	
	public static void main(String[] args) {
		LRUCache<String, String> c = new LRUCache<>(10);
		
		for(int i=1;i<101;i++){
			c.put(String.valueOf(i), String.valueOf(i));
		}
		
		System.out.println(c.get(String.valueOf(100)));
		
	}

}
