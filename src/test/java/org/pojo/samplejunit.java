package org.pojo;

import org.junit.Test;

import junit.framework.Assert;

public class samplejunit {
	
	@Test
	public void tc7() {
		System.out.println("Number 7");
	}
	
	@Test
	public void tc8() {
		System.out.println("Number 8");
	}
	
	
	@Test
	public void tc9() {
		Assert.assertTrue("Verify tc9", false);
		System.out.println("Number 9");
	}

}
