package learning.Strings;

import java.lang.reflect.Array;
import java.util.*;

class Solution4 {
	public int[] intersection(int[] nums1, int[] nums2) {
		int a[]=new int[nums1.length];
		int k=0;
         for(int i=0;i<nums1.length;i++) {
        	 for(int j=0;j<nums2.length;j++) {
        		 if(nums1[i]==nums2[j]) {
        			 a[k]=nums2[j];
        			 k++;
        		 }
        	 }
         }
         
         return a;
	}
}

public class First_Unique_Char {

	public static void main(String[] args) {
		Solution4 s = new Solution4();
		int l[] = { 1, 2, 4, 5 };
		int p[] = { 7, 4, 2 };
		int a[]=s.intersection(l, p);
		System.out.println(a);
	}

}
