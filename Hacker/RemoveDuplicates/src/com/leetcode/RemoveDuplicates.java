package com.leetcode;

//Given a sorted array nums, remove the duplicates in-place 
//such that each element appear only once and return the new length.
//Do not allocate extra space for another array, 
//you must do this by modifying the input array in-place with O(1) extra memory.
public class RemoveDuplicates {
	/*public int removeDuplicates(int[] nums) {
		int originalLength = nums.length;
		int modifiedLength = nums.length;
        for(int i=0;i<originalLength;i++){
        	if(nums[i]==nums[i+1]){
        		nums[originalLength-i]=nums[i+1];
        		modifiedLength--;
        	}
        }
        return modifiedLength;
    }*/
	
	public int removeDuplicates(int[] nums) {
	    if (nums.length == 0) return 0;
	    int i = 0;
	    for (int j = 1; j < nums.length; j++) {
	        if (nums[j] != nums[i]) {
	            i++;
	            nums[i] = nums[j];
	        }
	    }
	    return i + 1;
	}
}
