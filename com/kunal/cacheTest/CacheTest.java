package com.kunal.cacheTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.kunal.implementation.Cache;

public class CacheTest {

	@Test
	public void testCreation() {
		Cache myCachce = new Cache(3);
		myCachce.put(1, "Kunal");
		myCachce.put(2,"Hiren");
		myCachce.put(3, "Mitesh");
		myCachce.put(4, "Vipul");
		assertEquals("Not Equal", 3, myCachce.size(), 0);
		myCachce.get(2);
		myCachce.get(1);
		assertEquals(1, myCachce.getHitCount());
		assertEquals(2, myCachce.getAccessCount());
	}
	
	@Test
	public void testLRUFunctionality() {
		Cache<Integer,String> myCache = new Cache<Integer,String>(3);
		myCache.put(1, "Kunal");
		myCache.put(2,"Hiren");
		myCache.put(3, "Mitesh");
		myCache.put(4, "Vipul");
		assertEquals("Not Equal", 3, myCache.size(), 0);
		assertNull(myCache.get(1));
		myCache.get(2);
		myCache.get(1);
		myCache.put(5,"ASDF"); 
		assertNull(myCache.get(3));
		assertEquals("Should be ASDF", "ASDF", myCache.get(5));
		assertEquals("Should be Vipul", "Vipul", myCache.get(4));
		assertEquals("Should be Hiren", "Hiren", myCache.get(2));
		
		assertEquals(4, myCache.getHitCount());
		assertEquals(7, myCache.getAccessCount());
	}

}
