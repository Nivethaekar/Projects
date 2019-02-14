package com.leetcode;

//Given two integers dividend and divisor, 
//divide two integers without using multiplication, division and mod operator.

//Return the quotient after dividing dividend by divisor.

//The integer division should truncate toward zero.
public class Division {
	public int divide(int dividend, int divisor) {
        int quotient = 0;
        while(dividend>0 && dividend>=divisor){
            dividend = dividend - divisor;
            quotient++;
        }
        return quotient;
    }
}
