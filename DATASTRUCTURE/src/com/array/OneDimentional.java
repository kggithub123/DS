package com.array;

public class OneDimentional {
public static int[] arrayDemo() {
	int[]arr=new int[5];
	arr[0]=1;
	arr[1]=3;
	arr[4]=1;
	arr[2]=6;
	arr[3]=7;
	return arr;
}
public static int[] removeEven(int[]arr) {
	int count=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2!=0) {
			count++;
		}
	}
	int[]newArr=new int[count];
	int idx=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2!=0) {
			newArr[idx]=arr[i];
			idx++;
		}
	}
	return newArr;
}
public static void reverseArray(int[]arr,int start,int end) {

	while(start<end) {
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		start++;
		end--;
	}
}
public static void printarr(int[]arr) {
	for(int i:arr) {
		System.out.println(i); 
	}
}
public static int minValues(int[]arr) {
	int min=arr[0];
	for(int i=1;i<arr.length;i++) {
		if(arr[i]<min) {
			min=arr[i];
		}
	}
	return min;
}
public int findSecondMax(int[]arr) {
	int max=Integer.MIN_VALUE;
	int secondMax=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			secondMax=max;
			max=arr[i];
		}else if(arr[i]>secondMax && arr[i]!=max){
			secondMax=arr[i];
		}
	}return secondMax;
}
public int[] reSizeArray(int[]arr) {
	int[]temp=new int[arr.length*2]; 
	for(int i=0;i<arr.length;i++) {
		temp[i]=arr[i];
	}
	return temp;
}
public int findMissingNumber(int[]arr) {
	int n=arr.length+1;
	int sum=(n*(n+1))/2;
	for(int num:arr) {
		sum=sum-num;
	}
	return sum;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//OneDimentional.printarr(OneDimentional.arrayDemo());
		OneDimentional one=new OneDimentional();
int[]arr=new int[5];
arr[0]=5;
arr[1]=4;
arr[4]=3;
arr[2]=2;
arr[3]=1;
int[]uparr=OneDimentional.removeEven(arr);
//OneDimentional.printarr(uparr);
//OneDimentional.reverseArray(arr, 0, arr.length-1);
//OneDimentional.printarr(arr);
//System.out.println(one.minValues(arr));
//System.out.println(one.findSecondMax(arr));
//OneDimentional.printarr(one.reSizeArray(arr));
System.out.println(one.findMissingNumber(arr));
	}

}
