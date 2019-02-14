package com.leetcode;


import org.junit.Test;

public class ContainerTest {

	@Test
	public void test() {
		Container container = new Container();
		int[] height = {1,8,6,2,5,4,8,3,7};
		System.out.println(container.maxArea(height));
	}

}
