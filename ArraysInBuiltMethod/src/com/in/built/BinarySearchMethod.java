package com.in.built;

import java.util.Arrays;

public class BinarySearchMethod {

	public static void main(String[] args) {
		int arr[]= {90,20,50,60,22,28};
		//binarySearch needs the array to be sorted first   
		//  {20,22,28,50,60,90}
		Arrays.sort(arr);
		
		//return the index of element where the element is needed to be inserted if not present (-index-1)
		//here 45 is not present in array bt if it present then it will be at position 3 so (-3-1 =-4) ans is =-4
		System.out.println(Arrays.binarySearch(arr, 45));
		
		//return the index of element if present in array
		System.out.println(Arrays.binarySearch(arr, 60));

	}

}
