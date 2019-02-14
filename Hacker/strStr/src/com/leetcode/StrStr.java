package com.leetcode;


public class StrStr {
	public int strStr(String haystack, String needle) {
        if(needle==null||needle.isEmpty()){
            return 0;
        }
        else if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        else {
            return -1;
        }
    }
}
