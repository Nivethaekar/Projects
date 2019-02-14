package com.hacker;

public class LargestAndSmallestString {
	
	    public String getSmallestAndLargest(String s, int k) {
	        String smallest = "";
	        String largest = "";
	        String[] arrange = new String[s.length()+1];

	        for(int i=0; i<s.length()-k+1;i++){
	                arrange[i] = s.substring(i,i+k);
	        }
	        
	        int size = arrange.length-k-1;

	        for(int i = 0; i < size ; i++){
	        	for(int j = i+1; j < arrange.length; j++ ){
	        		if(arrange[i].compareTo(arrange[j])>0){
	        			String temp = arrange[i];
	        			arrange[i] = arrange[j];
	        			arrange[j] = temp;
	        		}
	        	}
	        }
	        smallest = arrange[0];
	        largest = arrange[arrange.length-k-1];

	        return smallest + "\n" + largest;
	    }

	}

