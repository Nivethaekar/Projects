package com.leetcode;

import org.junit.Test;

public class LongestPrefixTest {

	@Test
	public void test1() {
		LongestPrefix longestPrefix = new LongestPrefix();
		String[] strs = {"flower","flew","flow"};
		System.out.println(longestPrefix.longestCommonPrefix(strs));
	}
	
	@Test
	public void test2() {
		System.out.println("flower".indexOf("flew"));
	}

}
