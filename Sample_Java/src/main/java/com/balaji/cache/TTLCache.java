package com.balaji.cache;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TTLCache<K,V> {
	
	private Cache[] entries;
	
	private ExecutorService es = Executors.newSingleThreadExecutor();
	
	private static int DEFAULT_TTL = 30; //seconds
	
	private static int DEFAULT_CAPACITY = 100;
	
	public TTLCache(){
		this(DEFAULT_CAPACITY, DEFAULT_TTL);
	}

	public TTLCache(int size, int defaultTTL) {
		if(size<=0)
			throw new UnsupportedOperationException("Cache size must be greater than 0.");
		entries = new Cache[size];
		CacheCleaner task = new CacheCleaner();
 		es.submit(task);
	}
	
	public void put(K key, V value, int ttl){
		Cache<K,V> elem = new Cache<>(key, value, ttl);
		int length = entries.length;
		int index = hashcode(key, length);
		entries[index] = elem;
	}
		
	public V get(K key){
		int index = hashcode(key, entries.length);
		Cache cache = entries[index];
		if(cache == null)
			return null;
		if(new Date().getTime() > cache.endTime){
			entries[index] = null;
			return null;
		}
		return (V)entries[index].value;
	}
	
	private int hashcode (Object obj, int l){
		int h = obj.hashCode();
		return (h & (l - 1));
	}
	
	class Cache<K,V> {
		int ttl;
		long endTime;
		K key;
		V value;
		
		public Cache(K key, V value, int ttl){
			this.endTime = new Date().getTime() + ttl;
			this.ttl = ttl;
			this.key = key;
			this.value = value;
		}
		private int hashCode;
	}
	
	class CacheCleaner implements Runnable {
		@Override
		public void run() {
		
		while(true){
			for(int i=0;i<entries.length;i++){
				Cache<K, V> c = entries[i];
				if(c!=null && new Date().getTime() > c.endTime){
					entries[i] = null;
				}
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		} 	
	}
}
