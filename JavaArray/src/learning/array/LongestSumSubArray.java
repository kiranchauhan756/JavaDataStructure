package learning.array;

class Solution4 {
	void longestSum(int a[]) {
		int arr[] = new int[100];
		int l=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					arr[l]=a[i];
					l++;
				}
			}
		}
		for(int x:arr)
			System.out.println(x);

	}
}

public class LongestSumSubArray {

	public static void main(String[] args) {
		int a[] = { 2, 9, 10, -18, 19, 2, 19 };
		Solution4 s = new Solution4();
		s.longestSum(a);
	}

}
