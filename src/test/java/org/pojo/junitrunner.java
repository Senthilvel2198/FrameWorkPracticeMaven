package org.pojo;

import org.junit.Ignore;
import org.junit.Test;

public class junitrunner {
	
	@Test
	public void tc4() {
		System.out.println("Number 4");
	}
	
	@Ignore
	@Test
	public void tc5() {
		System.out.println("Number 5");
	}
	
	@Test
	public void tc6() {
		System.out.println("Number 6");
	}

}
