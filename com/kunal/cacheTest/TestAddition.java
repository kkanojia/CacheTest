package com.kunal.cacheTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.kunal.implementation.Cache;

public class TestAddition {

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
	public void testCreation2() {
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

}
