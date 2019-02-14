package com.leetcode;

import java.util.Collections;

//Given n non-negative integers a1, a2, ..., an , 
//where each represents a point at coordinate (i, ai). 
//n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
//Find two lines, which together with x-axis forms a container, 
//such that the container contains the most water.

//Note: You may not slant the container and n is at least 2.
public class Container {

public int maxArea(int[] height) {
		int length = height.length;
	    int[] area = new int[length];
        if(length<2) return 0;
        
        for(int i=0;i<length;i++){
        	for(int j=1;j<length;j++){
        		area[i] = (j-i)*min(height[i],height[j]);
        	}
        }
        return maxArray(area);
    }
public int min(int n1,int n2){
	if(n1==n2) return n1;
	else if(n1<n2) return n1;
	else return n2;
}

public int maxArray(int[] area){
	int max = area[0];
	for(int i=1;i<area.length;i++){
		if(max<area[i]){
			max = area[i];
		}
	}
	return max;
}
}
