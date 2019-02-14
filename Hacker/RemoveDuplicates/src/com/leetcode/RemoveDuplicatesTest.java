package com.leetcode;

import org.junit.Test;

public class RemoveDuplicatesTest {

	@Test
	public void test() {
		RemoveDuplicates removeDup = new RemoveDuplicates();
		int[] nums = {1,1,2,2,3,4};
		int length = removeDup.removeDuplicates(nums);
		System.out.println("Modified Length "+ length);
		for(int i=0;i<nums.length;i++){
			System.out.println(nums[i]);
		}
	}

}
