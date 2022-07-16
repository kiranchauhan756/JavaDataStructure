package learning.array;

//Finding Second Largest and Second Smallest Element itn the given array

import java.util.Arrays;
import java.util.List;

class Solution{
	void  sortArr(int a[]) {
		Arrays.sort(a);
		System.out.println("Second smallest "+a[1]);
		System.out.println("Second largest "+a[a.length-2]);
		}
}
public class Find_Second_Largest_N_Smallest {

	public static void main(String[] args) {
		int a[]= {2,9,10,-18,19,11,-1};
		Solution s=new Solution();
		s.sortArr(a);
		//Sum of List Using Java features
		List<Integer> l=Arrays.asList(10,2,9,0,-1);
		int res=l.stream().reduce(0, (c,b)->c+b);
		System.out.println(res);
	    
 	}

}
