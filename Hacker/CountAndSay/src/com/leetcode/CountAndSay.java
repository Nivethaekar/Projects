package com.leetcode;

public class CountAndSay {

    public String countAndSay(int n) {
         String[] terms = new String[30];
        terms[1] = "1";
        terms[2] = "11";
        for(int i=3;i<=n;i++){
            terms[i] = getTermFrom(terms[i-1]);
        }
         return terms[n];
    }
    
    public String getTermFrom(String prevTerm){
        int length = prevTerm.length();
        prevTerm = prevTerm + "$";
        char[] chars = prevTerm.toCharArray();
        String str = "";
        int count = 1;
        for(int j=1; j<=length;j++){
            if(chars[j-1]!=chars[j]){
            	str= str + String.valueOf(count);
            	str = str + chars[j-1];
            	count = 1;
            } 
            else{
            	count++;
            }
        }
        
        return str;
    }
    
    public void printSequence(int n){
    	for(int i=1;i<=n;i++){
    		System.out.println(countAndSay(i));
    	}
    }
}
