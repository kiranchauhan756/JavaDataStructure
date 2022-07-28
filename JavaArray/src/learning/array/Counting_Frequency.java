package learning.array;

import java.util.*;

class Solution8 {
	public int frequencySort(int[] nums) {
		TreeMap<Integer, Integer> s = new TreeMap<>();
		for (int x : nums) {
			if (s.containsKey(x)) {
				s.put(x, s.get(x) + 1);
			} else {
				s.put(x, 1);
			}
		}
		int key=0;
          for(int e=0;e<nums.length/2;e++) {
        	  if(map.get(nums[e]>nums.length)) {
        		  key=nums[e];
        	  }
          }
          return key;
          
        
        	}
}

public class Counting_Frequency {

	public static void main(String[] args) {
		Solution8 s = new Solution8();
		int a[] = { 3, 3, 4 };// 1 1 2 2 2 3
		System.out.println(s.frequencySort(a));
	}

}
