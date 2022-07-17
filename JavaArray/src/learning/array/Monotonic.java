package learning.array;

//finding an array is monotonic increasing or decreasing or not 

import java.util.*;

class Solution5 {
	public boolean isMonotonic(int[] nums) {
		int g=1,h=1;
		int l=nums.length;
		
		for(int i=1;i<nums.length;i++) {
			if(nums[i]-nums[i-1]>0)
				g++;
			else if(nums[i]-nums[i-1]<0)
				h++;
			else {
				g++;
				h++;
			}
		}
		return  g==l || h==l;
	}
}

public class Monotonic {

	public static void main(String[] args) {
		int nums[] = {5,4,7,1};
		Solution5 s = new Solution5();
		System.out.println(s.isMonotonic(nums));
	}

}
