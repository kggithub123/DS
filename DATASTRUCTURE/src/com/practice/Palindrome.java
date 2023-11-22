package com.practice;

public class Palindrome {
public boolean checkPalidromOrNot(String s) {
	char[] c=s.toCharArray();
	int a=0;
	int b=c.length-1;
	while(a<b) {
		if(c[a]!=c[b]) {
			return false;
		}
		a++;
		b--;
	}return true;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Palindrome pd=new Palindrome();
String s="dad";
System.out.println(pd.checkPalidromOrNot(s));
	}

}
