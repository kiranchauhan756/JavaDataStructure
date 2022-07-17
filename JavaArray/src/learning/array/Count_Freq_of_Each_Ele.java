package learning.array;

import java.util.Arrays;
//how to convert an array to a string Arrays.toString()
class Solution2 {

	void countFreq(int a[]) {
		Arrays.sort(a);
		
	}

}

public class Count_Freq_of_Each_Ele {

	public static void main(String[] args) {
		int a[] = { 1, 1, 6, 9, 2, 2, 2, 4, 9, 1, 0 };
		Solution2 s = new Solution2();
		s.countFreq(a);

	}

}
