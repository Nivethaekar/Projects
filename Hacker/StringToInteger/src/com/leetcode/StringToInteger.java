package com.leetcode;

public class StringToInteger {
	public int myAtoi(String str){
		StringBuilder builder = new StringBuilder();
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!=' '){
				if((str.charAt(i)=='-'||str.charAt(i)=='+')||Character.isDigit(str.charAt(i))){
					if(str.charAt(i)==' '){
						break;
					}
					else{
						builder.append(str.charAt(i));
					}
				}
				else{
					return builder.toString().isEmpty()?0:Integer.valueOf(builder.toString());
				}
			}
		}
		if(builder.toString().isEmpty()) return 0;
		if(Long.valueOf(builder.toString())<Integer.MIN_VALUE){
			return Integer.MIN_VALUE;
		}
		else if(Long.valueOf(builder.toString())>Integer.MAX_VALUE){
			return Integer.MAX_VALUE;
		}
		return Integer.valueOf(builder.toString());
	}
}
