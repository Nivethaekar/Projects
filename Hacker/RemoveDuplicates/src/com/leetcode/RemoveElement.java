package com.leetcode;

public class RemoveElement {
	
public int removeElement(int[] nums, int val) {
        int i=0;
        for(int j=1;j<nums.length;j++){
        	if(nums[i]==val){
        		nums[i] = nums[j];
        		i++;
        	}
        }
        return i+1;
    }

}
