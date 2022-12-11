package com.in.built;

public class SplitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello megha i am kiran";
		
		String p[]=s.split("");//split the string character by character
		for(String x:p)
		System.out.println(x);
		
		System.out.println("-----------------------------------------------");
		
		String p1[]=s.split(" ");//split the string by space
		for(String x:p1)
		System.out.println(x);

	}

}
