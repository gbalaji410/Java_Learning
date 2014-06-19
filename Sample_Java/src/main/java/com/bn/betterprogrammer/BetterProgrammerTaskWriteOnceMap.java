package com.bn.betterprogrammer;

import java.util.*;


public class BetterProgrammerTaskWriteOnceMap {

    public static class WriteOnceMap<K, V> extends HashMap<K, V> {

        public V put(K key, V value) {
            /*
             WriteOnceMap is a map that does not allow changing value for a particular key.
             It means that put() method should throw IllegalArgumentException if the key is already
             assosiated with some value in the map.

             Please implement this method to conform to the above description of WriteOnceMap.
            */
        	if(this.containsKey(key)) {
        		throw new IllegalArgumentException("Key Already Present in Map");
        	}
        	else super.put(key, value);
        	
        	return value;
        }


        public void putAll(Map<? extends K, ? extends V> m) {
            /*
             Pleaase implement this method to conform to the description of WriteOnceMap above.
             It should either
             (1) copy all of the mappings from the specified map to this map or
             (2) throw IllegalArgumentException and leave this map intact
             if the parameter already contains some keys from this map.
            */
        	for (K key : m.keySet()) {
        		if(this.containsKey(key)) {
            		throw new IllegalArgumentException("Key Already Present in Map");
            	}
        	}
        	this.putAll(m);
        }
    }
}

