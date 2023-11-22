package com.practice;


public class findSumOfNaturalNumbers {
	
	public static int findSum(int n) {
		return (n*(n+1))/2;
	}
	//another way to calculate findSumOfNaturalNumbers
	public static int findSum1(int n) {
		int sum=0;//here storing the sum value 
		for(int i=0;i<=n;i++) {
			sum=sum+i;//doing sum operation
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(findSumOfNaturalNumbers.findSum(3));
System.out.println(findSumOfNaturalNumbers.findSum1(3));
	}

}

