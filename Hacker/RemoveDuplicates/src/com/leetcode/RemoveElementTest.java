package com.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class RemoveElementTest {

	@Test
	public void test() {
		RemoveElement removeEle = new RemoveElement();
		int[] nums = {3,2,2,3};
		int length = removeEle.removeElement(nums,3);
		System.out.println("Modified Length "+ length);
		for(int i=0;i<length;i++){
			System.out.println(nums[i]);
		}
	}

}
