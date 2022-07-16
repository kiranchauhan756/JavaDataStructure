package learning.array;

import java.util.Arrays;

//Searching an Element in 1D array And Find Median of Array 
class Solution3 {
	boolean searchEle(int a[], int item) {
		for (int x : a) {
			if (x == item)
				return true;
		}
		return false;
	}

	int findMedian(int a[]) {
		Arrays.sort(a);
		int n = a.length;
		int median = 0;
		if (n % 2 == 0) {
			median = (a[(n / 2) - 1] + a[(n / 2)])/2;
			return median;
		}
		median = a[(n / 2) - 1];
		return median;
	}
}

public class Search_In_Arr {

	public static void main(String[] args) {
		int a[] = { 8,5,7,10,15,21};
		Solution3 s = new Solution3();
		System.out.println(s.searchEle(a, 101));
		
		System.out.println(s.findMedian(a));

	}

}
