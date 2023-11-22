package com.practice;


public class AVGSUM {
public static int findAvgSum(int[]arr) {
	int sum=0;//here storing the sum value of an arr
	for(int i:arr) {
		sum=sum+i;//doing sum operation
	}
	int avg=sum/arr.length;//finding and storing the avg value
	return avg;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[]arr={1,2,3};
 //System.out.println( AVGSUM.findAvgSum(arr));
 
	}

}
 
