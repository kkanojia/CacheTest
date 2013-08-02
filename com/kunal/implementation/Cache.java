package com.kunal.implementation;

import java.util.LinkedHashMap;

public class Cache<K,V> extends LinkedHashMap<K,V> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int capacity;
	private int hitCount =0;
	private int accessCount =0;
	
	
	public Cache(int capacity) {
		super(capacity +1, 1.1f, true);
		this.capacity = capacity;
	}
	
	@Override
	public V get(Object key) {
		
		accessCount++;
		V obj = super.get(key);
		if(obj != null){
			hitCount++;
		}
		return obj;
	}
	
	@Override
	protected boolean removeEldestEntry(java.util.Map.Entry<K,V> eldest) {
		return this.size() > capacity;
	}

	public int getAccessCount() {
		return accessCount;
	}

	
	public int getHitCount() {
		return hitCount;
	}

}
